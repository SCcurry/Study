package com.example.administrator.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //加载R.layout.activity_main的布局文件
        setContentView(R.layout.activity_main);
        //一定要在AndroidMainifest.xml中声明
    }
}
