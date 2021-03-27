package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.controller.model.CheckVerifyCodeParam;
import com.beiken.saas.platform.controller.model.CheckVerifyCodeResult;
import com.beiken.saas.platform.controller.model.SendVerifyCodeParam;
import com.beiken.saas.platform.controller.model.SendVerifyCodeResult;
import com.beiken.saas.platform.mapper.UserVerifyCodeMapper;
import com.beiken.saas.platform.pojo.UserVerifyCodeDO;
import com.beiken.saas.platform.pojo.UserVerifyCodeDOExample;
import com.beiken.saas.platform.utils.SmsUtils;
import com.beiken.saas.platform.utils.VerifyCodeGenerator;
import com.beiken.saas.platform.utils.model.SmsResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Api(tags = "验证码相关接口")
@Controller
@RequestMapping(value = "/sms")
public class SmsController {
    @Autowired
    private UserVerifyCodeMapper userVerifyCodeMapper;

    @ApiOperation("发送验证码")
    @RequestMapping(value = "/sendCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result<SendVerifyCodeResult> sendVerifyCode(SendVerifyCodeParam param) {
        if (StringUtils.isEmpty(param.getMobile())) {
            return Result.error("手机号不能为空", "手机号不能为空");
        }
        if (param.getUserId() == null) {
            return Result.error("用户id不能为空", "用户id不能为空");
        }
        //随机生成6位验证码
        String verifyCode = VerifyCodeGenerator.generateVerifyCode();
        //发送验证码
        if (param.getMock() != null && param.getMock() == 0) {
            SmsResult smsResult = SmsUtils.sendSmsByTemplate(param.getMobile(), verifyCode);
            if (smsResult != null && smsResult.getCode() == 0) {
                //存储到数据库
                UserVerifyCodeDO userVerifyCodeDO = new UserVerifyCodeDO();
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.MINUTE, 10);
                Date expireTime = calendar.getTime();
                userVerifyCodeDO.setSendTime(new Date());
                userVerifyCodeDO.setGmtCreate(new Date());
                userVerifyCodeDO.setGmtModified(new Date());
                userVerifyCodeDO.setExpireTime(expireTime);
                userVerifyCodeDO.setUserId(param.getUserId());
                userVerifyCodeDO.setVerifyCode(verifyCode);
                userVerifyCodeDO.setStatus(0);
                userVerifyCodeMapper.insert(userVerifyCodeDO);
            } else {
                return Result.error("发送验证码失败", "发送验证码失败");
            }
        } else {
            //存储到数据库
            UserVerifyCodeDO userVerifyCodeDO = new UserVerifyCodeDO();
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MINUTE, 10);
            Date expireTime = calendar.getTime();
            userVerifyCodeDO.setSendTime(new Date());
            userVerifyCodeDO.setGmtCreate(new Date());
            userVerifyCodeDO.setGmtModified(new Date());
            userVerifyCodeDO.setExpireTime(expireTime);
            userVerifyCodeDO.setUserId(param.getUserId());
            userVerifyCodeDO.setVerifyCode(verifyCode);
            userVerifyCodeDO.setStatus(0);
            userVerifyCodeMapper.insert(userVerifyCodeDO);
        }
        SendVerifyCodeResult result = new SendVerifyCodeResult();
        result.setVerifyCode(verifyCode);
        return Result.success(result);
    }

    @ApiOperation("检查验证码")
    @RequestMapping(value = "/checkCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Result<CheckVerifyCodeResult> checkVerifyCode(CheckVerifyCodeParam param) {

        //读取数据库，验证有效性
        UserVerifyCodeDOExample example = new UserVerifyCodeDOExample();
        example.createCriteria().andUserIdEqualTo(param.getUserId()).andVerifyCodeEqualTo(param.getVerifyCode());
        List<UserVerifyCodeDO> verifyCodeList = userVerifyCodeMapper.selectByExample(example);
        if (verifyCodeList.size() == 0) {
            return Result.error("没有验证码", "没有验证码");
        }
        UserVerifyCodeDO verifyCode = verifyCodeList.get(0);
        if (verifyCode.getStatus() != 0) {
            return Result.error("验证码状态不正确", "验证码状态不正确");
        }
        Date date = new Date();
        if (verifyCode.getExpireTime().before(date)) {
            //修改状态
            verifyCode.setStatus(2);
            verifyCode.setGmtModified(new Date());
            updateStatus(verifyCode);
            return Result.error("验证码已过期", "验证码已过期");
        }
        //修改状态
        verifyCode.setStatus(1);
        verifyCode.setGmtModified(new Date());
        updateStatus(verifyCode);
        CheckVerifyCodeResult result = new CheckVerifyCodeResult();
        result.setVerifyCode(param.getVerifyCode());
        return Result.success(result);
    }


    private int updateStatus(UserVerifyCodeDO record) {
        return userVerifyCodeMapper.updateByPrimaryKeySelective(record);
    }


}
