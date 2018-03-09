package com.axmf.jttest;


import com.axmf.jttest.entity.QABean;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by feng on 2017/11/28.
 */

public class HttpPost {


    private static String url = "http://128.128.96.235:7001/CSRBroker/queryMessage";
    //private static String url = "http://11.168.186.109:1029/broker/CSRBroker/queryMessage";
    private static String face_url = "http://11.168.186.109:1029/broker/CSRBroker/faceSearch";

    public  static  void postByOkGo(String question, String queryType, final JsonCallBack callBack){
        doPost(url,question,queryType,callBack);
    }
    //人脸识别
    public  static  void postByFace(){

    }

    public static void doPost(String commonUrl, String question, String queryType, final JsonCallBack callBack){

        final boolean[] hasCache = new boolean[1];
        OkGo.post(commonUrl)
                .cacheKey(question)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .upJson(toJson(question,queryType))
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        if(!hasCache[0])
                            callBack.onSuccess(s);
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                        callBack.onError();
                    }

                    @Override
                    public void onCacheSuccess(String s, Call call) {
                        super.onCacheSuccess(s, call);
                        hasCache[0] = true;
                        callBack.onSuccess(s);
                    }
                });
    }

    //实体类转换成json字符串
    private static String toJson(String text, String queryType){
        QABean qaBean = new QABean(Constant.DEVICE_ID,"2",queryType,text);
        Gson gson = new GsonBuilder().create();
        String s = gson.toJson(qaBean);
        return s;
    }

   public interface  JsonCallBack{
        void onSuccess(String answer);
        void onError();
    }
}
