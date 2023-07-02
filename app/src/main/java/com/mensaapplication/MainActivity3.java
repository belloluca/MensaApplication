package com.mensaapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

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