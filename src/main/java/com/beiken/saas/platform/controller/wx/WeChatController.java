package com.beiken.saas.platform.controller.wx;

import com.beiken.saas.platform.biz.vo.Result;
import com.beiken.saas.platform.enums.Constants;
import com.beiken.saas.platform.utils.wx.*;
import com.beiken.saas.platform.utils.wx.msg.WeChatJSAPIConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * User: panboliang
 * Date: 21/3/30
 * Time: 下午8:45
 */
@Api(value = "/wx", description = "微信", tags = "微信")
@RestController
@RequestMapping("/wx")
public class WeChatController {

    @ApiOperation("微信参数")
    @ResponseBody
    @PostMapping(value = "/param")
    public Result wxParam(@RequestParam String url) {
        WeChatMPConfig config = new WeChatMPConfigImpl();
        WeChatMPHttpClient httpClient = new WeChatAppHttpClientImpl();
        WeChatMPAccessTokenStorage storage = new WeChatMPAccessTokenStorageImpl();
        WeChatMP weChatMP = new WeChatMP(config, httpClient, storage);
        try {
            WeChatJSAPIConfig jsConfig = weChatMP.getJSAPIConfig(url);
            return Result.success(jsConfig);
        } catch (Exception e) {
           return Result.error(Constants.ERROR, e.getMessage());
        }
    }
}
