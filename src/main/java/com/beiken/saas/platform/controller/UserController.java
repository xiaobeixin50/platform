package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.bo.PageBo;
import com.beiken.saas.platform.biz.query.UserQuery;
import com.beiken.saas.platform.biz.vo.Result;
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
    @GetMapping(value = "/info")
    public Result<PageBo<UserVO>> info(UserQuery userQuery) {
        try {
            UserDOExample example = new UserDOExample();
            example.createCriteria()
                    .andAccountEqualTo(userQuery.getAccountId())
                    .andIdEqualTo(userQuery.getUserId())
                    .andNameLike(Constants.LIKE + userQuery.getUserName() + Constants.LIKE);
            PageBo<UserVO> pageBo = getUserVOPageBo(example);
            return Result.success(pageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }



    @ApiOperation("用户信息")
    @ResponseBody
    @PostMapping(value = "/login")
    public Result login(UserQuery userQuery) {
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
            return Result.success(userVOPageBo);
        } catch (Exception e) {
            //log.error("list error", e);
            return Result.error("ERROR", e.getMessage());
        }
    }

    @ApiOperation("添加用户")
    @ResponseBody
    @PostMapping(value = "/add")
    public Result add(UserVO userVO) {
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
