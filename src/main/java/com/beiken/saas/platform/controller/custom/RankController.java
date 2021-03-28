package com.beiken.saas.platform.controller.custom;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.vo.RankVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.UserVO;
import com.beiken.saas.platform.mapper.HiddenDangerMapper;
import com.beiken.saas.platform.mapper.RigMapper;
import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.utils.DatesUtils;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/18
 * Time: 下午7:53
 */
@Api(value = "/rank", description = "排行榜", tags = "排行榜接口")
@RestController
@RequestMapping("/rank")
public class RankController {
    @Autowired
    private HiddenDangerMapper hiddenDangerMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RigMapper rigMapper;

    @ApiOperation("监理上传隐患排名")
    @ResponseBody
    @GetMapping(value = "/report")
    @ApiImplicitParams({@ApiImplicitParam(name = "time", value = "时间范围,0-周,1-月,2-年", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "roleName", value = "角色名(井队长/监理)", required = true, dataType = "String")
            , @ApiImplicitParam(name = "pageNo", value = "pageNo", required = false, dataType = "Integer")
            , @ApiImplicitParam(name = "pageSize", value = "pageSize", required = false, dataType = "Integer")})
    public Result rankReportDanger(@RequestParam Integer time, @RequestParam String roleName, @RequestParam Integer pageNo, @RequestParam Integer pageSize) {
        if (pageNo == null) {
            pageNo = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        PageBo<RankVO> rankList = getRankList(time, roleName, pageNo, pageSize);
        return Result.success(rankList);
//        PageBo<RankVO> page = new PageBo();
//        page.setTotalSize(3L);
//        List<RankVO> rankVOList = Lists.newArrayList();
//        if (roleName.equals("井队长")) {
//            RankVO rankVO1 = new RankVO();
//            UserVO userVO1 = new UserVO();
//            userVO1.setName("张三");
//            userVO1.setDepId(1L);
//            userVO1.setDepName("北疆油服第21井队");
//            rankVO1.setRankNo(1L);
//            rankVO1.setDangerNum(20L);
//            rankVO1.setUserVO(userVO1);
//
//            RankVO rankVO2 = new RankVO();
//            UserVO userVO2 = new UserVO();
//            userVO2.setName("李四");
//            userVO2.setDepId(2L);
//            userVO2.setDepName("北疆油服第21井队");
//            rankVO2.setRankNo(2L);
//            rankVO2.setDangerNum(10L);
//            rankVO2.setUserVO(userVO2);
//
//            RankVO rankVO3 = new RankVO();
//            UserVO userVO3 = new UserVO();
//            userVO3.setName("李四");
//            userVO3.setDepId(1L);
//            userVO3.setDepName("北疆油服第21井队");
//            rankVO3.setRankNo(3L);
//            rankVO3.setDangerNum(2L);
//            rankVO3.setUserVO(userVO3);
//
//            rankVOList.add(rankVO1);
//            rankVOList.add(rankVO2);
//            rankVOList.add(rankVO3);
//        } else if (roleName.equals("监理")) {
//
//            RankVO rankVO1 = new RankVO();
//            UserVO userVO1 = new UserVO();
//            userVO1.setName("张三");
//            userVO1.setDepId(1L);
//            userVO1.setDepName("监理");
//            rankVO1.setRankNo(1L);
//            rankVO1.setDangerNum(50L);
//            rankVO1.setManageRigNum(5L);
//            rankVO1.setUserVO(userVO1);
//
//            RankVO rankVO2 = new RankVO();
//            UserVO userVO2 = new UserVO();
//            userVO2.setName("李四");
//            userVO2.setDepId(2L);
//            userVO2.setDepName("监理");
//            rankVO2.setRankNo(2L);
//            rankVO2.setDangerNum(30L);
//            rankVO2.setManageRigNum(3L);
//            rankVO2.setUserVO(userVO2);
//
//            RankVO rankVO3 = new RankVO();
//            UserVO userVO3 = new UserVO();
//            userVO3.setName("李四");
//            userVO3.setDepId(2L);
//            userVO3.setDepName("监理");
//            rankVO3.setRankNo(3L);
//            rankVO3.setDangerNum(20L);
//            rankVO3.setManageRigNum(2L);
//            rankVO3.setUserVO(userVO3);
//
//            rankVOList.add(rankVO1);
//            rankVOList.add(rankVO2);
//            rankVOList.add(rankVO3);
//        }
//        page.setItemList(rankVOList);
//        return Result.success(page);
    }

    private PageBo<RankVO> getRankList(Integer time, String roleName, int pageNo, int pageSize) {
        PageBo<RankVO> result = new PageBo<>();
        Date startTime = null;
        Date endTime = null;
        switch (time) {
            case 0:
                //周
                startTime = DatesUtils.getBeginDayOfWeek();
                endTime = DatesUtils.getEndDayOfWeek();
                break;
            case 1:
                //月
                startTime = DatesUtils.getBeginDayOfMonth();
                endTime = DatesUtils.getEndDayOfMonth();
                break;
            case 2:
                //年
                startTime = DatesUtils.getBeginDayOfYear();
                endTime = DatesUtils.getEndDayOfYear();
                break;
        }
        List<RankVO> rankList = new ArrayList<>();
        if (roleName.equals("监理")) {
            rankList = getUploadRankList(startTime, endTime);
        } else {
            //如果是井队长
            rankList = getResolvedRankList(startTime, endTime);
        }
        //TODO:没有传入pagesize和pageNo
        //这里需要截取一下list
        result.setTotalSize(new Long(rankList.size()));
        int startIndex = (pageNo - 1) * pageSize;
        int endIndex = pageNo * pageSize - 1;
        if(endIndex >= rankList.size()){
            endIndex = rankList.size();
        }
        result.setItemList(rankList.subList(startIndex, endIndex));
        int totalPage = 0;
        if (rankList.size() % pageSize == 0) {
            totalPage = rankList.size() / pageSize;
        } else {
            totalPage = rankList.size() / pageSize + 1;
        }
        result.setTotalPage(new Long(totalPage));
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        return result;
    }

    /**
     * 计算上传隐患排行榜
     *
     * @param startTime
     * @param endTime
     * @return
     */
    private List<RankVO> getUploadRankList(Date startTime, Date endTime) {
        //查询所有上传隐患
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        example.createCriteria().andReportTimeBetween(startTime, endTime);
        List<HiddenDangerDO> hiddenDangerDOS = hiddenDangerMapper.selectByExample(example);
        if (hiddenDangerDOS.size() == 0) {
            List<RankVO> result = new ArrayList<>();
            return result;
        }
        //按照findUserId分组
        Map<Long, Long> groupResult = hiddenDangerDOS.stream().collect(Collectors.groupingBy(HiddenDangerDO::getFindUserId, Collectors.counting()));
        //获取所有人的信息
        List<Long> userIds = groupResult.keySet().stream().collect(Collectors.toList());
        UserDOExample userExample = new UserDOExample();
        userExample.createCriteria().andIdIn(userIds);
        List<UserDO> userDOS = userMapper.selectByExample(userExample);
        Map<Long, UserDO> userMap = userDOS.stream().collect(Collectors.toMap(UserDO::getId, item -> item));
        List<Long> depIds = userDOS.stream().map(UserDO::getDepId).collect(Collectors.toList());
        //获取管辖井队数量
        RigDOExample rigExample = new RigDOExample();
        rigExample.createCriteria().andDeptIdIn(depIds);
        List<RigDO> rigDOS = rigMapper.selectByExample(rigExample);
        Map<Long, Long> rigGroupResult = rigDOS.stream().collect(Collectors.groupingBy(RigDO::getDeptId, Collectors.counting()));
        //组装结果
        List<RankVO> collect = userIds.stream().map(userId -> {
            RankVO rankVO = new RankVO();
            rankVO.setDangerNum(groupResult.get(userId));
            UserDO user = userMap.get(userId);
            rankVO.setManageRigNum(rigGroupResult.get(user.getDepId()) == null ? 0 : rigGroupResult.get(user.getDepId()));
            UserDO userDO = userMap.get(userId);
            UserVO userVO = convertUserDO(userDO);
            rankVO.setUserVO(userVO);
            return rankVO;
        }).collect(Collectors.toList());

        //排序并设置rankNo
        collect.sort(Comparator.comparingLong(RankVO::getDangerNum).reversed());
        int rank = 1;
        for (RankVO rankVO : collect) {
            rankVO.setRankNo(new Long(rank++));
        }

        return collect;
    }

    private UserVO convertUserDO(UserDO userDO) {
        BeanCopier copier = BeanCopier.create(UserDO.class, UserVO.class, false);
        UserVO userVO = new UserVO();
        copier.copy(userDO, userVO, null);
        return userVO;
    }

    /**
     * 计算解决隐患排行榜
     *
     * @param startTime
     * @param endTime
     * @return
     */
    private List<RankVO> getResolvedRankList(Date startTime, Date endTime) {
        //查询所有解决的隐患
        HiddenDangerDOExample example = new HiddenDangerDOExample();
        //TODO:reportStatus为1表示解决？
        example.createCriteria().andReportTimeBetween(startTime, endTime).andReportStatusEqualTo(1);
        List<HiddenDangerDO> hiddenDangerDOS = hiddenDangerMapper.selectByExample(example);
        if (hiddenDangerDOS.size() == 0) {
            List<RankVO> result = new ArrayList<>();
            return result;
        }
        //TODO:按照 解决的用户id 分组
        Map<Long, Long> groupResult = hiddenDangerDOS.stream().collect(Collectors.groupingBy(HiddenDangerDO::getFindUserId, Collectors.counting()));
        //获取所有人的信息,用户名和部门名称
        List<Long> userIds = groupResult.keySet().stream().collect(Collectors.toList());
        UserDOExample userExample = new UserDOExample();
        userExample.createCriteria().andIdIn(userIds);
        List<UserDO> userDOS = userMapper.selectByExample(userExample);
        Map<Long, UserDO> userMap = userDOS.stream().collect(Collectors.toMap(UserDO::getId, item -> item));
        //组装结果
        List<RankVO> collect = userIds.stream().map(userId -> {
            RankVO rankVO = new RankVO();
            rankVO.setDangerNum(groupResult.get(userId));
            rankVO.setManageRigNum(0L);
            UserDO userDO = userMap.get(userId);
            UserVO userVO = convertUserDO(userDO);
            rankVO.setUserVO(userVO);
            return rankVO;
        }).collect(Collectors.toList());

        //排序并设置rankNo
        collect.sort(Comparator.comparingLong(RankVO::getDangerNum).reversed());
        int rank = 1;
        for (RankVO rankVO : collect) {
            rankVO.setRankNo(new Long(rank++));
        }

        return collect;
    }

}
