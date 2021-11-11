package com.example.cooklet_victor_work;

import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

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
}