package com.example.wiki_rick_morty_app;

import android.content.Context;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.wiki_rick_morty_app.data.Personaje;
import com.example.wiki_rick_morty_app.interfaceM.MainModelInterface;
import com.example.wiki_rick_morty_app.interfaceM.MainPresenterInterface;
import com.google.gson.Gson;

public class MainModel implements MainModelInterface {

    MainPresenterInterface presenter;
    Context context;
    private static final String URL_BASE = "https://rickandmortyapi.com/api";
    private static final String URL_PERSONAJE = "/character";

    public MainModel(Context context) {
        //this.presenter = new MainPrensenter(context);

        this.context = context;

    }

    @Override
    public void consumoPersonajes() {

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Method.GET, URL_BASE + URL_PERSONAJE,
                response -> {

            Gson gson = new Gson();


                    Personaje personaje = gson.fromJson(response, Personaje.class);
                    System.out.println(personaje.getResults().get(0).getName());

                }, error -> {
            System.out.println(error);
                });

        requestQueue.add(stringRequest);
    }
}
