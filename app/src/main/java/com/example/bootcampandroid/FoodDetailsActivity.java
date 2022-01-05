package com.example.bootcampandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bootcampandroid.model.FoodItem;

public class FoodDetailsActivity extends AppCompatActivity {

    private TextView name;
    private String position;
    private FoodItem item;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        item = (FoodItem) getIntent().getExtras().getSerializable("food");
        name = findViewById(R.id.name);
        button = findViewById(R.id.button);

        name.setText(item.getDesc());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phn = "01700000000";
                String uri = "tel:" +phn ;

                String website = "www.google.com";

               /* Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);*/

                String url = "https://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


    }
}