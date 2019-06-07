package com.example.nani.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.NotificationsRecyclerAdapter;
import com.example.nani.R;

public class NotificationsActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView appBarImage1;
    TextView title;
    RecyclerView notifications_recycler_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        initIds();
        setClicks();
        notifications_recycler_view.setLayoutManager(new LinearLayoutManager(NotificationsActivity.this));
        notifications_recycler_view.setAdapter(new NotificationsRecyclerAdapter(this));

    }


    private void initIds() {
        appBarImage1=findViewById(R.id.appbar_small_image1);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Notification");
        notifications_recycler_view=findViewById(R.id.notifications_recycler_view);

    }

    private void setClicks() {
        appBarImage1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.appbar_small_image1:
                finish();
                break;
        }
    }
}
