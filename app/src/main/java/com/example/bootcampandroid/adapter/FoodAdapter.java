package com.example.bootcampandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bootcampandroid.R;
import com.example.bootcampandroid.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{


    private ArrayList<Food> foodArrayList;

    public FoodAdapter(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item,parent,false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        Food food = foodArrayList.get(position);

        holder.imageView.setImageResource(food.getImage());

        holder.textView.setText(food.getName());



    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.foodItemImage);
            textView = itemView.findViewById(R.id.foodItemNameTV);
        }





    }
}
