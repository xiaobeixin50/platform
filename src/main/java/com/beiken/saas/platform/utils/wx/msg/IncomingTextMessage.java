package com.beiken.saas.platform.utils.wx.msg;

public class IncomingTextMessage extends TextMessage {

    private long msgId;

    public long getMsgId() {
        return this.msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }
}
