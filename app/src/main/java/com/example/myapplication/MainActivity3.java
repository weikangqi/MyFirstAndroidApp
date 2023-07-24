package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView iv = findViewById(R.id.iv);
        iv.setImageResource(R.drawable.gaoda);
        iv.setScaleType(ImageView.ScaleType.CENTER);

    }
}