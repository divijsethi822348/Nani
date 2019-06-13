package com.example.nani.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.PaymentsNaniRecyclerAdapter;
import com.example.nani.R;

public class PaymentNaniActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PaymentsNaniRecyclerAdapter myAd;
    TextView title;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_nani);
        recyclerView = findViewById(R.id.all_payments_recycler_view);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Payments");
        back=findViewById(R.id.appbar_small_image1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAd = new PaymentsNaniRecyclerAdapter(this);
        recyclerView.setAdapter(myAd);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

