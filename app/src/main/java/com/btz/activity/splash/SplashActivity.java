package com.btz.activity.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.btz.R;
import com.btz.activity.user.LoginActivity;
import com.btz.common.config.AppConfiguration;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setContentView(R.layout.activity_splash);
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                Intent intentSplashToLogin =new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intentSplashToLogin);
                SplashActivity.this.finish();//关闭当前活动
            }
        };
        timer.schedule(timerTask, AppConfiguration.SPLASH_SCREEN_TIME);
    }
}
