package com.example.nani.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.MyOrderNaniAdapter;
import com.example.nani.R;

public class MyOrdersNani extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyOrderNaniAdapter myAd;
    TextView title;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders_nani);
        initIds();
        recyclerView = findViewById(R.id.my_order_nani_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAd = new MyOrderNaniAdapter(this);
        recyclerView.setAdapter(myAd);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    private void initIds(){
        recyclerView = findViewById(R.id.my_order_nani_recycler);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("My orders");
        back=findViewById(R.id.appbar_small_image1);


    }

}
