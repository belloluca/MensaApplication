package com.mensaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity implements interface_mealsRecyclerView {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        List<meals> meals = new ArrayList<meals>();
        meals.add(new meals("Angebot 1","Gemüseschnitzel mit Soja- Kräutersauce Rustika Carrots und Petersilienkartoffeln", "2,50€","4,50€",R.drawable.star_empty,R.drawable.geflugel));
        meals.add(new meals("Angebot 2","İlayda mit Soja- Kräutersauce Rustika Carrots und Petersilienkartoffeln", "2,50€","4,50€",R.drawable.star_empty,R.drawable.fisch));
        meals.add(new meals("Angebot 3","Gemüseschnitzel mit Soja- Kräutersauce Rustika Carrots und Petersilienkartoffeln", "2,50€","4,50€",R.drawable.star_empty,R.drawable.mensa_vegan));
        meals.add(new meals("Angebot 4","Gemüseschnitzel mit Soja- Kräutersauce Rustika Carrots und Petersilienkartoffeln", "2,50€","4,50€",R.drawable.star_empty,R.drawable.geflugel));

        //String cafetaria = (String) getIntent().getSerializableExtra("cafetaria_id");
        //Log.d("berkay", cafetaria);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter_meals(getApplicationContext(),meals,this));

        /*imageView = findViewById(R.id.imageView31);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //Intent intent = new Intent(MainActivity.this, layout.class);
                //startActivity(intent);
                setContentView(R.layout.layout2);
            }
        });
        imageView2 = findViewById(R.id.imageView32);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //Intent intent = new Intent(MainActivity.this, layout.class);
                //startActivity(intent);
                setContentView(R.layout.layout2);
            }
        });
        imageView3 = findViewById(R.id.imageView30);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //Intent intent = new Intent(MainActivity.this, layout.class);
                //startActivity(intent);
                setContentView(R.layout.layout2);
            }
        });
        imageView4 = findViewById(R.id.imageView5);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //Intent intent = new Intent(MainActivity.this, layout.class);
                //startActivity(intent);
                setContentView(R.layout.layout2);
            }
        });
        imageView5 = findViewById(R.id.imageView26);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //Intent intent = new Intent(MainActivity.this, layout.class);
                //startActivity(intent);
                setContentView(R.layout.layout2);
            }
        });*/
    }

    @Override
    public void onRecyclerviewClick(meals meals) {
        int filter = meals.getFilter();
        int rating = meals.getRating();
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

        intent.putExtra("MealName", meals.getMealName());
        intent.putExtra("Filter", filter);
        intent.putExtra("Rating", rating);

        startActivity(intent);
    }
}