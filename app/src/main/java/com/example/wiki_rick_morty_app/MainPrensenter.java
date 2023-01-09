package com.example.wiki_rick_morty_app;

import android.content.Context;

import com.example.wiki_rick_morty_app.interfaceM.MainModelInterface;
import com.example.wiki_rick_morty_app.interfaceM.MainPresenterInterface;
import com.example.wiki_rick_morty_app.interfaceM.MainViewInterface;

public class MainPrensenter implements MainPresenterInterface {
    MainViewInterface view;
    MainModelInterface model;

    public MainPrensenter(Context context) {
        //this.view = new MainActivity();
        this.model = new MainModel(context);

    }

    @Override
    public void clickPersonajes() {
        model.consumoPersonajes();

    }
}
