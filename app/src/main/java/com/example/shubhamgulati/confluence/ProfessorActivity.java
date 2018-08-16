package com.example.shubhamgulati.confluence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;

public class ProfessorActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        rv = findViewById(R.id.rv);
        ArrayList<Prof> profArrayList = new ArrayList<>();
        profArrayList.add(new Prof("Scott McKinley","AWS Academy Leader at Amazon.com, Inc. \nScott McKinley has an established track record of leading global innovation and corporate entrepreneurship in the education field throughout Asia, Europe, and the USA.",R.drawable.scott));
        profArrayList.add(new Prof("Dr. Mustafa Taher Ali Saasa","Chairman at Sell Force International LLC",R.drawable.tahir));
        profArrayList.add(new Prof("H.E. Mr. Radu Octavian Dobre","Ambassador Extraordinary and Plenipotentiary of Romania to the Republic of India",R.drawable.radu));
        profArrayList.add(new Prof("H.E. Ms. Jainaba Jagne","Ambassador-Designate of Gambia",R.drawable.jagne));
        ProfAdapter profAdapter = new ProfAdapter(ProfessorActivity.this,profArrayList);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setAdapter(profAdapter);
        rv.setLayoutManager(lm);

    }
}
