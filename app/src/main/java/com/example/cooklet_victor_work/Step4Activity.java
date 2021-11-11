package com.example.cooklet_victor_work;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Step4Activity extends AppCompatActivity {


    public static CountDownTimer countDownTimer;
    public static long timeLeftInMilliseconds = 20000;
    public static boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
    }
}