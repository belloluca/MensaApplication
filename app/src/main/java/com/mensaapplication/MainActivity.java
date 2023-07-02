package com.mensaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView14);
        int cafetaria1 = imageView.getId();
        Log.d("ilayda", String.valueOf(cafetaria1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //setContentView(R.layout.layout);
                //List<meals> meals = new ArrayList<meals>();
                //meals.add(new meals("Angebot 1","Gemüseschnitzel mit Soja- Kräutersauce Rustika Carrots und Petersilienkartoffeln", "2,50€","4,50€",R.drawable.geflugel,R.drawable.star_empty));
                /*String[] meals = new String[3];
                meals[0]="Value1";
                meals[1]="Value2";
                meals[2]="Value3";*/
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("cafetaria_id",String.valueOf(cafetaria1));
                startActivity(intent);
            }
        });
        imageView2 = findViewById(R.id.imageView16);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //setContentView(R.layout.layout);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        imageView3 = findViewById(R.id.imageView17);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //setContentView(R.layout.layout);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        imageView4 = findViewById(R.id.imageView18);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //setContentView(R.layout.layout);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        imageView5 = findViewById(R.id.imageView20);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                //setContentView(R.layout.layout);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}