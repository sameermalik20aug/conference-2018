package com.example.shubhamgulati.confluence;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mzelzoghbi.zgallery.ZGallery;
import com.mzelzoghbi.zgallery.ZGrid;
import com.mzelzoghbi.zgallery.entities.ZColor;

import java.util.ArrayList;

public class MemoriesActivity extends AppCompatActivity {

    ArrayList<String> imagesArrayList = new ArrayList<>();

    ZGallery zGallery;
    ZGrid zGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);
        setContentView(R.layout.activity_memories);
        imagesArrayList.add(getURLForResource(R.drawable.w7));
        imagesArrayList.add(getURLForResource(R.drawable.w8));
        imagesArrayList.add(getURLForResource(R.drawable.w9));
        imagesArrayList.add(getURLForResource(R.drawable.w10));
        imagesArrayList.add(getURLForResource(R.drawable.w11));
        imagesArrayList.add(getURLForResource(R.drawable.w13));
        imagesArrayList.add(getURLForResource(R.drawable.w14));

        zGrid.with(this,imagesArrayList)
                .setToolbarColorResId(R.color.colorPrimary) // toolbar color
                .setTitle("Memories") // toolbar title
                .setToolbarTitleColor(ZColor.WHITE) // toolbar title color
                .setSpanCount(3) // colums count
                .setGridImgPlaceHolder(R.color.colorPrimary) // color placeholder for the grid image until it loads
                .show();

  //      zGallery.with(this,imagesArrayList)
  //              .setToolbarTitleColor(ZColor.WHITE) // toolbar title color
  //              .setGalleryBackgroundColor(ZColor.WHITE) // activity background color
  //              .setToolbarColorResId(R.color.colorPrimary) // toolbar color
  //              .setTitle("Memories") // toolbar title
  //              .show();

    }

    public String getURLForResource (int resourceId) {
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }
}
