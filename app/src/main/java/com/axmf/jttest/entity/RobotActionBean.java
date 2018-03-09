package com.axmf.jttest.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feng on 2017/12/27.
 */

 /*"method": "start_xui",
         "args": ["grpc", "你好, 欢迎光临", "axmbehavior/hands/handshake/shakeshake"]*/
public class RobotActionBean {
    private String method;
    private List<String> args;

    public RobotActionBean(String tts, String event) {
        args = new ArrayList<>();
         method= "start_xui";
        args.add("grpc");
        args.add(tts);
        args.add(event);
    }
}
