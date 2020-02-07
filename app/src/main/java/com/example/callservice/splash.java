package com.example.callservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
        progressBar = (ProgressBar)findViewById(R.id.progressid);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startapp();
            }
        });
        thread.start();

    }
    private void doWork(){
        for(progres = 20; progres<=100; progres = progres+20)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progres);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    private void startapp(){

        Intent intent = new Intent(splash.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
