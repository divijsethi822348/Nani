package com.example.nani.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.nani.Fragments.AddItemFragment;
import com.example.nani.Fragments.DiscoverFragment;
import com.example.nani.Fragments.HomeFragment;
import com.example.nani.Fragments.ProfileFragment;
import com.example.nani.Fragments.SettingFragment;
import com.example.nani.R;
import com.makeramen.roundedimageview.RoundedImageView;

public class HomeNaniActivity extends AppCompatActivity implements View.OnClickListener {
    FrameLayout homeFrameNani;
    RelativeLayout home_nani_layout, discover_nani_layout,profile_nani_layout, setting_nani_layout, content_home_nani;
    TextView home_text_nani, discover_nani_text, profile_nani_text, setting_nani_text, title_nani;
    ImageView home_img_nani, discover_img_nani, profile_img_nani, setting_img_nani, navigation_image_nani, notifications_nani;
    View home_view_nani, discover_view_nani, profile_view_nani, setting_view_nani;
    DrawerLayout drawerLayout_nani;
    RoundedImageView add_item;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_nani);
        inintIds();
        setClicks();
        SelectFragment(new HomeFragment());
        setNavigationDrawer();

    }

    private void setNavigationDrawer() {
        drawerLayout_nani.setScrimColor(Color.TRANSPARENT);
        drawerLayout_nani.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {
                content_home_nani.setX(view.getWidth()*v);
            }

            @Override
            public void onDrawerOpened(@NonNull View view) {

            }

            @Override
            public void onDrawerClosed(@NonNull View view) {

            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });
    }

    private void SelectFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_home_nani_activity,fragment);
        transaction.commit();

    }

    private void inintIds() {
        homeFrameNani =findViewById(R.id.frame_home_nani_activity);
        home_img_nani =findViewById(R.id.home_img_nani);
        home_nani_layout =findViewById(R.id.home_navigator_nani);
        home_text_nani =findViewById(R.id.home_text_home_nani);
        home_view_nani =findViewById(R.id.home_bottom_view_nani);
        discover_img_nani =findViewById(R.id.discover_img_nani);
        discover_nani_layout =findViewById(R.id.discover_navigator_nani);
        discover_nani_text =findViewById(R.id.discover_text_home_nani);
        discover_view_nani =findViewById(R.id.discover_bottom_view_nani);
        profile_img_nani =findViewById(R.id.profile_img_nani);
        profile_nani_layout=findViewById(R.id.profile_navigator_nani);
        profile_nani_text =findViewById(R.id.profile_text_home_nani);
        profile_view_nani =findViewById(R.id.profile_bottom_view_nani);
        setting_img_nani =findViewById(R.id.setting_img_nani);
        setting_nani_layout =findViewById(R.id.setting_navigator_nani);
        setting_nani_text =findViewById(R.id.setting_text_home_nani);
        setting_view_nani =findViewById(R.id.setting_bottom_view_nani);
        add_item=findViewById(R.id.add_item_home_nani_activity);
        navigation_image_nani =findViewById(R.id.appbar_large_image1);
        drawerLayout_nani =findViewById(R.id.drawer_home_nani);
        content_home_nani =findViewById(R.id.content_home_nani);
        notifications_nani =findViewById(R.id.appbar_large_image2);
        title_nani =findViewById(R.id.title_app_bar_large);



    }

    private void setClicks() {
        home_nani_layout.setOnClickListener(this);
        discover_nani_layout.setOnClickListener(this);
        profile_nani_layout.setOnClickListener(this);
        setting_nani_layout.setOnClickListener(this);
        add_item.setOnClickListener(this);
        navigation_image_nani.setOnClickListener(this);
        notifications_nani.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_navigator_nani:
                title_nani.setText("Home");
                home_nani_layout.setBackgroundColor(Color.parseColor("#E3EFF2"));
                home_text_nani.setTextColor(Color.parseColor("#fd6038"));
                home_view_nani.setVisibility(View.VISIBLE);
                home_img_nani.setImageResource(R.drawable.home_selected);
                discover_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_nani.setVisibility(View.GONE);
                discover_img_nani.setImageResource(R.drawable.discover_unselected);
                profile_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_nani.setVisibility(View.GONE);
                profile_img_nani.setImageResource(R.drawable.profile_unselected);
                setting_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_nani.setVisibility(View.GONE);
                setting_img_nani.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new HomeFragment());
                break;

            case R.id.discover_navigator_nani:
                title_nani.setText("Discover");
                home_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_nani.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_nani.setVisibility(View.GONE);
                home_img_nani.setImageResource(R.drawable.home_unselected);
                discover_nani_layout.setBackgroundColor(Color.parseColor("#E3EFF2"));
                discover_nani_text.setTextColor(Color.parseColor("#fd6038"));
                discover_view_nani.setVisibility(View.VISIBLE);
                discover_img_nani.setImageResource(R.drawable.discover_selected);
                profile_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_nani.setVisibility(View.GONE);
                profile_img_nani.setImageResource(R.drawable.profile_unselected);
                setting_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_nani.setVisibility(View.GONE);
                setting_img_nani.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new DiscoverFragment());
                break;

            case R.id.profile_navigator_nani:
                title_nani.setText("Profile");
                home_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_nani.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_nani.setVisibility(View.GONE);
                home_img_nani.setImageResource(R.drawable.home_unselected);
                discover_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_nani.setVisibility(View.GONE);
                discover_img_nani.setImageResource(R.drawable.discover_unselected);
                profile_nani_layout.setBackgroundColor(Color.parseColor("#E3EFF2"));
                profile_nani_text.setTextColor(Color.parseColor("#fd6038"));
                profile_view_nani.setVisibility(View.VISIBLE);
                profile_img_nani.setImageResource(R.drawable.profile_selected);
                setting_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_nani.setVisibility(View.GONE);
                setting_img_nani.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new ProfileFragment());
                break;

            case R.id.setting_navigator_nani:
                title_nani.setText("Setting");
                home_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_nani.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_nani.setVisibility(View.GONE);
                home_img_nani.setImageResource(R.drawable.home_unselected);
                discover_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_nani.setVisibility(View.GONE);
                discover_img_nani.setImageResource(R.drawable.discover_unselected);
                profile_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_nani.setVisibility(View.GONE);
                profile_img_nani.setImageResource(R.drawable.profile_unselected);
                setting_nani_layout.setBackgroundColor(Color.parseColor("#E3EFF2"));
                setting_nani_text.setTextColor(Color.parseColor("#fd6038"));
                setting_view_nani.setVisibility(View.VISIBLE);
                setting_img_nani.setImageResource(R.drawable.setting_selected);
                SelectFragment(new SettingFragment());
                break;

            case R.id.add_item_home_nani_activity:
                title_nani.setText("Add item");
                home_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_nani.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_nani.setVisibility(View.GONE);
                home_img_nani.setImageResource(R.drawable.home_unselected);
                discover_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_nani.setVisibility(View.GONE);
                discover_img_nani.setImageResource(R.drawable.discover_unselected);
                profile_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_nani.setVisibility(View.GONE);
                profile_img_nani.setImageResource(R.drawable.profile_unselected);
                setting_nani_layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_nani_text.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_nani.setVisibility(View.GONE);
                setting_img_nani.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new AddItemFragment());
                break;

            case R.id.appbar_large_image1:
                drawerLayout_nani.openDrawer(Gravity.START);
                break;

            case R.id.appbar_large_image2:
                startActivity(new Intent(HomeNaniActivity.this,NotificationsActivity.class));



        }

    }
}
