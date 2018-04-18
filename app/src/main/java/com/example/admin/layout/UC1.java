package com.example.admin.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by admin on 2018/3/31.
 */

public class UC1 extends Activity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc1_1);
        resetlisten();
    }
    //    重新设置布局之前设置的监听器会失效   =。=
    public void resetlisten(){
        //   水平布局
        ((Button)findViewById(R.id.uc1_button1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.uc1_2);
                resetlisten();
            }
        });
        //   垂直布局
        ((Button)findViewById(R.id.uc1_button2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.uc1_1);
                resetlisten();
            }
        });
        //    左对齐
        ((Button)findViewById(R.id.uc1_button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.uc1_3);
                resetlisten();
            }
        });
        ((Button)findViewById(R.id.uc1_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UC1.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
