package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.UserQuery;
import com.beiken.saas.platform.biz.vo.*;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.enums.RoleEnum;
import com.beiken.saas.platform.manage.RigManager;
import com.beiken.saas.platform.manage.TaskManager;
import com.beiken.saas.platform.mapper.DepartmentMapper;
import com.beiken.saas.platform.mapper.RigMapper;
import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.*;
import com.beiken.saas.platform.utils.MD5Util;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: panboliang
 * Date: 21/3/4
 * Time: 下午9:43
 */
@Api(value = "/user", description = "用户", tags = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private TaskManager taskManager;
    @Resource
    private RigMapper rigMapper;
    @Resource
    private RigManager rigManager;

    @ApiOperation("用户信息-个人资料接口(移动管理后台和客户端都可以用)")
    @ResponseBody
    @PostMapping(value = "/info")
    public Result<UserVO> info(@RequestBody UserQuery userQuery) {
        try {
            UserDOExample example = new UserDOExample();
            UserDOExample.Criteria criteria = example.createCriteria();
            if (userQuery.getAccountId() != null) {
                criteria.andAccountEqualTo(userQuery.getAccountId());
            }
            if (userQuery.getUserId() != null) {
                criteria.andIdEqualTo(userQuery.getUserId());
            }
//            if (userQuery.getUserName() != null) {
//                criteria.andNameEqualTo(userQuery.getUserName());
//            }
            List<UserDO> userDOs = userMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(userDOs)) {
                return Result.error(Constants.ERROR, "未查询到当前用户");
            }
            UserDO userDO = userDOs.get(0);
            Long depId = userDO.getDepId();

            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userDO, userVO);
            userVO.setRoleType(RoleEnum.index(userDO.getRole()));

            DepartmentDO departmentDO = departmentMapper.selectByPrimaryKey(depId);
            if (Objects.nonNull(departmentDO)) {
                DepartmentDOExample deptExample = new DepartmentDOExample();
                deptExample.createCriteria()
                        .andIdEqualTo(departmentDO.getParentId());
                List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(deptExample);
                if (!CollectionUtils.isEmpty(departmentDOs)) {
                    DepartmentDO parentDept = departmentDOs.get(0);
                    userVO.setParentDepId(parentDept.getId());
                    userVO.setParentDepName(parentDept.getDeptName());
                }
            }
            return Result.success(userVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("用户登录接口")
    @ResponseBody
    @PostMapping(value = "/login")
    public Result login(@RequestBody UserQuery userQuery) {
        try {
            if (StringUtils.isBlank(userQuery.getPassword()) ||
                    StringUtils.isBlank(userQuery.getAccountId())) {
                return Result.error(Constants.ERROR, "用户名密码不正确");
            }
            String password = MD5Util.getMD5Str(userQuery.getPassword());
            UserDOExample example = new UserDOExample();
            example.createCriteria()
                    .andAccountEqualTo(userQuery.getAccountId())
                    .andPasswordEqualTo(password);
            PageBo<UserVO> userVOPageBo = getUserVOPageBo(example);
            if (CollectionUtils.isEmpty(userVOPageBo.getItemList())) {
                return Result.error(Constants.ERROR, "用户名或密码不正确");
            }
            UserVO userVO = userVOPageBo.getItemList().get(0);
            userVO.setPassword(null);

            return Result.success(userVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("用户更新密码接口")
    @ResponseBody
    @PostMapping(value = "/update/pass")
    public Result passUpdate(@RequestBody UserQuery userQuery) {
        try {
            if (StringUtils.isBlank(userQuery.getPassword()) ||
                    Objects.isNull(userQuery.getUserId())) {
                return Result.error(Constants.ERROR, "用户id或密码不正确");
            }
            String password = MD5Util.getMD5Str(userQuery.getPassword());
            UserDO userDO = new UserDO();
            userDO.setPassword(password);
            userDO.setId(userQuery.getUserId());
            userMapper.updateByPrimaryKey(userDO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error(Constants.ERROR, e.getMessage());
        }
    }

    @ApiOperation("我的接口-客户端")
    @ResponseBody
    @GetMapping(value = "/self/{userId}")
    public Result self(@PathVariable Long userId) {
        try {
            SelfVO selfVO = taskManager.countTaskAndDanger(userId);
            return Result.success(selfVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("根据id或名字查询受检单位; 根据受检单位id或受检名字查询受检对象(如果不传,默认返回20条);" +
            "type:0-查询受检单位,1-查询受检对象(井队)")
    @ResponseBody
    @GetMapping(value = "/search/dept")
    public Result searchDept(String deptName, Long deptId, @RequestParam Integer type, Integer pageNo, Integer pageSize) {
        try {
            List<DeptVO> list = Lists.newArrayList();
            DepartmentDOExample example = new DepartmentDOExample();
            DepartmentDOExample.Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(deptName)) {
                criteria.andDeptNameLike(Constants.LIKE + deptName + Constants.LIKE);
            }
            if (Constants.ZERO_INT.equals(type)) {
                criteria.andLevelEqualTo(Constants.ONE_INT);
                List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(example);
                for (DepartmentDO departmentDO : departmentDOs) {
                    DeptVO deptVO = new DeptVO();
                    deptVO.setDeptId(departmentDO.getId());
                    deptVO.setDeptName(departmentDO.getDeptName());
                    list.add(deptVO);
                }
            } else if (Constants.ONE_INT.equals(type)) {
                criteria.andParentIdEqualTo(deptId);
                List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(example);
                Set<Long> deptIds = departmentDOs.stream().map(DepartmentDO::getId).collect(Collectors.toSet());
                Map<Long, List<UserVO>> map = getUserByDeptId(Lists.newArrayList(deptIds), "井队长");

                for (Map.Entry<Long, List<UserVO>> entry : map.entrySet()) {
                    for (UserVO userVO : entry.getValue()) {
                        DeptVO deptVO = new DeptVO();
                        deptVO.setDeptId(userVO.getDepId());
                        deptVO.setDeptName(userVO.getDepName());
                        deptVO.setUserVO(userVO);
                        list.add(deptVO);
                    }
                }
            }
            return Result.success(list);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("根据井队查询管理的井")
    @ResponseBody
    @GetMapping(value = "/search/rig")
    public Result searchRig(Long deptId) {
        try {
            List<String> list = rigManager.getRigByUserId(Lists.newArrayList(deptId));
            return Result.success(list);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("根据井队id查询用户.(可用在查询违章人,即查询一线员工)")
    @ResponseBody
    @GetMapping(value = "/search/user")
    public Result searchuser(Long deptId) {
        try {
            List<UserVO> list = Lists.newArrayList();
            Map<Long, List<UserVO>> map = getUserByDeptId(Lists.newArrayList(deptId), "一线员工");
            for (Map.Entry<Long, List<UserVO>> entry : map.entrySet()) {
                list.addAll(entry.getValue());
            }
            return Result.success(list);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    private Map<Long, List<UserVO>> getUserByDeptId(List<Long> deptIds, String role) {
        Map<Long, List<UserVO>> map = Maps.newHashMap();
        UserDOExample example = new UserDOExample();
        example.createCriteria()
                .andDepIdIn(deptIds)
                .andRoleEqualTo(role);
        List<UserDO> userDOs = userMapper.selectByExample(example);
        for (UserDO userDO : userDOs) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userDO, userVO);
            userVO.setPassword(null);

            if (map.containsKey(userDO.getDepId())) {
                map.get(userDO.getDepId()).add(userVO);
            } else {
                map.put(userDO.getDepId(), Lists.newArrayList(userVO));
            }
        }
        return map;
    }

    @ApiOperation("添加用户")
    @ResponseBody
    @PostMapping(value = "/add")
    public Result add(@RequestBody UserVO userVO) {
        try {
            if (StringUtils.isBlank(userVO.getPassword())) {
                userVO.setPassword("123456");
            }
            UserDO userDO = new UserDO();
            BeanUtils.copyProperties(userVO, userDO);
            String password = userDO.getPassword();
            String md5Str = MD5Util.getMD5Str(password);
            userDO.setPassword(md5Str);

            userMapper.insert(userDO);
            return Result.success();
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }


    private PageBo<UserVO> getUserVOPageBo(UserDOExample example) {
        List<UserDO> userDOs = userMapper.selectByExample(example);
        List<UserVO> result = Lists.newArrayList();
        for (UserDO userDO : userDOs) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userDO, userVO);
            result.add(userVO);
            userVO.setRoleType(RoleEnum.index(userDO.getRole()));
        }
        PageBo<UserVO> pageBo = new PageBo<>();
        pageBo.setItemList(result);
        return pageBo;
    }

    //先写这儿吧
    public UserDO getCaptUserByDeptId(Long deptId, String role) {
        UserDOExample example = new UserDOExample();
        UserDOExample.Criteria criteria = example.createCriteria()
                .andDepIdEqualTo(deptId);
        if (StringUtils.isNotBlank(role)) {
            criteria.andRoleEqualTo(role);
        }
        List<UserDO> userDOs = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userDOs)) {
            return null;
        }
        return userDOs.get(0);
    }

    //先都写这儿了...
    //管理端查询整个结构
    public Map<String, Map<String, List<DeptStructVO>>> getUserRigStruct() {
        Map<String, Map<String, List<DeptStructVO>>> resultMap = Maps.newHashMap();

        List<RigDO> rigDOs = rigMapper.selectByExample(new RigDOExample());
        Map<Long, List<RigDO>> rigDOMap = Maps.newHashMap();
        for (RigDO rigDO : rigDOs) {
            if (!rigDOMap.containsKey(rigDO.getDeptId())) {
                List<RigDO> rigDOList = Lists.newArrayList();
                rigDOList.add(rigDO);
                rigDOMap.put(rigDO.getDeptId(), rigDOList);
            } else {
                rigDOMap.get(rigDO.getDeptId()).add(rigDO);
            }
        }
        Set<Long> depIds = rigDOs.stream().map(RigDO::getDeptId).collect(Collectors.toSet());
        Set<Long> parentDepIds = rigDOs.stream().map(RigDO::getParentDeptId).collect(Collectors.toSet());
        depIds.addAll(parentDepIds);

        DepartmentDOExample deptExample = new DepartmentDOExample();
        deptExample.setOrderByClause("level");
        deptExample.createCriteria().andIdIn(Lists.newArrayList(depIds));
        List<DepartmentDO> departmentDOs = departmentMapper.selectByExample(deptExample);

        Map<Long, String> deptNameMap = departmentDOs.stream().collect(Collectors.toMap(DepartmentDO::getId, DepartmentDO::getDeptName));


        for (DepartmentDO departmentDO : departmentDOs) {
            //有个坑,上面一定要排序,后面可以改成递归
            if (!resultMap.containsKey(deptNameMap.get(departmentDO.getId()))
                    && Constants.ONE_INT.equals(departmentDO.getLevel())) {
                resultMap.put(deptNameMap.get(departmentDO.getId()), Maps.newHashMap());
            }
            if (Constants.TWO_INT.equals(departmentDO.getLevel())) {
                Map<String, List<DeptStructVO>> childResultMap = resultMap.get(deptNameMap.get(departmentDO.getParentId()));
                if (!childResultMap.containsKey(deptNameMap.get(departmentDO.getId()))) {
                    List<DeptStructVO> childList = Lists.newArrayList();

                    DeptStructVO deptStructVO = new DeptStructVO();
                    deptStructVO.setValue(deptNameMap.get(departmentDO.getId()));
                    deptStructVO.setVoList(Lists.newArrayList());

                    for (RigDO rigDO : rigDOMap.get(departmentDO.getId())) {
                        DeptStructVO child = new DeptStructVO();
                        child.setValue(rigDO.getRigCode());
                        deptStructVO.getVoList().add(child);
                    }
                    childList.add(deptStructVO);
                    childResultMap.put(deptNameMap.get(departmentDO.getId()), childList);
                } else {
                    List<DeptStructVO> list = childResultMap.get(deptNameMap.get(departmentDO.getId()));
                    DeptStructVO deptStructVO = new DeptStructVO();
                    deptStructVO.setValue(deptNameMap.get(departmentDO.getId()));
                    deptStructVO.setVoList(Lists.newArrayList());

                    for (RigDO rigDO : rigDOMap.get(departmentDO.getId())) {
                        DeptStructVO child = new DeptStructVO();
                        child.setValue(rigDO.getRigCode());
                        deptStructVO.getVoList().add(child);
                    }
                    list.add(deptStructVO);
                }
            }
        }
        return resultMap;
    }
}
