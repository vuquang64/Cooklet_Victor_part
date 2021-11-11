package com.example.cooklet_victor_work;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Step3Activity extends AppCompatActivity {

    public static CountDownTimer countDownTimer;
    public static long timeLeftInMilliseconds = 180000;
    public static boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);
    }
}