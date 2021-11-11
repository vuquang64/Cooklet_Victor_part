package com.example.cooklet_victor_work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PreparationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation);

        ListView ingredientListView = (ListView) findViewById(R.id.ingredientListView);

        Ingredients meat = new Ingredients("Meat",500, "g","Weight");
        Ingredients oil = new Ingredients("Oil", 1.5, "ml","Volume");

        ArrayList<Ingredients> ingredientList = new ArrayList<>();
        ingredientList.add(meat);
        ingredientList.add(oil);
        System.out.println("Adding the items");

        IngredientListAdapter adapter = new IngredientListAdapter(this,R.layout.adapter_view_layout, ingredientList);
        ingredientListView.setAdapter(adapter);
        System.out.println("Creating the adapter");
    }

    public void openInstruction(View view) {
        Intent intent = new Intent(this, Instruction.class);
        startActivity(intent);
    }
}