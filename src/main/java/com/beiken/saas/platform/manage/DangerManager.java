package com.beiken.saas.platform.manage;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.DangerQuery;
import com.beiken.saas.platform.biz.vo.DangerVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.DangerLevelEnum;
import com.beiken.saas.platform.enums.DangerStatusEnum;
import com.beiken.saas.platform.mapper.EnvMapper;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.pojo.*;
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
    @Resource
    private EnvMapper envMapper;
    @Resource
    private UserManager userManager;

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
        List<HiddenDangerDO> hiddenDangerDOS = sortOperation(hiddenDangerDOs, userId, dangerQuery.getPageNo(), dangerQuery.getPageSize());
        Set<String> set = hiddenDangerDOS.stream().map(HiddenDangerDO::getBgItemCode).collect(Collectors.toSet());
        Map<String, BgInspectItemDO> bgItemMap = bgManager.getBgItemDOByItemCode(Lists.newArrayList(set));
        for (HiddenDangerDO dangerDO : hiddenDangerDOS) {
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
            if (dangerDO.getEnvPhoto() != null) {
                List<String> evnPhotos = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getEnvPhoto());
                dangerVO.setEnvPhotoList(evnPhotos);
            }
            if (dangerDO.getBreakUserId() != null) {
                List<String> breakUserIds = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserId());
                dangerVO.setBreakUserIdList(breakUserIds);
            }
            if (dangerDO.getBreakUserName() != null) {
                List<String> breakUserNames = Splitter.on(Constants.COMMON).trimResults().omitEmptyStrings().splitToList(dangerDO.getBreakUserName());
                dangerVO.setBreakUserNameList(breakUserNames);
            }
            EnvDOExample envDOExample = new EnvDOExample();
            envDOExample.createCriteria().andDangerIdEqualTo(dangerDO.getId());
            List<EnvDO> envDOS = envMapper.selectByExample(envDOExample);
            dangerVO.setEnvList(envDOS);
            dangerVO.setDangerLevelStr(DangerLevelEnum.index(dangerDO.getDangerLevel()).getMsg());
            if (bgItemMap != null) {
                BgInspectItemDO itemDO = bgItemMap.get(dangerDO.getBgItemCode());
                if (itemDO != null) {
                    String detail = itemDO.getInspectType()
                            + Constants.LINE + itemDO.getManageType()
                            + Constants.LINE + itemDO.getSite()
                            + Constants.LINE + itemDO.getEquipment();

                    dangerVO.setBgItemDetail(detail);
                }
            }
            List<Integer> process = null;
            if (dangerDO.getIsInspect() != null && dangerDO.getIsInspect() == 1) {
                process = Constants.STATUS_MAP.get(0).get(dangerDO.getDangerLevel());
            } else {
                process = Constants.STATUS_MAP.get(dangerDO.getReportType()).get(dangerDO.getDangerLevel());
            }
            dangerVO.setProcessNum(process);
            dangerVOs.add(dangerVO);
        }
        pageBo.setItemList(dangerVOs);
        pageBo.setTotalSize(count);
        return pageBo;
    }

    public List<HiddenDangerDO> sortOperation(List<HiddenDangerDO> hiddenDangerDOs,
                              Long userId, Integer pageNo, Integer pageSize) {
        if (Objects.isNull(userId)) {
            return Collections.emptyList();
        }
        List<HiddenDangerDO> operate = Lists.newArrayList();
        List<HiddenDangerDO> nonOperate = Lists.newArrayList();
        List<HiddenDangerDO> result = Lists.newArrayList();
        UserDO userDO = userManager.getUserById(userId);
        for (HiddenDangerDO dangerDO : hiddenDangerDOs) {
            if (Constants.ONLIN_EMP.equals(userDO.getRole())) {
                return Collections.emptyList();
            }
            DangerStatusEnum statusEnum = DangerStatusEnum.index(dangerDO.getReportStatus());
            if (Constants.RIG_MANAGER.equals(userDO.getRole())) {
                switch (statusEnum) {
                    case WAIT_RESPON_PLAN:
                        operate.add(dangerDO);
                        break;
                    default:
                        nonOperate.add(dangerDO);
                }
            } else if (Constants.INSPECT_USER.equals(userDO.getRole())) {
                switch (statusEnum) {
                    case WIT_CONFIRM:
                    case WAIT_CHANGE:
                        operate.add(dangerDO);
                        break;
                    default:
                        nonOperate.add(dangerDO);
                }
            } else {
                switch (statusEnum) {
                    case WAIT_LEVEL:
                    case WAIT_ENV_PLAN:
                    case WAIT_ENV_ACCEPT:
                        operate.add(dangerDO);
                        break;
                    default:
                        nonOperate.add(dangerDO);
                }
            }
        }
        result.addAll(operate);
        result.addAll(nonOperate);
        List<HiddenDangerDO> finalResult = Lists.newArrayList();
        int start = (pageNo - 1) * pageSize;
        for (int i = start; i < result.size() && i < start + pageSize; i++) {
            HiddenDangerDO dangerDO = result.get(i);
            finalResult.add(dangerDO);
        }
        return finalResult;


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

    public Long countDangerNumByTask(String taskCode, String rigCode) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andTaskCodeEqualTo(taskCode).andRigCodeEqualTo(rigCode);
        return dangerMapper.countByExample(example);
    }

    /**
     * 根据task获取隐患数量
     *
     * @return
     */
    public Long countDangerNumByInspectUser(Long inspectUserId) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andFindUserIdEqualTo(inspectUserId);
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
    public HiddenDangerDO dangerInfoByCode(String taskCode, String bgItemCode, String rigCode, Integer reportType) {
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        HiddenDangerDOExample.Criteria criteria = example.createCriteria()
                .andTaskCodeEqualTo(taskCode)
                .andBgItemCodeEqualTo(bgItemCode)
                .andRigCodeEqualTo(rigCode);
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
        /*example.setLimitStart((dangerQuery.getPageNo() - 1) * dangerQuery.getPageSize());
        example.setCount(dangerQuery.getPageSize());*/
        String sort = "gmt_modified DESC";

        example.setOrderByClause(sort);

        HiddenDangerDOExample.Criteria criteria = example.createCriteria();
        if (userId != null && dangerQuery.getRoleType() == null) {
            dangerQuery.setRoleType(MANAGER_USER);
        }
        if (Objects.nonNull(dangerQuery.getDangerId())) {
            criteria.andIdEqualTo(dangerQuery.getDangerId());
        }
        List<Long> deptIds = null;
        if (dangerQuery.getRoleType() != null && !MANAGER_USER.equals(dangerQuery.getRoleType()) && userId != null) {
            deptIds = departManager.getDeptIdByUserId(userId);
            //criteria.andFindUserIdEqualTo(userId);
        }
        if (dangerQuery.getDeptId() != null) {
            if (deptIds == null) {
                deptIds = Lists.newArrayList();
            }
            deptIds.add(dangerQuery.getDeptId());
        }
        if (!CollectionUtils.isEmpty(deptIds)) {
            criteria.andDeptIdIn(deptIds);
        }

        if (StringUtils.isNotBlank(dangerQuery.getDangerName())) {
            criteria.andReportExtraLike("%" + dangerQuery.getDangerName() + "%");
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
