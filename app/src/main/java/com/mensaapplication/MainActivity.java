package com.mensaapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mensaapplication.ui.theme.RecyclerViewInterface;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<MensaModel> mensaModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpMensaModels();

        M_RecyclerViewAdapter adapter = new M_RecyclerViewAdapter(this, mensaModel, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button profile = findViewById(R.id.button1);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });

        M_RecyclerViewAdapter.OnButtonClickListener buttonClickListener = new M_RecyclerViewAdapter.OnButtonClickListener() {
            @Override
            public void onButtonClick(int position) {
                // Azioni da eseguire quando viene cliccato un pulsante nella RecyclerView
                // Ad esempio, avvia un'altra Activity passando dati
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        };

        adapter.setOnButtonClickListener(buttonClickListener);
    }

    private void changeActivity(){
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }

    public void setUpMensaModels(){

        String[] mensaNames = getResources().getStringArray(R.array.Mensa_names);
        for (int i = 0; i < mensaNames.length; i++){
            mensaModel.add(new MensaModel(mensaNames[i]));
        }

    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        //intent.putExtra("NAME", mensaModels.get(position).getMensaName());
        startActivity(intent);
    }
}