package com.example.nani.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.MyOrdersBuyerRecyclerAdapter;
import com.example.nani.R;

import java.util.ArrayList;
import java.util.List;

public class MyOrdersBuyer extends AppCompatActivity {
    RecyclerView myOrdersBuyer;
    List<String> status=new ArrayList<>();
    TextView title;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders_buyer);
        myOrdersBuyer=findViewById(R.id.my_orders_buyer_recycler);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("My Orders");
        back=findViewById(R.id.appbar_small_image1);
        myOrdersBuyer.setLayoutManager(new LinearLayoutManager(this));
        status.add("Confirm");
        status.add("Cancel");
        status.add("Completed");
        MyOrdersBuyerRecyclerAdapter adapter=new MyOrdersBuyerRecyclerAdapter(MyOrdersBuyer.this,status);
        myOrdersBuyer.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
