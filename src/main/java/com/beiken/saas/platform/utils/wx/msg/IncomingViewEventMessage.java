package com.beiken.saas.platform.utils.wx.msg;

public class IncomingViewEventMessage extends EventMessage {

    private String event;
    private String eventKey;

    @Override
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

}
