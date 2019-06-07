package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nani.R;
import com.wang.avi.AVLoadingIndicatorView;

public class SplashActivity extends AppCompatActivity {
    AVLoadingIndicatorView progress_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        progress_bar=findViewById(R.id.progress_bar_splash);
        progress_bar.show();
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    this.sleep(2000);
                    Intent intent = new Intent(SplashActivity.this, GetStartedActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();





    }
}
