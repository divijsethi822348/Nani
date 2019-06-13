package com.example.nani.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.R;

public class ChooseAddressActivity extends AppCompatActivity implements View.OnClickListener {
    TextView title;
    Button procced_to_pay;
    ImageView back;
    ChooseAddressActivity activity;
    int quantite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_address);
        initIds();
        setClicks();


    }

    private void initIds() {
        title=findViewById(R.id.title_app_bar_transparent);
        title.setText("Choose Address");
        back=findViewById(R.id.appbar_transparent_image1);
        procced_to_pay=findViewById(R.id.pay_btn_chosse_aadress);
        activity=ChooseAddressActivity.this;
    }

    private void setClicks() {
        procced_to_pay.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pay_btn_chosse_aadress:
                getCart();
                break;
            case R.id.appbar_transparent_image1:
                finish();
                break;
        }
    }

    private void getCart() {
        LayoutInflater factory = LayoutInflater.from(activity);
        final View congDialogBox = factory.inflate(R.layout.cart_dialog, null);
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setView(congDialogBox);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        final TextView quantity=congDialogBox.findViewById(R.id.quantity_text_cart);
        Button pay=congDialogBox.findViewById(R.id.pay_btn_cart_dialog);
        Button add=congDialogBox.findViewById(R.id.add_quantity_cart);
        Button minus=congDialogBox.findViewById(R.id.minus_quantity_cart);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantite=Integer.parseInt(quantity.getText().toString());
                quantite++;
                quantity.setText(String.valueOf(quantite));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantite=Integer.parseInt(quantity.getText().toString());
                if (quantite>0)
                {
                    quantite--;
                    quantity.setText(String.valueOf(quantite));
                }
            }
        });
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseAddressActivity.this,PaymentActivity.class));
            }
        });

        dialog.show();
    }
}
