package com.example.administrator.study;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Button btn_save;
    private Button btn_clear;
    private Button btn_jump;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //加载R.layout.activity_main的布局文件
        setContentView(R.layout.activity_main);

        btn_save=(Button)findViewById(R.id.save);
        btn_clear=(Button)findViewById(R.id.clear);
        btn_jump=(Button)findViewById(R.id.jump);

        tv=(TextView)findViewById(R.id.tv);
        //给当前btn做监听
        btn_save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tv.setText("保存成功！");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                tv.setText("清除成功！");
            }
        });
        btn_jump.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //intent必须实例化
                Intent intent =new Intent(MainActivity.this,NewActivity.class);
                //传值准备
                intent.putExtra("name","第一次intent的实现,如果这个页面出来了，说明intent实现跳转传递数据你已经会了");
                //开始跳转
                startActivity(intent);
            }
        });
    }
}
