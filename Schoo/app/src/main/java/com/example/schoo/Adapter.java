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

public class Adapter extends RecyclerView.Adapter {

    Context context;


    public Adapter(Context context) {

        this.context = context;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvlayout, parent, false);
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


        ((ViewHolder) holder).name.setText(arry.arrayl.get(position).toString());


        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, subject.class);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arry.arrayl.size();
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
