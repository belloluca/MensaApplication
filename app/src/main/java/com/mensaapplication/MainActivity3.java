package com.mensaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        Intent intent = getIntent();

        String meal = intent.getStringExtra("MealName");
        TextView MealName = findViewById(R.id.textView7);
        MealName.setText(meal);
        ImageView Filter = findViewById(R.id.imageView8);
        int filter = intent.getIntExtra("Filter", 32);
        Filter.setImageResource(filter);
        ImageView Rating = findViewById(R.id.imageView10);
        int rating = intent.getIntExtra("Rating", 32);
        Rating.setImageResource(rating);
    }
}