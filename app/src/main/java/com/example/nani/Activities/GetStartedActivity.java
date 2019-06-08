package com.example.nani.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nani.Adapters.GetStartedPagerAdapter;
import com.example.nani.R;
import com.example.nani.Util.App;

public class GetStartedActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager aboutPager;
    LinearLayout dots;
    Button nani_button,buyer_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        initIds();
        setOnClicks();

        GetStartedPagerAdapter getStartedPagerAdapter=new GetStartedPagerAdapter(getSupportFragmentManager());
        aboutPager.setAdapter(getStartedPagerAdapter);
        addDotsIndicator(0);

        aboutPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                addDotsIndicator(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    private void setOnClicks() {
        nani_button.setOnClickListener(this);
        buyer_button.setOnClickListener(this);
    }

    private void initIds() {
        aboutPager=findViewById(R.id.get_started_pager);
        dots=findViewById(R.id.dots);
        nani_button=findViewById(R.id.nani_button_get_started);
        buyer_button=findViewById(R.id.buyer_button_get_started);


    }

    private void addDotsIndicator(int position) {

        TextView[] tv_dots = new TextView[3];
        dots.removeAllViews();
        for (int i = 0; i < tv_dots.length; i++) {
            tv_dots[i] = new TextView(getApplicationContext());
            tv_dots[i].setText("- ");
            tv_dots[i].setTextSize(80);
            tv_dots[i].setTextColor(getResources().getColor(R.color.app_gray));
            dots.addView(tv_dots[i]);
        }

        tv_dots[position].setTextColor(Color.parseColor("#fd6038"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nani_button_get_started:
                App.getSingleton().setUserType("Nani");
                nani_button.setBackgroundResource(R.drawable.orange_solid_button);
                nani_button.setTextColor(Color.parseColor("#FFFFFF"));
                startActivity(new Intent(GetStartedActivity.this,LoginActivity.class));
                break;
            case R.id.buyer_button_get_started:
                App.getSingleton().setUserType("Buyer");
                App.getSingleton().setLoggedIn(false);
                buyer_button.setBackgroundResource(R.drawable.orange_solid_button);
                buyer_button.setTextColor(Color.parseColor("#FFFFFF"));
                startActivity(new Intent(GetStartedActivity.this,HomeBuyerActivity.class));
                break;
        }

    }
}
