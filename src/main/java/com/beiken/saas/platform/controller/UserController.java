package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.biz.vo.UserVO;
import com.beiken.saas.platform.entity.User;
import com.beiken.saas.platform.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author xiaobeixin
 * @since 2020-11-21 23:50:21
 */
@Api(value = "/user", description = "用户相关接口", tags = "用户管理")
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过userId搜索用户信息")
    @GetMapping("selectOne")
    public Result<User> selectOne(Long id) {
        return Result.success(this.userService.queryById(id));
    }

    @ApiOperation("用户登录")
    @GetMapping("login")
    public Result<UserVO> login(String account, String password) {
        User user =  this.userService.login(account, password);
        if(user == null){
            return Result.failed("用户名不存在或密码不正确", "INVALID_USER");
        }else{
            BeanCopier copier = BeanCopier.create(User.class, UserVO.class, false);
            UserVO userVO = new UserVO();
            copier.copy(user, userVO, null);
            return Result.success(userVO);
        }
    }


}