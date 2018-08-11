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
        profArrayList.add(new Prof("Dr. Abhay bansal", "..",R.drawable.abhay_bansal));
        ProfAdapter profAdapter = new ProfAdapter(ProfessorActivity.this,profArrayList);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setAdapter(profAdapter);
        rv.setLayoutManager(lm);

    }
}
