package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nani.R;

public class BankDetails extends AppCompatActivity implements View.OnClickListener {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);
        initIds();
        setClicks();
    }

    private void setClicks() {
        next.setOnClickListener(this);
    }

    private void initIds() {
        next=findViewById(R.id.next_button_bank_details);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_button_bank_details:
                startActivity(new Intent(BankDetails.this,SpecialitiesActivity.class));
                break;
        }
    }
}
