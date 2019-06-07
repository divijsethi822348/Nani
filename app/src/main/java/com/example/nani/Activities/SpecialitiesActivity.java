package com.example.nani.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.nani.Adapters.SpecialitiesListRecyclerAdapter;
import com.example.nani.R;

public class SpecialitiesActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    RecyclerView specialities_list_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialities);
        iniitIds();
        setClicks();

        specialities_list_recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        specialities_list_recycler.setAdapter(new SpecialitiesListRecyclerAdapter(this));
    }



    private void iniitIds() {
        specialities_list_recycler=findViewById(R.id.specialities_list_recycler);
        next=findViewById(R.id.next_button_specialities);

    }


    private void setClicks() {
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next_button_specialities:
                startActivity(new Intent(SpecialitiesActivity.this,OtpVerification.class));
                break;
        }
    }
}
