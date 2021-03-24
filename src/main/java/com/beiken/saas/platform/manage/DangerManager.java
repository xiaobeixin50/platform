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
import com.google.common.collect.Maps;
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

    private static final Integer INSPECT_USER = 0;

    //key->0-任务上报,1-主动上报
    public static Map<Integer, Map<Integer, List<Integer>>> STATUS_MAP = Maps.newLinkedHashMap();
    private static Map<Integer, List<Integer>> TASK_REPORT_MAP = Maps.newLinkedHashMap();
    private static Map<Integer, List<Integer>> USER_REPORT_MAP = Maps.newLinkedHashMap();

    static {
        //参考dangerStatusEnum
        TASK_REPORT_MAP.put(0, Lists.newArrayList(4, 0));
        TASK_REPORT_MAP.put(1, Lists.newArrayList(1, 3, 4, 0));
        TASK_REPORT_MAP.put(2, Lists.newArrayList(1, 3, 4, 0));
        TASK_REPORT_MAP.put(3, Lists.newArrayList(1, 2, 4, 5, 0));

        USER_REPORT_MAP.put(0, Lists.newArrayList(10, 4, 0));
        USER_REPORT_MAP.put(1, Lists.newArrayList(10, 1, 3, 4, 0));
        USER_REPORT_MAP.put(2, Lists.newArrayList(10, 1, 3, 4, 0));
        USER_REPORT_MAP.put(3, Lists.newArrayList(10, 1, 2, 4, 5, 0));

        STATUS_MAP.put(0, TASK_REPORT_MAP);
        STATUS_MAP.put(1, USER_REPORT_MAP);
    }

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
            List<String> photoList = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getPhoto());
            List<String> breakUserIds = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserId());
            List<String> breakUserNames = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserName());
            List<String> inspectPhotos = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getInspectPhoto());
            List<String> evnPhotos = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getEvnPhoto());
            dangerVO.setPhotoList(photoList);
            dangerVO.setBreakUserIdList(breakUserIds);
            dangerVO.setBreakUserNameList(breakUserNames);
            dangerVO.setInspectPhotoList(inspectPhotos);
            dangerVO.setEvnPhotoList(evnPhotos);
            dangerVO.setBreakUserNameList(breakUserNames);
            dangerVO.setDangerLevelStr(DangerLevelEnum.index(dangerDO.getDangerLevel()).getMsg());
            BgInspectItemDO itemDO = bgItemMap.get(dangerDO.getBgItemCode());
            String detail = itemDO.getInspectType()
                    + Constants.LINE + itemDO.getManageType()
                    + Constants.LINE + itemDO.getSite()
                    + Constants.LINE + itemDO.getEquipment();
            dangerVO.setBgItemDetail(detail);

            dangerVO.setProcessNum(
                    STATUS_MAP.get(dangerDO.getReportType()).get(dangerDO.getReportStatus()));
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
        List<HiddenDangerDO> hiddenDangerDOs = dangerMapper.selectByExampleWithBLOBs(example);
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
            return null;
        }
        if (Objects.nonNull(dangerQuery.getDangerId())) {
            criteria.andIdEqualTo(dangerQuery.getDangerId());
        }
        if (dangerQuery.getRoleType() != null) {
            if (INSPECT_USER.equals(dangerQuery.getRoleType())) {
                criteria.andFindUserIdEqualTo(userId);
            } else {
                criteria.andResponsibilityUserIdEqualTo(userId);
            }
        }
        if (Objects.nonNull(dangerQuery.getReportStatus())) {
            criteria.andReportStatusEqualTo(dangerQuery.getReportStatus());
        }
        if (Objects.nonNull(dangerQuery.getDangerLevel())) {
            criteria.andDangerLevelEqualTo(dangerQuery.getDangerLevel());
        }
        if (Objects.nonNull(dangerQuery.getRigCode())) {
            criteria.andRigCodeEqualTo(dangerQuery.getRigCode());
        }
        if (Objects.nonNull(dangerQuery.getBgItemCode())) {
            criteria.andBgItemCodeEqualTo(dangerQuery.getBgItemCode());
        }
        if (Objects.nonNull(dangerQuery.getReportType())) {
            criteria.andReportTypeEqualTo(dangerQuery.getReportType());
        }

        return example;
    }


}
