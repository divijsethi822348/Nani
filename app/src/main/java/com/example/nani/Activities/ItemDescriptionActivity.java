package com.example.nani.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.ItemDescriptionImagesRecyclerAdapter;
import com.example.nani.R;
import com.example.nani.Util.App;

public class ItemDescriptionActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btInc, btDec,choose_address;
    private TextView text,title,Quantity;
    int quantity;
    RecyclerView food_images;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);
        initIds();
        if (App.getSingleton().getUserType().equalsIgnoreCase("Nani")){
            btDec.setVisibility(View.GONE);
            btInc.setVisibility(View.GONE);
            choose_address.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            Quantity.setVisibility(View.GONE);
        }
        setClicks();

        food_images.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        food_images.setAdapter(new ItemDescriptionImagesRecyclerAdapter(this));





    }

    private void setClicks() {
        btInc.setOnClickListener(this);
        btDec.setOnClickListener(this);
        choose_address.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    private void initIds() {
        btInc = findViewById(R.id.item_desc_increment);
        btDec = findViewById(R.id.item_desc_decrement);
        text = findViewById(R.id.item_desc_quantity);
        title=findViewById(R.id.title_app_bar_transparent);
        title.setText("Spring Roll");
        back=findViewById(R.id.appbar_transparent_image1);
        back.setImageResource(R.drawable.back);
        title.setTextColor(Color.parseColor("#FFFFFF"));
        food_images=findViewById(R.id.item_desc_images_recycler);
        choose_address=findViewById(R.id.choose_address_btn_item_des);
        Quantity=findViewById(R.id.quantity_text_item_des);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.item_desc_increment:
                quantity=Integer.parseInt(text.getText().toString());
                quantity = quantity + 1;
                text.setText(quantity + "");
                break;

            case R.id.item_desc_decrement:
                quantity=Integer.parseInt(text.getText().toString());
                if(quantity>1) {
                    quantity = quantity - 1;
                    text.setText(quantity + "");
                }
                break;

            case R.id.choose_address_btn_item_des:
                startActivity(new Intent(ItemDescriptionActivity.this,ChooseAddressActivity.class));
                break;
            case R.id.appbar_transparent_image1:
                finish();
                break;
        }

    }
}

