package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.SavedCardsRecyclerAdapter;
import com.example.nani.R;

public class PaymentBuyerActivity extends AppCompatActivity {
    RecyclerView saved_cards;
    TextView title;
    ImageView back;
    TextView add_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_buyer);
        initIds();

        saved_cards=findViewById(R.id.saved_cards_recycler_payment_buyer);
        saved_cards.setLayoutManager(new LinearLayoutManager(this));
        saved_cards.setAdapter(new SavedCardsRecyclerAdapter(this));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        add_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentBuyerActivity.this,AddCardActivity.class));

            }
        });
    }

    private void initIds() {
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Payments");
        back=findViewById(R.id.appbar_small_image1);
        add_card=findViewById(R.id.add_card_text_payment_buyer);
    }
}
