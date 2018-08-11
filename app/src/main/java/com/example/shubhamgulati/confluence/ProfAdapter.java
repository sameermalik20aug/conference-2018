package com.example.shubhamgulati.confluence;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProfAdapter extends RecyclerView.Adapter<ProfAdapter.ViewHolder> {

    Context cxt;
    ArrayList<Prof> profArrayList;

    public ProfAdapter(Context cxt, ArrayList<Prof> profArrayList) {
        this.cxt = cxt;
        this.profArrayList = profArrayList;
    }

    @NonNull
    @Override
    public ProfAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(cxt);
        View inflatedView = li.inflate(R.layout.row,parent,false);
        return new ViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfAdapter.ViewHolder holder, int position) {

        final Prof p = profArrayList.get(position);
        holder.tvName.setText(p.getName());
        Picasso.get().load(p.getImage()).placeholder(R.drawable.ic_launcher_background).into(holder.iv);
//        LayoutInflater layoutInflater = LayoutInflater.from(cxt);
//        View v = layoutInflater.inflate(R.layout.alertview,null,true);
        holder.fulliv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = LayoutInflater.from(cxt);
                v = layoutInflater.inflate(R.layout.alertview,null,true);
                AlertDialog.Builder builder = new AlertDialog.Builder(cxt);
                builder.setView(v);
                AlertDialog alertDialog = builder.create();

                ImageView alertIv = v.findViewById(R.id.alertIv);
                TextView alertName = v.findViewById(R.id.alertName);
                TextView alertBio = v .findViewById(R.id.alertBio);
                Picasso.get().load(p.getImage()).placeholder(R.drawable.ic_launcher_background).into(alertIv);
                alertName.setText(p.getName());
                alertBio.setText(p.getBio());
                alertDialog.show();
            }
        });
//        holder.tvName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LayoutInflater layoutInflater = LayoutInflater.from(cxt);
//                v = layoutInflater.inflate(R.layout.alertview,null,true);
//                AlertDialog.Builder builder = new AlertDialog.Builder(cxt);
//                builder.setView(v);
//                AlertDialog alertDialog = builder.create();
//
//                ImageView alertIv = v.findViewById(R.id.alertIv);
//                TextView alertName = v.findViewById(R.id.alertName);
//                TextView alertBio = v .findViewById(R.id.alertBio);
//                Picasso.get().load(p.getImage()).placeholder(R.drawable.ic_launcher_background).into(alertIv);
//                alertName.setText(p.getName());
//                alertBio.setText(p.getBio());
//                alertDialog.show();
//
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return profArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv,fulliv;
        TextView tvName;
        public ViewHolder(View itemView) {
            super(itemView);
//            linearLayout = (LinearLayout) itemView.findViewById(R.id.ll);
            iv = itemView.findViewById(R.id.iv);
            fulliv = itemView.findViewById(R.id.fulliv);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
