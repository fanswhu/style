package com.axmf.jttest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
      for(int i = 0;i<100;i++){
          Handler handler = new Handler();
      }

    }

    public  void request(View v){
        startActivity(new Intent(this,LeakActivity.class));
    }

    @Override
    protected void onDestroy() {

    }
}
