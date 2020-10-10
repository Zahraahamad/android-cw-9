package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> pokemons = new ArrayList<>();



        pokemon c1 = new pokemon("balbsaur",R.drawable.bulbasaur,49,49,318);
        pokemon c2 = new pokemon("ivysaur",R.drawable.ivysaur,62,63,405);
        pokemon c3 = new pokemon("venusaur",R.drawable.venusaur,82,83, 525);
        pokemon c4 = new pokemon("charmander",R.drawable.charmander,52,43, 309);
        pokemon c5 = new pokemon("chariezard",R.drawable.charizard,84,78, 534);


        pokemons.add(c1);
        pokemons.add(c2);
        pokemons.add(c3);
        pokemons.add(c4);
        pokemons.add(c5);

        RecyclerView hi = findViewById(R.id.hi);
        hi.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        hi.setLayoutManager(lm);

        pokemonAdapter pa = new pokemonAdapter(pokemons,this);
        hi.setAdapter(pa);
    }
}