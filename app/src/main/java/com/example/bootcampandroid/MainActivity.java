package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bootcampandroid.adapter.FoodAdapter;
import com.example.bootcampandroid.adapter.FoodItemAdapter;
import com.example.bootcampandroid.model.Food;
import com.example.bootcampandroid.model.FoodItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView foodRV;

    private ArrayList<FoodItem> foodArrayList;

    private FoodItemAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
        setUpRecycleView();

        foodArrayList.add(new FoodItem(R.drawable.burger,"Burger", "Description Burger"));
        foodArrayList.add(new FoodItem(R.drawable.chicken_fry,"Chicken Fry","dgffdg"));
        foodArrayList.add(new FoodItem(R.drawable.food1,"Mix Food","sdfs"));
        foodArrayList.add(new FoodItem(R.drawable.grill,"Grill","piopg"));
        foodArrayList.add(new FoodItem(R.drawable.hot_dogs,"Hot Dog","dgdfg"));
        foodArrayList.add(new FoodItem(R.drawable.pizza,"Pizza","dfgdf"));
        foodArrayList.add(new FoodItem(R.drawable.roll,"Rol","sdsdsd"));
        foodArrayList.add(new FoodItem(R.drawable.roll2,"Rol II","ass"));
        foodArrayList.add(new FoodItem(R.drawable.sanwich,"Sandwich","aaaaa"));


        adapter = new FoodItemAdapter(foodArrayList,this);
        foodRV.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void setUpRecycleView() {
        foodRV.setHasFixedSize(true);
        foodRV.setLayoutManager(new LinearLayoutManager(this));
    }

    private void  init(){
        foodArrayList = new ArrayList<>();
        foodRV = findViewById(R.id.foodRV);

    }





}