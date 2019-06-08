package com.example.nani.Activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.nani.Fragments.DiscoverFragment;
import com.example.nani.Fragments.HomeFragment;
import com.example.nani.Fragments.ProfileFragment;
import com.example.nani.Fragments.SettingFragment;
import com.example.nani.R;
import com.example.nani.Util.App;

public class HomeBuyerActivity extends AppCompatActivity implements View.OnClickListener {
    FrameLayout homeFrameBuyer;
    RelativeLayout home_layout_buyer, discover_layout_buyer, profile_layout_buyer, setting_layout_buyer, content_home_buyer;
    TextView home_text_buyer, discover_text_buyer, profile_text_buyer, setting_text_buyer, title_buyer;
    ImageView home_img_buyer, discover_img_buyer, profile_img_buyer, setting_img_buyer, navigation_image_buyer, notifications_buyer,rightAppBarImage;
    View home_view_buyer, discover_view_buyer, profile_view_buyer, setting_view_buyer;
    DrawerLayout drawerLayout_buyer;
    Activity activity;
    Boolean LoggedIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_buyer);
        LoggedIn= App.getSingleton().getLoggedIn();
        inintIds();
        setClicks();
        SelectFragment(new HomeFragment());
        setNavigationDrawer();

    }

    private void setNavigationDrawer() {
        drawerLayout_buyer.setScrimColor(Color.TRANSPARENT);
        drawerLayout_buyer.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {
                content_home_buyer.setX(view.getWidth()*v);
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
        transaction.replace(R.id.frame_home_buyer_activity,fragment);
        transaction.commit();

    }

    private void inintIds() {
        homeFrameBuyer =findViewById(R.id.frame_home_buyer_activity);
        home_img_buyer =findViewById(R.id.home_img_buyer);
        home_layout_buyer =findViewById(R.id.home_navigator_buyer);
        home_text_buyer =findViewById(R.id.home_text_home_buyer);
        home_view_buyer =findViewById(R.id.home_bottom_view_buyer);
        discover_img_buyer =findViewById(R.id.discover_img_buyer);
        discover_layout_buyer =findViewById(R.id.discover_navigator_buyer);
        discover_text_buyer =findViewById(R.id.discover_text_home_buyer);
        discover_view_buyer =findViewById(R.id.discover_bottom_view_buyer);
        profile_img_buyer =findViewById(R.id.profile_img_buyer);
        profile_layout_buyer =findViewById(R.id.profile_navigator_buyer);
        profile_text_buyer =findViewById(R.id.profile_text_home_buyer);
        profile_view_buyer =findViewById(R.id.profile_bottom_view_buyer);
        setting_img_buyer =findViewById(R.id.setting_img_buyer);
        setting_layout_buyer =findViewById(R.id.setting_navigator_buyer);
        setting_text_buyer =findViewById(R.id.setting_text_home_buyer);
        setting_view_buyer =findViewById(R.id.setting_bottom_view_buyer);
        navigation_image_buyer =findViewById(R.id.appbar_large_image1);
        drawerLayout_buyer =findViewById(R.id.drawer_home_buyer);
        content_home_buyer =findViewById(R.id.content_home_buyer);
        notifications_buyer =findViewById(R.id.appbar_large_image2);
        title_buyer =findViewById(R.id.title_app_bar_large);
        rightAppBarImage=findViewById(R.id.appbar_large_image2);
        activity=HomeBuyerActivity.this;



    }

    private void setClicks() {
        home_layout_buyer.setOnClickListener(this);
        discover_layout_buyer.setOnClickListener(this);
        profile_layout_buyer.setOnClickListener(this);
        setting_layout_buyer.setOnClickListener(this);
        notifications_buyer.setOnClickListener(this);
        navigation_image_buyer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_navigator_buyer:
                title_buyer.setText("Home");
                home_layout_buyer.setBackgroundColor(Color.parseColor("#E3EFF2"));
                home_text_buyer.setTextColor(Color.parseColor("#fd6038"));
                home_view_buyer.setVisibility(View.VISIBLE);
                home_img_buyer.setImageResource(R.drawable.home_selected);
                discover_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_buyer.setVisibility(View.GONE);
                discover_img_buyer.setImageResource(R.drawable.discover_unselected);
                profile_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_buyer.setVisibility(View.GONE);
                profile_img_buyer.setImageResource(R.drawable.profile_unselected);
                setting_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_buyer.setVisibility(View.GONE);
                setting_img_buyer.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new HomeFragment());
                break;

            case R.id.discover_navigator_buyer:
                title_buyer.setText("Discover");
                rightAppBarImage.setImageResource(R.drawable.search);
                home_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_buyer.setVisibility(View.GONE);
                home_img_buyer.setImageResource(R.drawable.home_unselected);
                discover_layout_buyer.setBackgroundColor(Color.parseColor("#E3EFF2"));
                discover_text_buyer.setTextColor(Color.parseColor("#fd6038"));
                discover_view_buyer.setVisibility(View.VISIBLE);
                discover_img_buyer.setImageResource(R.drawable.discover_selected);
                profile_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_buyer.setVisibility(View.GONE);
                profile_img_buyer.setImageResource(R.drawable.profile_unselected);
                setting_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                setting_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                setting_view_buyer.setVisibility(View.GONE);
                setting_img_buyer.setImageResource(R.drawable.setting_unselected);
                SelectFragment(new DiscoverFragment());
                break;

            case R.id.profile_navigator_buyer:
                if (LoggedIn==false){
                    setAlert();
                    LoggedIn=true;
                }else if (LoggedIn==true){
                    title_buyer.setText("Profile");
                    home_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    home_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                    home_view_buyer.setVisibility(View.GONE);
                    home_img_buyer.setImageResource(R.drawable.home_unselected);
                    discover_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    discover_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                    discover_view_buyer.setVisibility(View.GONE);
                    discover_img_buyer.setImageResource(R.drawable.discover_unselected);
                    profile_layout_buyer.setBackgroundColor(Color.parseColor("#E3EFF2"));
                    profile_text_buyer.setTextColor(Color.parseColor("#fd6038"));
                    profile_view_buyer.setVisibility(View.VISIBLE);
                    profile_img_buyer.setImageResource(R.drawable.profile_selected);
                    setting_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    setting_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                    setting_view_buyer.setVisibility(View.GONE);
                    setting_img_buyer.setImageResource(R.drawable.setting_unselected);
                    SelectFragment(new ProfileFragment());
                }


                break;

            case R.id.setting_navigator_buyer:
                title_buyer.setText("Settings");
                home_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                home_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                home_view_buyer.setVisibility(View.GONE);
                home_img_buyer.setImageResource(R.drawable.home_unselected);
                discover_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discover_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                discover_view_buyer.setVisibility(View.GONE);
                discover_img_buyer.setImageResource(R.drawable.discover_unselected);
                profile_layout_buyer.setBackgroundColor(Color.parseColor("#FFFFFF"));
                profile_text_buyer.setTextColor(Color.parseColor("#AFBFD8"));
                profile_view_buyer.setVisibility(View.GONE);
                profile_img_buyer.setImageResource(R.drawable.profile_unselected);
                setting_layout_buyer.setBackgroundColor(Color.parseColor("#E3EFF2"));
                setting_text_buyer.setTextColor(Color.parseColor("#fd6038"));
                setting_view_buyer.setVisibility(View.VISIBLE);
                setting_img_buyer.setImageResource(R.drawable.setting_selected);
                SelectFragment(new SettingFragment());
                break;


            case R.id.appbar_large_image1:
                drawerLayout_buyer.openDrawer(Gravity.START);
                break;

            case R.id.appbar_large_image2:
                startActivity(new Intent(HomeBuyerActivity.this,NotificationsActivity.class));



        }

    }

    private void setAlert() {
        LayoutInflater factory = LayoutInflater.from(activity);
        final View congDialogBox = factory.inflate(R.layout.buyer_profile_alert, null);
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setView(congDialogBox);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Button signIn=congDialogBox.findViewById(R.id.signIn_profile);
        Button signUp=congDialogBox.findViewById(R.id.signUp_profile);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeBuyerActivity.this,LoginActivity.class));

            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(HomeBuyerActivity.this,SignUpActivity.class));

            }
        });

        dialog.show();
    }
}
