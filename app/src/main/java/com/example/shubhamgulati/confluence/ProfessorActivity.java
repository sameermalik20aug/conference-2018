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
        profArrayList.add(new Prof("Prof.(Dr.) Abhay Bansal", "Prof. (Dr.) ABHAY BANSAL, Professor & Head, Department of CSE, ASET Director, DICET, Amity University, Noida has an all-embracing experience of more than 20 years in Teaching, Consultancy, and Research & Industry.",R.drawable.abhay_bansal));
        profArrayList.add(new Prof("Ms Abha  Sachdev","Asst. Professor (Grade - III)",R.drawable.abha));
        profArrayList.add(new Prof("Mr Mukul Varshney","Asst. Professor (Grade - II)",R.drawable.mukul));
        profArrayList.add(new Prof("Mr Abhishek  Singhal","Asst. Professor (Grade - III) Dy. HoD (CSE)",R.drawable.abhishek));
        profArrayList.add(new Prof("Prof.(Dr) Sanjeev  Thakur","Professor",R.drawable.sanjeev));
        profArrayList.add(new Prof("Mr Yogesh Singh Rathore ","Asst. Professor (Grade - III)",R.drawable.yogesh));
        ProfAdapter profAdapter = new ProfAdapter(ProfessorActivity.this,profArrayList);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setAdapter(profAdapter);
        rv.setLayoutManager(lm);

    }
}
