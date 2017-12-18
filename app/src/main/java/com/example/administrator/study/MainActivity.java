package com.example.administrator.study;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Button btn_save;
    private Button btn_clear;
    private Button btn_jump;
    private Button btn_bigger;
    private Button btn_smaller;
    private TextView tv;
    private EditText u_name;
    private EditText u_psaaward;
    private EditText u_email;
    private int tv_Size=20;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //加载R.layout.activity_main的布局文件
        setContentView(R.layout.activity_main);

        btn_save=(Button)findViewById(R.id.save);
        btn_clear=(Button)findViewById(R.id.clear);

        btn_bigger=(Button)findViewById(R.id.bigger);
        btn_smaller=(Button)findViewById(R.id.smaller);

        tv=(TextView)findViewById(R.id.tv);

        u_name=(EditText)findViewById(R.id.user_name);
        u_email=(EditText)findViewById(R.id.user_email);
        u_psaaward=(EditText)findViewById(R.id.user_passward);




        //给当前btn做监听
        btn_save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Intent i=new Intent(MainActivity.this,NewActivity.class);

                String name_name=u_name.getText().toString();
                String name_passward=u_psaaward.getText().toString();
                String name_email=u_email.getText().toString();

                String user_infor="用户的用户名，密码，邮箱分别为："+name_name+","+name_passward+","+name_email;
                i.putExtra("name",user_infor);
                startActivity(i);
            }



        });

        btn_smaller.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(tv_Size>20) {
                    tv.setTextSize(--tv_Size);
                }
            }
        });

        btn_bigger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(tv_Size<30) {
                    tv.setTextSize(++tv_Size);
                }
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

    }
}
