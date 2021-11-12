package com.example.cooklet_victor_work;

import static com.example.cooklet_victor_work.Notification.CHANNEL_1_ID;
import static com.example.cooklet_victor_work.Notification.CHANNEL_2_ID;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Instruction extends AppCompatActivity {
    LinearLayout Layout_bars;
    TextView[] bottomBars;
    int[] screens;
    Button Home,Back;
    ViewPager vp;
    MyViewPagerAdapter myvpAdapter;

    private NotificationManagerCompat notificationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        screens = new int[]{
                R.layout.activity_step1,
                R.layout.activity_step2,
                R.layout.activity_step3,
                R.layout.activity_step4
        };
        vp = (ViewPager) findViewById(R.id.view_pager);
        Layout_bars = (LinearLayout) findViewById(R.id.layoutBars);
        Back = (Button) findViewById(R.id.back);
        Home = (Button) findViewById(R.id.home);
        myvpAdapter = new MyViewPagerAdapter();
        vp.setAdapter(myvpAdapter);
        vp.addOnPageChangeListener(viewPagerPageChangeListener);
        ColoredBars(0);

        notificationManager = NotificationManagerCompat.from(this);
    }

    public void homeFromInstruc(View v) {
        int i = getItem(+1);
        if (i < screens.length) {
            launchHome();
        } else {
            Intent intent = new Intent(this, FinishActivity.class);
            startActivity(intent);
        }
    }

    public void backIntro(View view) {
        Intent intent = new Intent(this, IntroductionActivity.class);
        startActivity(intent);
    }

    private void ColoredBars(int thisScreen) {
        int[] colorsInactive = getResources().getIntArray(R.array.dot_on_page_not_active);
        int[] colorsActive = getResources().getIntArray(R.array.dot_on_page_active);
        bottomBars = new TextView[screens.length];

        Layout_bars.removeAllViews();
        for (int i = 0; i < bottomBars.length; i++) {
            bottomBars[i] = new TextView(this);
            bottomBars[i].setTextSize(100);
            bottomBars[i].setText(Html.fromHtml("¯"));
            Layout_bars.addView(bottomBars[i]);
            bottomBars[i].setTextColor(colorsInactive[thisScreen]);
        }
        if (bottomBars.length > 0)
            bottomBars[thisScreen].setTextColor(colorsActive[thisScreen]);
    }

    private int getItem(int i) {
        return vp.getCurrentItem() + i;
    }

    private void launchHome() {
        startActivity(new Intent(Instruction.this, HomeActivity.class));
        finish();
    }

    final ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            if (position == 0) {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_2_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Step 1")
                        .setContentText(getString(R.string.step1_name))
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(2, notification);
            }
            if (position == 1) {

                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_2_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Step 2")
                        .setContentText(getString(R.string.step2_name))
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(2, notification);
            }
            if (position == 2) {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_2_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Step 3")
                        .setContentText(getString(R.string.step3_name))
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(2, notification);
            }
            if (position == 3) {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_2_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Step 4")
                        .setContentText(getString(R.string.step4_name))
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(2, notification);
            }


            ColoredBars(position);
            if (position == screens.length - 1) {
                Home.setText("Finish");
                Back.setVisibility(View.GONE);
            } else {
                Home.setText("Home");
                Back.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater inflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            if (position == 0) {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_2_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Step 1")
                        .setContentText(getString(R.string.step1_name))
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .build();
                notificationManager.notify(2, notification);
            }

            inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(screens[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return screens.length;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View v = (View) object;
            container.removeView(v);
        }

        @Override
        public boolean isViewFromObject(View v, Object object) {
            return v == object;
        }
    }

    public void countDown1(View view) {
        if(Step2Activity.timerRunning){
            stopTimer1();
        } else {
            startTimer1();
        }
    }

    public void countDown2(View view) {
        if(Step3Activity.timerRunning){
            stopTimer2();
        } else {
            startTimer2();
        }
    }

    public void countDown3(View view) {
        if(Step4Activity.timerRunning){
            stopTimer3();
        } else {
            startTimer3();
        }
    }
    public void startTimer1() {
        android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.cooklet_logo)
                .setContentTitle("Timer")
                .setContentText("Time remaining: 10 minutes")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1, notification);
        Step2Activity.countDownTimer=new CountDownTimer(Step2Activity.timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                Step2Activity.timeLeftInMilliseconds=l;
            }

            @Override
            public void onFinish() {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Timer")
                        .setContentText("Time is up")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                notificationManager.notify(1, notification);System.out.println("Time is up");
            }
        }.start();
        Step2Activity.timerRunning=true;
    }
    public void stopTimer1() {
        Step2Activity.countDownTimer.cancel();
        Step2Activity.timerRunning=false;
    }

    public void startTimer2() {
        android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.cooklet_logo)
                .setContentTitle("Timer")
                .setContentText("Time remaining: 3 minutes")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1, notification);
        Step3Activity.countDownTimer=new CountDownTimer(Step3Activity.timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                Step3Activity.timeLeftInMilliseconds=l;
            }

            @Override
            public void onFinish() {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Timer")
                        .setContentText("Time is up")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                notificationManager.notify(1, notification);
            }
        }.start();
        Step3Activity.timerRunning=true;
    }
    public void stopTimer2() {
        Step3Activity.countDownTimer.cancel();
        Step3Activity.timerRunning=false;
    }


    public void startTimer3() {
        android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.cooklet_logo)
                .setContentTitle("Timer")
                .setContentText("Time remaining: 1 min 30 seconds")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManager.notify(1, notification);
        Step4Activity.countDownTimer=new CountDownTimer(Step4Activity.timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                Step4Activity.timeLeftInMilliseconds=l;
            }

            @Override
            public void onFinish() {
                android.app.Notification notification = new NotificationCompat.Builder(Instruction.this, CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.cooklet_logo)
                        .setContentTitle("Timer")
                        .setContentText("Time is up")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();
                notificationManager.notify(1, notification);
            }
        }.start();
        Step4Activity.timerRunning=true;
    }
    public void stopTimer3() {
        Step4Activity.countDownTimer.cancel();
        Step4Activity.timerRunning=false;
    }
}