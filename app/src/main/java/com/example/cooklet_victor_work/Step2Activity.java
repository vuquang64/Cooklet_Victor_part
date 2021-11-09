package com.example.cooklet_victor_work;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Step2Activity extends AppCompatActivity {
    public Button timer;

    public static CountDownTimer countDownTimer;
    public static long timeLeftInMilliseconds = 600000;
    public static boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
    }

    public static void countDown1(View view) {
        if(timerRunning){
            stopTimer();
        } else {
            startTimer();
        }
    }

    public static void startTimer() {
        countDownTimer=new CountDownTimer(timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliseconds=l;
            }

            @Override
            public void onFinish() {

            }
        }.start();
        timerRunning=true;
    }
    public static void stopTimer() {
        countDownTimer.cancel();
        timerRunning=false;
    }
}