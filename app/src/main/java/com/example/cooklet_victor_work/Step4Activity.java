package com.example.cooklet_victor_work;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Step4Activity extends AppCompatActivity {

    private Button timer;

    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 90000;
    private boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);

        timer = findViewById(R.id.timer);

        timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStop();
            }
        });
    }

    public void startStop() {
        if(timerRunning){
            stopTimer();
        } else {
            startTimer();
        }
    }

    private void startTimer() {
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
    private void stopTimer() {
        countDownTimer.cancel();
        timerRunning=false;
    }
}