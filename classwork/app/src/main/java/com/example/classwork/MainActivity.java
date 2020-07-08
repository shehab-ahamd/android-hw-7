package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon>mypokemons =new ArrayList<>();
        pokemon p1 =new pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon p2 =new pokemon("Ivysaur",R.drawable.ivysaur,62,63,405);
        pokemon p3 =new pokemon("Venusaur",R.drawable.venusaur,82,83,525);
        pokemon p4 =new pokemon("Charmander",R.drawable.charmander,52,43,309);

        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);
        mypokemons.add(p4);


        RecyclerView rv= findViewById(R.id.RecyclerView);
    }
}