package com.example.cooklet_victor_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreparationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation);
    }

    public void openInstruction(View view) {
        Intent intent = new Intent(this, Instruction.class);
        startActivity(intent);
    }
}