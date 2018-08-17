package com.example.shubhamgulati.confluence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton btnProf,btnDir,btnSch,memories,auBtn;
    Intent dirIntent,auIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnDir = findViewById(R.id.btnDir);
        btnSch = findViewById(R.id.btnSch);
        btnProf = findViewById(R.id.btnProf);
        auBtn = findViewById(R.id.auBtn);
        memories = findViewById(R.id.memories);
        btnProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),ProfessorActivity.class);
                startActivity(i);
            }
        });

        btnDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dirIntent = new Intent(getBaseContext(),Directions.class);
                startActivity(dirIntent);
            }
        });
        memories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(Main2Activity.this,MemoriesActivity.class);
                startActivity(mintent);
            }
        });

        auBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auIntent = new Intent(Main2Activity.this,AboutActivity.class);
                startActivity(auIntent);
            }
        });
    }
}
