package com.beiken.saas.platform.controller;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.controller.model.CheckVerifyCodeParam;
import com.beiken.saas.platform.controller.model.CheckVerifyCodeResult;
import com.beiken.saas.platform.controller.model.SendVerifyCodeParam;
import com.beiken.saas.platform.controller.model.SendVerifyCodeResult;
import com.beiken.saas.platform.utils.SmsUtils;
import com.beiken.saas.platform.utils.VerifyCodeGenerator;
import com.beiken.saas.platform.utils.model.SmsResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Api(tags = "验证码相关接口")
@Controller
@RequestMapping(value = "/quickstudio/spi")
public class SmsController {

    @ApiOperation("发送验证码")
    @RequestMapping(value = "/sendVerifyCode", method = RequestMethod.POST)
    public @ResponseBody
    Result<SendVerifyCodeResult> sendVerifyCode(@RequestBody SendVerifyCodeParam param) {

        //随机生成6位验证码
        String verifyCode = VerifyCodeGenerator.generateVerifyCode();
        //发送验证码
        if(param.getMock() == 0){
            SmsResult smsResult = SmsUtils.sendSmsByTemplate(param.getMobile(), verifyCode);
            if(smsResult != null && smsResult.getCode() == 0){
                //存储到数据库
            }else{
                return Result.error("发送验证码失败","发送验证码失败");
            }
        }
        SendVerifyCodeResult result = new SendVerifyCodeResult();
        result.setVerifyCode(verifyCode);
        return Result.success(result);
    }

    @ApiOperation("检查验证码")
    @RequestMapping(value = "/checkVerifyCode", method = RequestMethod.POST)
    public @ResponseBody
    Result<CheckVerifyCodeResult> checkVerifyCode(@RequestBody CheckVerifyCodeParam param) {

        //读取数据库，验证有效性

        return null;
    }




}
