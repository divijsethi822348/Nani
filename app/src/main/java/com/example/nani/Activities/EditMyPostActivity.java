package com.example.nani.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.Adapters.MyPostEditAdapter;
import com.example.nani.R;

public class EditMyPostActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText desc, loi, smp, pia, aller;
    private Button editBut, saveBut;
    private RecyclerView recyclerView;
    private MyPostEditAdapter myAd;
    public static boolean showCloseImage = false;
    private ImageView back;
    private TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_my_post);
        recyclerView = findViewById(R.id.my_post_edit_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        myAd = new MyPostEditAdapter(this);
        showCloseImage=false;
        recyclerView.setAdapter(myAd);
        initIds();
        setClicks();

    }


    private void initIds() {
        desc = findViewById(R.id.my_post_edit_desc);
        loi = findViewById(R.id.my_post_edit_loi);
        smp = findViewById(R.id.my_post_edit_smp);
        pia = findViewById(R.id.my_post_edit_pia);
        aller = findViewById(R.id.my_post_edit_aller);
        editBut = findViewById(R.id.edit_btn_my_post);
        saveBut = findViewById(R.id.save_btn_my_post);
        saveBut.setVisibility(View.GONE);
        back=findViewById(R.id.appbar_small_image1);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Edit Post");

    }

    private void setClicks() {
        editBut.setOnClickListener(this);
        saveBut.setOnClickListener(this);
        back.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.edit_btn_my_post:
                editBut.setVisibility(View.GONE);
                saveBut.setVisibility(View.VISIBLE);
                desc.setEnabled(true);
                loi.setEnabled(true);
                smp.setEnabled(true);
                pia.setEnabled(true);
                aller.setEnabled(true);
                showCloseImage = true;
                myAd.notifyDataSetChanged();
                break;
            case R.id.save_btn_my_post:
                saveBut.setVisibility(View.GONE);
                editBut.setVisibility(View.VISIBLE);
                desc.setEnabled(false);
                loi.setEnabled(false);
                smp.setEnabled(false);
                pia.setEnabled(false);
                aller.setEnabled(false);
                showCloseImage = false;
                myAd.notifyDataSetChanged();
                break;
            case R.id.appbar_small_image1:
                finish();
                break;
        }
    }
}