package com.axmf.jttest.entity;

/**
 * Created by jack on 2017/7/13.
 */

public class RecMessage {

    public String msg;

    public String type;

    public int num;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RecMessage{" +
                "msg='" + ".." + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
