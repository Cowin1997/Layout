package com.example.admin.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by admin on 2018/3/31.
 */

public class UC5 extends Activity {
    private String[] chars=new String[]{
      "1","2","3",
        "4","5","6",
        "7","8","9",
        "0","+",".",
        "*","/","="
    };

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc5);
        //获取布局
        GridLayout gridLayout=(GridLayout)findViewById(R.id.uc5_text
        );
        for(int i=0;i<chars.length;i++){
            Button button=new Button(this);
            button.setText(chars[i]);
            button.setTextSize(30);
            GridLayout.Spec rowspec=GridLayout.spec(i/3,1,1.0f);
            GridLayout.Spec columnspec=GridLayout.spec(i%3,1,1.0f);
            Log.e("行列", rowspec.toString());
            Log.e("行列", columnspec.toString());
            GridLayout.LayoutParams params= new GridLayout.LayoutParams(rowspec,columnspec);
            params.setGravity(Gravity.FILL);
           // params.width= GridLayout.LayoutParams.MATCH_PARENT;
           // params.height=GridLayout.LayoutParams.MATCH_PARENT;
            gridLayout.addView(button,params);
           ((Button)findViewById(R.id.uc5_back)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(UC5.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            });

        }
    }
}
