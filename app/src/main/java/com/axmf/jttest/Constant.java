package com.axmf.jttest;

/**
 * Created by feng on 2017/11/28.
 */

public class Constant {
    //捷通deviceId
    public  static  final String DEVICE_ID = "pepper001";
    //普通问答
    public  static  final String COMMON_QA = "1";
    //首页广告
    public  static  final String AD_QA = "2";
    //首页引导
    public  static  final String GUIDE_QA = "3";
    /**
     * zeromq的IP地址
     */
    public static String ZmqAdress = "tcp://198.18.0.1:5583";
    //public static String ZmqAdress = "tcp://198.18.0.1:5581";
    //public static String ZmqAdress = "tcp://192.168.43.134:5583";


    /**
     * 讯飞内网的ip地址
     *
     *"ZmqAdress": "tcp://198.18.0.1:5583",
     *"ResultAdress": "tcp://198.18.0.1:5581",
     *"XunfeiAdress": "11.168.186.109:1028/iat",
     *"XunfeiAppid":"ifly0010"
     */


    //public static String XunfeiAdress = "128.128.112.128:1028/iat";
    //public static String XunfeiAdress = "11.168.186.109:1028/iat";

    public static String XunfeiAdress = "128.128.96.234:1028/iat";

    /*{
        "ZmqAdress":  "tcp://198.18.0.1:5583",
            "ResultAdress":  "tcp://198.18.0.1:5581",
            "XunfeiAdress":  "11.168.186.109:1028/iat",
            "XunfeiAppid":"ifly0010"
    }*/
    /**
     * 讯飞内网的appId
     */
    public static String XunfeiAppid = "pprbt000";
    //public static String XunfeiAppid = "ifly0010";

    /**
     * 开始录音状态
     */
    public final static int SCY_AUDIO_SAMPLE_START = 1;

    /**
     * 录音过程状态
     */
    public final static int SCY_AUDIO_SAMPLE_CONTINUE = 2;

    /**
     * 录音结束状态
     */
    public final static int SCY_AUDIO_SAMPLE_LAST = 4;

    //Grpc的ip地址,端口
    public final static String GRPC_IP = "198.18.0.1";
    public final static  int GRPC_PORT = 50051;

}
