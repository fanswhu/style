package com.axmf.jttest.entity;

/**
 * Created by feng on 2017/11/30.
 */

public class ButtonInfo {
    private String bgUrl;
    private String text;
    private String goMessage;

    public ButtonInfo(String bgUrl, String text, String goMessage) {
        this.bgUrl = bgUrl;
        this.text = text;
        this.goMessage = goMessage;
    }

    public String getBgUrl() {
        return bgUrl;
    }

    public void setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGoMessage() {
        return goMessage;
    }

    public void setGoMessage(String goMessage) {
        this.goMessage = goMessage;
    }
}
