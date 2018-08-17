package com.example.shubhamgulati.confluence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.himangi.imagepreview.ImagePreviewActivity;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ImageButton btnProf,btnDir,btnSch,memories,auBtn;
    Intent dirIntent,auIntent;
    ArrayList<String> imagesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnDir = findViewById(R.id.btnDir);
        btnSch = findViewById(R.id.btnSch);
        btnProf = findViewById(R.id.btnProf);
        auBtn = findViewById(R.id.auBtn);
        memories = findViewById(R.id.memories);
        imagesArrayList.add(getURLForResource(R.drawable.w7));
        imagesArrayList.add(getURLForResource(R.drawable.w8));
        imagesArrayList.add(getURLForResource(R.drawable.w9));
        imagesArrayList.add(getURLForResource(R.drawable.w10));
        imagesArrayList.add(getURLForResource(R.drawable.w11));
        imagesArrayList.add(getURLForResource(R.drawable.w13));
        imagesArrayList.add(getURLForResource(R.drawable.w14));
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
                Intent intent = new Intent(Main2Activity.this, ImagePreviewActivity.class);
                intent.putExtra(ImagePreviewActivity.IMAGE_LIST,
                        imagesArrayList);
                intent.putExtra(ImagePreviewActivity.CURRENT_ITEM, 3);
                startActivity(intent);
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

    public String getURLForResource (int resourceId) {
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }
}
