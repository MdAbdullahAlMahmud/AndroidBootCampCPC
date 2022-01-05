package com.example.bootcampandroid.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampandroid.FoodDetailsActivity;
import com.example.bootcampandroid.R;
import com.example.bootcampandroid.model.FoodItem;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FoodItemAdapter extends RecyclerView.Adapter<FoodItemAdapter.FoodItemViewHolder>{

    private ArrayList<FoodItem> foodItemArrayList;
    private Context context;

    public FoodItemAdapter(ArrayList<FoodItem> foodItemArrayList,Context context) {
        this.foodItemArrayList = foodItemArrayList;
        this.context=context;
    }


    @NonNull
    @Override
    public FoodItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        return new FoodItemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemViewHolder holder, @SuppressLint("RecyclerView") int position) {

        FoodItem item = foodItemArrayList.get(position);
        holder.foodItemNameTV.setText(item.getName());
        holder.foodItemImage.setImageResource(item.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDetailsActivity.class);
                intent.putExtra("food",item);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodItemArrayList.size();
    }

    public class FoodItemViewHolder extends RecyclerView.ViewHolder {

        public ImageView foodItemImage;
        public TextView foodItemNameTV;

        public FoodItemViewHolder(@NonNull View itemView) {
            super(itemView);

            foodItemImage = itemView.findViewById(R.id.foodItemImage);
            foodItemNameTV = itemView.findViewById(R.id.foodItemNameTV);
        }
    }
}
