package com.example.cooklet_victor_work;

import static com.example.cooklet_victor_work.Notification.CHANNEL_1_ID;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IntroductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }

    public void toPrepare(View view) {
        Intent intent = new Intent(IntroductionActivity.this, PreparationActivity.class);
        startActivity(intent);
    }

    public void homeFromIntro(View view) {
        Intent intent = new Intent(IntroductionActivity.this, HomeActivity.class);
        startActivity(intent);
    }

/*    public void backMenuFromIntro(View view) {
        Intent intent = new Intent(IntroductionActivity.this, MenuActivity.class);
        startActivity(intent);
    }*/
}