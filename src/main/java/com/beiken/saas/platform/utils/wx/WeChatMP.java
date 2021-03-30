package com.beiken.saas.platform.utils.wx;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.beiken.saas.platform.utils.wx.msg.WeChatJSAPIConfig;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;
import java.util.Arrays;

public class WeChatMP {
    public static final String WECHAT_MP_WEB_SCOPE_BASE = "snsapi_base";
    public static final String WECHAT_MP_WEB_SCOPE_USERINFO = "snsapi_userinfo";

    public static final String WECHAT_MP_WEB_LANG_ZHCN = "zh_CN";
    public static final String WECHAT_MP_WEB_LANG_ZHTW = "zh_TW";
    public static final String WECHAT_MP_WEB_LANG_EN = "en";

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WeChatMP.class);
    private final WeChatMPConfig config;
    private final WeChatMPHttpClient httpClient;
    private final WeChatMPAccessTokenStorage atStorage;
    private final byte[] appIdBytes;
    private final byte[] aesKeyBytes;

    public WeChatMP(WeChatMPConfig config, WeChatMPHttpClient httpClient,
                    WeChatMPAccessTokenStorage atStorage) {
        this.config = config;
        this.httpClient = httpClient;
        this.atStorage = atStorage;

        this.appIdBytes = config.getAppId().getBytes(Charset.forName("utf-8"));
        if (config.getAESKey() != null) {
            this.aesKeyBytes = DatatypeConverter.parseBase64Binary(config.getAESKey() + "=");
        } else {
            this.aesKeyBytes = null;
        }
    }

    public String getAccessToken() throws JSONException {
        String token = atStorage.getAccessToken();
        if (token == null) {
            String ret = httpClient.get(
                    "qyapi.weixin.qq.com",
                    443,
                    "https",
                    "cgi-bin/gettoken?grant_type=client_credential&corpid=" + config.getAppId() + "&corpsecret="
                            + config.getAppSecret());
            JSONObject json = JSONObject.parseObject(ret);
            token = json.getString("access_token");
            atStorage.setAccessToken(token, json.getInteger("expires_in"));
        }
        return token;
    }

    private String sign(int timestamp, String nonce, String msg) throws Exception {
        String[] verify = new String[]{config.getToken(), String.valueOf(timestamp), nonce, msg};
        Arrays.sort(verify);
        return WeChatUtils.sha1hex(verify[0] + verify[1] + verify[2] + verify[3]);
    }


    public String getJSAPITicket() throws JSONException {
        String ticket = atStorage.getJSAPITicket();
        if (ticket == null) {
            String ret = httpClient.get("qyapi.weixin.qq.com", 443, "https", "/cgi-bin/get_jsapi_ticket?access_token="
                    + getAccessToken());
            JSONObject json = JSONObject.parseObject(ret);
            ticket = json.getString("ticket");
            atStorage.setJSAPITicket(ticket, json.getInteger("expires_in"));
        }
        return ticket;
    }

    public WeChatJSAPIConfig getJSAPIConfig(final String url) throws Exception {
        String ticket = getJSAPITicket();
        String nonce = WeChatUtils.nonce();
        int timestamp = WeChatUtils.now();
        String signature = WeChatUtils.sha1hex("jsapi_ticket=" + ticket + "&noncestr=" + nonce + "&timestamp="
                + timestamp + "&url=" + url);

        WeChatJSAPIConfig ret = new WeChatJSAPIConfig();
        ret.setAppId(config.getAppId());
        ret.setNonce(nonce);
        ret.setTimestamp(timestamp);
        ret.setSignature(signature);
        return ret;
    }
}
