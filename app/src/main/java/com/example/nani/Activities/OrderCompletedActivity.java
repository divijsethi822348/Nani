package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.OrderCompletedRecyclerAdapter;
import com.example.nani.R;

public class OrderCompletedActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView food_images_recycler;
    TextView title;
    ImageView back;
    Button repeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_completed);
        initIds();
        setClicks();

        food_images_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        food_images_recycler.setAdapter(new OrderCompletedRecyclerAdapter(this));


    }

    private void initIds() {
        food_images_recycler=findViewById(R.id.order_completed_recycler);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Order Completed");
        back=findViewById(R.id.appbar_small_image1);
        repeat=findViewById(R.id.repeat_btn_order_completed);
    }

    private void setClicks() {
        back.setOnClickListener(this);
        repeat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.appbar_small_image1:
                finish();
                break;
            case R.id.repeat_btn_order_completed:
                startActivity(new Intent(OrderCompletedActivity.this,ChooseAddressActivity.class));
                break;

        }
    }
}
