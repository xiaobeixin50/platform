package com.beiken.saas.platform.utils.wx;

public interface WeChatMPAccessTokenStorage {
    void setAccessToken(String token, int expire);

    String getAccessToken();
    
    void setJSAPITicket(String ticket, int expire);
    
    String getJSAPITicket();
}
