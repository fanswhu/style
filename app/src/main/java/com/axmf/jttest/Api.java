package com.axmf.jttest;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by feng on 2018/3/13.
 */

public interface Api {
    /*@GET("/student/login")
    Observable<HttpResult> login(@Query("phone") String phone, @Query("password") String psw);*/
    @GET("article/today?dev=1")
    Observable<String> today();
}
