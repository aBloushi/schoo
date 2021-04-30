package com.example.schoo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolender.R;

import java.util.ArrayList;

public class SubAdapter extends RecyclerView.Adapter {

    Context context;


    public SubAdapter(Context context) {

        this.context = context;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvlayout2, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
//        final int image = pArray.get(position).getImage();
//        final String total = pArray.get(position).getTotal()+"";
//        final String name = pArray.get(position).getName()+"";
//        final String attack = pArray.get(position).getAttack()+"";
//        final String defence = pArray.get(position).getDefence()+"";


        ((ViewHolder) holder).name.setText(arry2.arrayl.get(position).toString());




    }

    @Override
    public int getItemCount() {
        return arry2.arrayl.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            name = itemView.findViewById(R.id.textView);


        }


    }


}
