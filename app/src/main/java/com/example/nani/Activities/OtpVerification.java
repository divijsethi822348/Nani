package com.example.nani.Activities;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.nani.R;
import com.example.nani.Util.App;

public class OtpVerification extends AppCompatActivity implements View.OnClickListener {
    EditText otp1,otp2,otp3,otp4;
    Button verify_otp,verify_otp_popup;
    String otp="";
    RelativeLayout layout;
    private Activity activity;
    String userType="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        initIds();
        setClicks();
        setTextWatcher();
    }

    private void initIds() {
        otp1=findViewById(R.id.otp1);
        otp2=findViewById(R.id.otp2);
        otp3=findViewById(R.id.otp3);
        otp4=findViewById(R.id.otp4);
        verify_otp =findViewById(R.id.verify_button_otp);
        layout=findViewById(R.id.otp_layout);
        verify_otp_popup=findViewById(R.id.verify_otp_popup);
        activity=OtpVerification.this;
    }

    private void setClicks() {
        verify_otp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.verify_button_otp:
                verify();
                break;


        }

    }

    private void verify() {
        otp=otp1.getText().toString()+otp2.getText().toString()+otp3.getText().toString()+otp4.getText().toString();
        if (otp.length()==4){
                    LayoutInflater factory = LayoutInflater.from(activity);
                    final View congDialogBox = factory.inflate(R.layout.otp_verification_popup, null);
                    final AlertDialog dialog = new AlertDialog.Builder(this).create();
                    dialog.setView(congDialogBox);
                    dialog.setCancelable(false);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    Button button=congDialogBox.findViewById(R.id.verify_otp_popup);
                    button.setOnClickListener(new View.OnClickListener() {
                        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                        @Override
                        public void onClick(View v) {
                            userType= App.getSingleton().getUserType();
                            if (userType.equalsIgnoreCase("Nani")){
                                App.getSingleton().setLoggedIn(true);
                                finishAffinity();
                                startActivity(new Intent(OtpVerification.this, HomeNaniActivity.class));
                            }else if (userType.equalsIgnoreCase("Buyer")){
                                App.getSingleton().setLoggedIn(true);
                                finishAffinity();
                                startActivity(new Intent(OtpVerification.this, HomeBuyerActivity.class));
                            }

                        }
                    });
                    dialog.show();

        }
        else{
            Toast.makeText(this, "Enter Otp", Toast.LENGTH_SHORT).show();
        }

    }

    private void setTextWatcher() {
        otp1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==1)
                {
                    otp2.requestFocus();
                }
                else if(s.length()==0)
                {

                }
            }
        });

        otp2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==1)
                {
                    otp3.requestFocus();
                }
                else if(s.length()==0)
                {
                    otp1.requestFocus();
                }
            }
        });

        otp3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==1)
                {
                    otp4.requestFocus();
                }
                else if(s.length()==0)
                {
                    otp2.requestFocus();
                }
            }
        });

        otp4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==1)
                {
                }
                else if(s.length()==0)
                {
                    otp3.requestFocus();
                }
            }
        });
    }


}
