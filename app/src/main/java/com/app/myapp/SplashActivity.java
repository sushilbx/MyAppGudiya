package com.app.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {
    private Handler mHandler;
   // SessionManager sessionManager;
    Context context;
    private Runnable myRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        context = SplashActivity.this;
        context = SplashActivity.this;
        //sessionManager = new SessionManager(context);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        goToNextPage();
    }

    private void goToNextPage() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));

             /*   if (sessionManager.isLoggedIn()) {

                    startActivity(new Intent(SplashActivity.this, DashboardActivity.class));
                    finish();
                }
                else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }*/
            }

        }, 2000);
    }

}