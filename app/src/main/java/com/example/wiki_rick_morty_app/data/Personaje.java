package com.example.wiki_rick_morty_app.data;

import com.example.wiki_rick_morty_app.data.personaje.Info;
import com.example.wiki_rick_morty_app.data.personaje.Results;

import java.util.ArrayList;

public class Personaje {
    private Info info;
    private ArrayList<Results> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }
}
