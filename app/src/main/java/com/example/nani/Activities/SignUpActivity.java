package com.example.nani.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nani.R;
import com.example.nani.Util.App;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    TextView sign_in;
    Button sign_up;
    String userType="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initIds();
        setClicks();
    }
    private void initIds() {
        sign_in=findViewById(R.id.sign_in_text_signup);
        sign_up=findViewById(R.id.sign_up_button_signup);



    }

    private void setClicks() {
        sign_in.setOnClickListener(this);
        sign_up.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sign_in_text_signup:
                startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
                break;

            case R.id.sign_up_button_signup:
                userType= App.getSingleton().getUserType();
                if (userType.equalsIgnoreCase("Buyer")){
                    startActivity(new Intent(SignUpActivity.this,OtpVerification.class));
                }else if (userType.equalsIgnoreCase("Nani")){
                    startActivity(new Intent(SignUpActivity.this,BankDetails.class));
                }

                break;
        }
    }
}
