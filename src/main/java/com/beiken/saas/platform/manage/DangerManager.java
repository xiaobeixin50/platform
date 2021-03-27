package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.DangerLevelEnum;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.pojo.BgInspectItemDO;
import com.beiken.saas.platform.pojo.HiddenDangerDO;
import com.beiken.saas.platform.pojo.HiddenDangerDOExample;
import com.beiken.saas.platform.utils.CodeUtil;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/2
 * Time: 下午9:07
 */
@Component
public class DangerManager {

    @Resource
    private CodeUtil codeUtil;
    @Resource
    private BgManager bgManager;
    @Resource
    private TaskManager taskManager;
    @Resource
    private DepartManager departManager;

    private static final Integer MANAGER_USER = 2;


    @Resource
    private HiddenDangerMapper dangerMapper;

    public PageBo<DangerVO> listByUser(Long userId, DangerQuery dangerQuery) {
        PageBo<DangerVO> pageBo = new PageBo<>();


        List<DangerVO> dangerVOs = Lists.newArrayList();

        HiddenDangerDOExample example = buildDangerExample(userId, dangerQuery);
        if (example == null) {
            return pageBo;
        }
        long count = dangerMapper.countByExample(example);

        List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExample(example);
        Set<String> set = hiddenDangerDOs.stream().map(HiddenDangerDO::getBgItemCode).collect(Collectors.toSet());
        Map<String, BgInspectItemDO> bgItemMap = bgManager.getBgItemDOByItemCode(Lists.newArrayList(set));
        for (HiddenDangerDO dangerDO : hiddenDangerDOs) {
            DangerVO dangerVO = new DangerVO();
            BeanUtils.copyProperties(dangerDO, dangerVO);
            if (dangerDO.getPhoto() != null) {
                List<String> photoList = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getPhoto());
                dangerVO.setPhotoList(photoList);
            }
            if (dangerDO.getInspectPhoto() != null) {
                List<String> inspectPhotos = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getInspectPhoto());
                dangerVO.setInspectPhotoList(inspectPhotos);
            }
            if (dangerDO.getEvnPhoto() != null) {
                List<String> evnPhotos = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getEvnPhoto());
                dangerVO.setEvnPhotoList(evnPhotos);
            }
            if (dangerDO.getBreakUserId() != null) {
                List<String> breakUserIds = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserId());
                dangerVO.setBreakUserIdList(breakUserIds);
            }
            if (dangerDO.getBreakUserName() != null) {
                List<String> breakUserNames = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserName());
                dangerVO.setBreakUserNameList(breakUserNames);
            }
            dangerVO.setDangerLevelStr(DangerLevelEnum.index(dangerDO.getDangerLevel()).getMsg());
            BgInspectItemDO itemDO = bgItemMap.get(dangerDO.getBgItemCode());
            if (itemDO != null) {
                String detail = itemDO.getInspectType()
                        + Constants.LINE + itemDO.getManageType()
                        + Constants.LINE + itemDO.getSite()
                        + Constants.LINE + itemDO.getEquipment();

                dangerVO.setBgItemDetail(detail);
            }
            dangerVO.setProcessNum(
                    Constants.STATUS_MAP.get(dangerDO.getReportType()).get(dangerDO.getDangerLevel()));
            dangerVOs.add(dangerVO);
        }
        pageBo.setItemList(dangerVOs);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    /**
     * 根据task获取隐患数量
     *
     * @param taskCode
     * @return
     */
    public Long countDangerNumByTask(String taskCode) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode);
        return dangerMapper.countByExample(example);
    }

    /**
     * 根据task获取隐患数量
     *
     * @return
     */
    public Long countDangerNumByInspectUser(Long inspectUserId) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andInspectUserIdEqualTo(inspectUserId);
        return dangerMapper.countByExample(example);
    }

    /**
     * 通过taskcode和bgItemCode以及reportType确定唯一一个隐患
     *
     * @param taskCode
     * @param bgItemCode
     * @param reportType
     * @return
     */
    public HiddenDangerDO dangerInfoByCode(String taskCode, String bgItemCode, Integer reportType) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        HiddenDangerDOExample.Criteria criteria = example.createCriteria()
                .andTaskCodeEqualTo(taskCode)
                .andBgItemCodeEqualTo(bgItemCode);
        if (Objects.nonNull(reportType)) {
            criteria.andReportTypeEqualTo(reportType);
        }
        List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(hiddenDangerDOs)) {
            return null;
        }
        return hiddenDangerDOs.get(0);
    }

    public boolean addDanger(DangerVO dangerVO) {
        if (dangerVO == null) {
            return false;
        }
        Date now = new Date();
        HiddenDangerDO dangerDO = new HiddenDangerDO();
        dangerDO.setGmtCreate(now);
        dangerDO.setGmtModified(now);
        BeanUtils.copyProperties(dangerVO, dangerDO);
        String dangerCode = codeUtil.buildDangerCode(dangerVO.getDeptId());
        dangerDO.setDangerCode(dangerCode);
        int result = dangerMapper.insert(dangerDO);
        if (result > 0) {
            return true;
        }
        return false;
    }

    private HiddenDangerDOExample buildDangerExample(Long userId, DangerQuery dangerQuery) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.setLimitStart((dangerQuery.getPageNo() - 1) * dangerQuery.getPageSize());
        example.setCount(dangerQuery.getPageSize());
        //example.setOrderByClause("change_end_date " + dangerQuery.getSort());

        HiddenDangerDOExample.Criteria criteria = example.createCriteria();
        if (userId != null && dangerQuery.getRoleType() == null) {
            dangerQuery.setRoleType(MANAGER_USER);
        }
        if (Objects.nonNull(dangerQuery.getDangerId())) {
            criteria.andIdEqualTo(dangerQuery.getDangerId());
        }
        if (dangerQuery.getRoleType() != null && !MANAGER_USER.equals(dangerQuery.getRoleType()) && userId != null) {
            List<Long> deptIds = departManager.getDeptIdByUserId(userId);
            criteria.andDeptIdIn(deptIds);
            //criteria.andFindUserIdEqualTo(userId);
        }
        if (Objects.nonNull(dangerQuery.getReportStatus())) {
            criteria.andReportStatusEqualTo(dangerQuery.getReportStatus());
        }
        if (Objects.nonNull(dangerQuery.getDangerLevel())) {
            criteria.andDangerLevelEqualTo(dangerQuery.getDangerLevel());
        }
        if (StringUtils.isNotBlank(dangerQuery.getRigCode())) {
            criteria.andRigCodeEqualTo(dangerQuery.getRigCode());
        }
        if (StringUtils.isNotBlank(dangerQuery.getBgItemCode())) {
            criteria.andBgItemCodeEqualTo(dangerQuery.getBgItemCode());
        }
        if (Objects.nonNull(dangerQuery.getReportType())) {
            criteria.andReportTypeEqualTo(dangerQuery.getReportType());
        }

        return example;
    }


}
