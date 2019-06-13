package com.example.nani.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.OrderCompletedRecyclerAdapter;
import com.example.nani.R;

public class OrderCancelledActivity extends AppCompatActivity {
    TextView title;
    ImageView back;
    RecyclerView food_images_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_cancelled);
        title=findViewById(R.id.title_app_bar_small);
        food_images_recycler=findViewById(R.id.order_cancelled_recycler);
        title.setText("Order Cancelled");
        back=findViewById(R.id.appbar_small_image1);


        food_images_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        food_images_recycler.setAdapter(new OrderCompletedRecyclerAdapter(this));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
