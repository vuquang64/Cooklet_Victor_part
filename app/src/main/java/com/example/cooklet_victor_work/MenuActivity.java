package com.example.cooklet_victor_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {

    String[] version = {"Fried Beef Sweet & Sour", "Android Beta", "Android Cupcake", "Android Donut", "Android Eclair", "Android Froyo", "Android Gingerbread", "Android Honeycomb", "Android Ice Cream Sandwich", "Android JellyBean", "Android Kitkat", "Android Lollipop", "Android Marshmallow", "Android Nougat"};

    String[] versionNumber = {"1.0", "1.1", "1.5", "1.6", "2.0", "2.2", "2.3", "3.0", "4.0", "4.1", "4.4", "5.0", "6.0", "7.0"};

    ListView lView;

    ListAdapter lAdapter;

    int[] images_group;

    com.example.cooklet_victor_work.Dataset d = new com.example.cooklet_victor_work.Dataset();

    int type_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            type_value = extras.getInt("key");
            images_group = d.getImage_list()[type_value];

        }

        lView = (ListView) findViewById(R.id.androidList_menu);

        lAdapter = new ListAdapter(MenuActivity.this, version, versionNumber, images_group);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MenuActivity.this, IntroductionActivity.class);
                int[] temp= {type_value,i};
                intent.putExtra("key", temp); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }


    public void type_page(View view) {
        Intent intent = new Intent(MenuActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}