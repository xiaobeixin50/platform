package com.beiken.saas.platform.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.beiken.saas.platform.utils.model.SmsResult;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class SmsUtils {

    public static SmsResult sendSmsByTemplate(String mobile, String verifyCode) {
        try {
            CloseableHttpClient client = null;
            CloseableHttpResponse response = null;
            try {
                List<BasicNameValuePair> formparams = new ArrayList<>();
                formparams.add(new BasicNameValuePair("Account","13051499947"));
                formparams.add(new BasicNameValuePair("Pwd","c930876da89773867226dfb8f"));
                formparams.add(new BasicNameValuePair("Content",verifyCode));
                formparams.add(new BasicNameValuePair("TemplateId","196274"));
                formparams.add(new BasicNameValuePair("Mobile",mobile));
                formparams.add(new BasicNameValuePair("SignId","401610"));
                HttpPost httpPost = new HttpPost("http://api.feige.ee/SmsService/Template");
                httpPost.setEntity(new UrlEncodedFormEntity(formparams,"UTF-8"));
                client = HttpClients.createDefault();
                response = client.execute(httpPost);
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity);
                SmsResult smsResult = JSONObject.parseObject(result, SmsResult.class);
                System.out.println(result);
                return smsResult;
            } finally {
                if (response != null) {
                    response.close();
                }
                if (client != null) {
                    client.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
