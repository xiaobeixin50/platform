package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.UserQuery;
import com.beiken.saas.platform.biz.vo.DeptVO;
import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.SelfVO;
import com.beiken.saas.platform.biz.vo.UserVO;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.mapper.UserMapper;
import com.beiken.saas.platform.pojo.UserDO;
import com.beiken.saas.platform.pojo.UserDOExample;
import com.beiken.saas.platform.utils.MD5Util;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @ApiOperation("用户信息")
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
            if (userQuery.getUserName() != null) {
                criteria.andNameEqualTo(userQuery.getUserName());
            }
            List<UserDO> userDOs = userMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(userDOs)) {
                return Result.error("ERROR","未查询到当前用户");
            }
            UserDO userDO = userDOs.get(0);
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userDO, userVO);
            return Result.success(userVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }



    @ApiOperation("用户信息")
    @ResponseBody
    @PostMapping(value = "/login")
    public Result login(@RequestBody UserQuery userQuery) {
        try {
            if (StringUtils.isBlank(userQuery.getPassword()) ||
                    StringUtils.isBlank(userQuery.getAccountId())) {
                return Result.error("ERROR", "用户名密码不正确");
            }
            String password = MD5Util.getMD5Str(userQuery.getPassword());
            UserDOExample example = new UserDOExample();
            example.createCriteria()
                    .andAccountEqualTo(userQuery.getAccountId())
                    .andPasswordEqualTo(password);
            PageBo<UserVO> userVOPageBo = getUserVOPageBo(example);
            if (CollectionUtils.isEmpty(userVOPageBo.getItemList())){
                return Result.error("ERROR", "用户名或密码不正确");
            }
            UserVO userVO = userVOPageBo.getItemList().get(0);
            return Result.success(userVO);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("我的接口")
    @ResponseBody
    @GetMapping(value = "/self/{userId}")
    public Result self(@PathVariable Long userId) {
        try {
            //todo pbl self
            SelfVO selfVO = new SelfVO();
            selfVO.setAfterTimeTask(5L);
            selfVO.setDangerNum(10L);
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
            if (Constants.ZERO.equals(type)) {
                DeptVO deptVO1 = new DeptVO();
                deptVO1.setDeptId(1L);
                deptVO1.setDeptName("北疆油服第一公司");
                DeptVO deptVO2 = new DeptVO();
                deptVO2.setDeptId(2L);
                deptVO2.setDeptName("南疆油服第二公司");
                list.add(deptVO1);
                list.add(deptVO2);
            } else if (Constants.ONE.equals(type)){
                DeptVO deptVO1 = new DeptVO();
                UserVO userVO1 = new UserVO();
                userVO1.setId(1L);
                userVO1.setName("张三");
                UserVO userVO2 = new UserVO();
                userVO2.setId(2L);
                userVO2.setName("李四");
                deptVO1.setDeptId(5L);
                deptVO1.setDeptName("21井队");
                deptVO1.setUserVO(userVO1);
                DeptVO deptVO2 = new DeptVO();
                deptVO2.setDeptId(6L);
                deptVO2.setDeptName("22井队");
                deptVO2.setUserVO(userVO2);
                list.add(deptVO1);
                list.add(deptVO2);
            }
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
            UserVO userVO1 = new UserVO();
            userVO1.setDepId(deptId);
            userVO1.setDepName("北疆油服21井队");
            userVO1.setId(19L);
            userVO1.setRole("一线员工");
            userVO1.setName("王麻子");

            UserVO userVO2 = new UserVO();
            userVO2.setDepId(deptId);
            userVO2.setDepName("北疆油服21井队");
            userVO2.setId(20L);
            userVO2.setRole("一线员工");
            userVO2.setName("李笑笑");

            list.add(userVO1);
            list.add(userVO2);
            return Result.success(list);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
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
        }
        PageBo<UserVO> pageBo = new PageBo<>();
        pageBo.setItemList(result);
        return pageBo;
    }
}
