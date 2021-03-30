package com.beiken.saas.platform.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignUtils {

    private static String template = "jsapi_ticket={0}&noncestr={1}&timestamp={2}&url={3}";
    private static String appId = "ww63c142a649e710ad";
    //应用的凭证密钥(用于获取access_token):
    private static String token = "pYPyjqeQKYQn0KfI3He3AB1n99BMr1rS_183jxHg8G8";
    private static String accessTokenTemplate = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid={0}&corpsecret={1}";

    private static String ticketTemplate = "https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token={0}";

    public static JSONObject getSign(String url) throws IOException {
        String token = getAccessToken();

        String ticket = getTicket(token);
        String timestamp = String.valueOf(new Date().getTime()/1000);
        String noncestr = "123456";
        String strToSign = MessageFormat.format(template,ticket, noncestr, timestamp, url);
        String signature = DigestUtils.sha1Hex(strToSign);
        JSONObject result = new JSONObject();
        result.put("appId", appId);
        result.put("timestamp", timestamp);
        result.put("nonceStr", noncestr);
        result.put("signature", signature);
        return result;
    }

    private static String getTicket(String token) throws IOException {
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        String getUrl = MessageFormat.format(ticketTemplate, token);
        HttpGet httpGet = new HttpGet(getUrl);
        client = HttpClients.createDefault();
        response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getString("ticket");
    }

    private static String getAccessToken() throws IOException {
        CloseableHttpClient client = null;
        CloseableHttpResponse response = null;
        String getUrl = MessageFormat.format(accessTokenTemplate, appId, token);
        HttpGet httpGet = new HttpGet(getUrl);
        client = HttpClients.createDefault();
        response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getString("access_token");
    }

    public static void main(String[] args) throws IOException {
        //String bytes = "jsapi_ticket=sM4AOVdWfPE4DxkXGEs8VMCPGGVi4C3VM0P37wVUCFvkVAy_90u5h9nbSlYy3-Sl-HhTdfl2fzFy1AOcHKP7qg&noncestr=Wm3WZYTPz0wzccnW&timestamp=1414587457&url=http://mp.weixin.qq.com?params=value";
        //String result = DigestUtils.sha1Hex(bytes);
        getSign("http://www.baidu.com");
    }
}
