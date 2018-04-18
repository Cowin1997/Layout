package com.example.admin.layout;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by admin on 2018/3/31.
 */

public class UC3 extends Activity {
    private int currentImage = 0;

   final int []images=new int[]{
           R.drawable.flowers, R.drawable.banana2,R.drawable.man,R.drawable.sea,R.drawable.banana,
         R.drawable.blue
   };
    final int[] names = new int[]{
            R.id.view1,
             R.id.view2,
             R.id.view3,
            R.id.view4,
            R.id.view5

        };
    ImageView[]views=new ImageView[names.length];
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg){
            if (msg.what==0x123){
                for (int i=0;i<names.length;i++){
                    views[i].setBackgroundResource(images[(currentImage)]);
                    currentImage++;
                    if(currentImage>=images.length) currentImage=0;
                }
                }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);
        for (int i=0;i<names.length;i++){
            views[i]=(ImageView) findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,3000);



        ((Button)findViewById(R.id.uc3_back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UC3.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}




