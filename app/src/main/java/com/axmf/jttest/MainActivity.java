package com.axmf.jttest;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.question);
        tv = (TextView) findViewById(R.id.answer);

    }

    public  void request(View v){
        ApiService.service.today()
        .subscribeOn(Schedulers.io())
        .unsubscribeOn(Schedulers.io())
        .subscribeOn(AndroidSchedulers.mainThread())
        .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        Log.e("----","完成");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("----","错误");
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e("---",s);
                    }
                });
    }

}
