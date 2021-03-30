package com.beiken.saas.platform.utils.wx;


import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by panboliang on 16/5/12.
 */
public class WeChatAppHttpClientImpl implements WeChatMPHttpClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(WeChatAppHttpClientImpl.class);

    private static WeChatAppHttpClientImpl instance = new WeChatAppHttpClientImpl();

    public WeChatAppHttpClientImpl() {
    }

    public static WeChatAppHttpClientImpl getInstance() {
        return instance;
    }

    private HttpClient client = HttpClients.createDefault();

    @Override
    public String post(String host, int port, String schema, String uri, String body) {
        try {
            HttpPost post = new HttpPost(uri);
            post.setEntity(new StringEntity(body));
            HttpResponse execute;
            execute = client.execute(new HttpHost(host, port, schema), post);
            return response(execute);
        } catch (ClientProtocolException e) {
            LOGGER.error("can not post error!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            LOGGER.error("post io exception!");
            throw new RuntimeException(e);
        }
    }

    @Override
    public String get(String host, int port, String schema, String uri) {
        HttpGet get = new HttpGet(uri);
        HttpResponse execute;
        try {
            execute = client.execute(new HttpHost(host, port, schema), get);
            return response(execute);
        } catch (ClientProtocolException e) {
            LOGGER.error("can not get error!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            LOGGER.error("get io exception!");
            throw new RuntimeException(e);
        }
    }

    public String get(String uri) {
        HttpGet get = new HttpGet(uri);
        HttpResponse execute;
        try {
            execute = client.execute(get);
            return response(execute);
        } catch (ClientProtocolException e) {
            LOGGER.error("can not get error!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            LOGGER.error("get io exception!");
            throw new RuntimeException(e);
        }
    }

    private String response(HttpResponse response) throws IllegalStateException, IOException {
        StringBuilder builder = new StringBuilder();
        InputStream content = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(content));
        String line = reader.readLine();
        while (line != null) {
            builder.append(line);
            line = reader.readLine();
        }
        return builder.toString();
    }
}
