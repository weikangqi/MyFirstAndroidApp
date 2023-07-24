package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ning","sb");  //日志输出
         tv = findViewById(R.id.tv);
        tv.setText("你好 世界!");
      //  tv.setBackgroundColor(0xFFFF0000);
      //  tv.setTextColor(0xFF000000); //设置颜色
        Button button = findViewById(R.id.butto);
        button.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v.getId() == R.id.butto){
            tv.setText(" 世界!");
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
    }
}