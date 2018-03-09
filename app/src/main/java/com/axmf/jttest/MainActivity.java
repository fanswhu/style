package com.axmf.jttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.question);
        tv = (TextView) findViewById(R.id.answer);


    }

    public  void request(View v){
        Log.e("----","请求");
        HttpPost.postByOkGo(et.getText().toString(),Constant.COMMON_QA,new HttpPost.JsonCallBack(){

            @Override
            public void onSuccess(String answer) {
                if(answer!=null&&!answer.isEmpty())
                    tv.setText(answer);
            }

            @Override
            public void onError() {
                tv.setText("网络错误");

            }
        });
    }
}
