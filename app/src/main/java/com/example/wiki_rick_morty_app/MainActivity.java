package com.example.wiki_rick_morty_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wiki_rick_morty_app.interfaceM.MainPresenterInterface;
import com.example.wiki_rick_morty_app.interfaceM.MainViewInterface;

public class MainActivity extends AppCompatActivity implements MainViewInterface {

    private MainPresenterInterface prensenter;
    private Button btnPersonaje;
    private Button btnLocalizacion;
    private Button btnEpisodio;
    private RecyclerView rvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnPersonaje.setOnClickListener(view -> {
            prensenter.clickPersonajes();

        });

        btnLocalizacion.setOnClickListener(view -> {

        });


        btnEpisodio.setOnClickListener(view -> {

        });





    }


    void init(){
        prensenter = new MainPrensenter(MainActivity.this);
        btnPersonaje = findViewById(R.id.btnMainPersonaje);
        btnLocalizacion = findViewById(R.id.btnMainLocation);
        btnEpisodio = findViewById(R.id.btnMainEpisodio);
        rvMain = findViewById(R.id.rvMain);
    }



}