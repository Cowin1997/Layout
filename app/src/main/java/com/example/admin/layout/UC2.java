package com.example.admin.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by admin on 2018/3/31.
 */

public class UC2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc2_1);
        ((Button)findViewById(R.id.uc2_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UC2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
