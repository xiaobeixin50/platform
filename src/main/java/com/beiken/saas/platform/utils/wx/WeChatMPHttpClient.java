package com.beiken.saas.platform.utils.wx;

public interface WeChatMPHttpClient {
    String get(String host, int port, String schema, String uri);

    String post(String host, int port, String schema, String uri, String body);
}
