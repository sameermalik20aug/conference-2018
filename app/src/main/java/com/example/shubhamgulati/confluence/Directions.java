package com.example.shubhamgulati.confluence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Directions extends AppCompatActivity {

    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
        photoView = findViewById(R.id.directView);
        photoView.setImageResource(R.drawable.routemap);
    }
}
