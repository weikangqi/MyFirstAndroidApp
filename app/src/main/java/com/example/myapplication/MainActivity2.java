package com.example.myapplication;

import static com.example.myapplication.R.id.btn_disable;
import static com.example.myapplication.R.id.btn_enble;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_test;
    private TextView tv_result;

    @Override

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); //设置第二页的布局
       Button  btn_enable =  findViewById(btn_enble);
        Button btn_disable = findViewById(R.id.btn_disable);
         btn_test = findViewById(R.id.btn_test);
         tv_result = findViewById(R.id.tv);
        btn_disable.setOnClickListener(this);
        btn_enable.setOnClickListener(this);
        btn_test.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btn_enble){
            btn_test.setEnabled(true);
            tv_result.setText("启用");
        }
        else if(v.getId() == btn_disable)
        {
            btn_test.setEnabled(false);
            tv_result.setText("禁用");
        }
        else if(v.getId() == R.id.btn_test) {
            tv_result.setText("测试");
        }
    }
}
