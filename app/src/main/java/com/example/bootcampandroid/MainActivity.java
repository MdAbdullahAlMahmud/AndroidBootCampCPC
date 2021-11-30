package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bootcampandroid.adapter.FoodAdapter;
import com.example.bootcampandroid.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView foodRV;

    private ArrayList<Food> foodArrayList;

    private FoodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        foodArrayList = new ArrayList<>();

        foodArrayList.add(new Food(R.drawable.burger,"Burger"));
        foodArrayList.add(new Food(R.drawable.chicken_fry,"Chicken Fry"));
        foodArrayList.add(new Food(R.drawable.food1,"Mix Food"));
        foodArrayList.add(new Food(R.drawable.grill,"Grill"));
        foodArrayList.add(new Food(R.drawable.hot_dogs,"Hot Dog"));
        foodArrayList.add(new Food(R.drawable.pizza,"Pizza"));
        foodArrayList.add(new Food(R.drawable.roll,"Rol"));
        foodArrayList.add(new Food(R.drawable.roll2,"Rol II"));
        foodArrayList.add(new Food(R.drawable.sanwich,"Sandwich"));


        init();
        setUpRecycleView();


        adapter = new FoodAdapter(foodArrayList);
        foodRV.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    private void setUpRecycleView() {

        foodRV.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        foodRV.setLayoutManager(linearLayoutManager);




    }


    private void init(){
        foodRV= findViewById(R.id.foodRV);
    }
}