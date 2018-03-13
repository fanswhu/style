package com.axmf.jttest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by feng on 2018/3/13.
 */

public class ApiService {
    private  static  ApiService service;
    //请求超时时间
    private static  final  int DEFAULT_TIMEOUT = 10000;
    private static  final String BASE_URL = "http://";

    private synchronized static ApiService getDefault(){
        if(service == null){
            OkHttpClient.Builder  httpClientBuilder = new OkHttpClient.Builder();
            httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
            /*
            * 对所有请求添加请求头
            * */
            httpClientBuilder.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    Response response = chain.proceed(request);
                    return response.newBuilder().header("key1","value1").addHeader("key2","value2").build();
                }
            });

            service = new Retrofit.Builder()
                    .client(httpClientBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .baseUrl(BASE_URL)
                    .build().create(ApiService.class);
        }
        return  service;
    }
}
