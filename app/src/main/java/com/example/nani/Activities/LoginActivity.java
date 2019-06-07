package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nani.R;
import com.example.nani.Util.App;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button sign_in;
    TextView sign_up;
    EditText email,password;
    String mail="",pass="";
    String userType="";
    ImageView eye;
    int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        iniitIds();
        setClicks();
    }

    private void setClicks() {
        sign_up.setOnClickListener(this);
        sign_in.setOnClickListener(this );
        eye.setOnClickListener(this);
    }

    private void iniitIds() {
        sign_in=findViewById(R.id.sign_in_button_login);
        sign_up=findViewById(R.id.sign_up_text_login);
        email=findViewById(R.id.email_et_login);
        password=findViewById(R.id.password_et_login);
        eye=findViewById(R.id.eye_pass_login);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sign_up_text_login:
                startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
                break;
            case R.id.sign_in_button_login:
                userType= App.getSingleton().getUserType();
//                mail=email.getText().toString();
//                pass=password.getText().toString();
//                if (mail.equalsIgnoreCase("")|| mail.equalsIgnoreCase(null) || pass.equalsIgnoreCase("")||pass.equalsIgnoreCase(null)) {
//                    Toast.makeText(this, "Please Enter Both Fields", Toast.LENGTH_SHORT).show();
//                }else {
//                    if (mail.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
//                        if (pass.length()>6){
//                            startActivity(new Intent(LoginActivity.this,HomeNaniActivity.class));
//                        }else {
//                            password.setError("Password should be more than 6 ");
//                        }
//                    }else {
//                        email.setError("Enter a valid email");
//                    }
//                }
                if (userType.equalsIgnoreCase("Nani")){
                    startActivity(new Intent(LoginActivity.this, HomeNaniActivity.class));
                }else if (userType.equalsIgnoreCase("Buyer")){
                    startActivity(new Intent(LoginActivity.this, HomeBuyerActivity.class));
                }

                break;

            case R.id.eye_pass_login:
                if (count%2==0){
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    password.setSelection(password.length());
                    eye.setImageResource(R.drawable.eye);
                }else {
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    password.setSelection(password.length());
                    eye.setImageResource(R.drawable.invisible);
                }
                count++;
        }
    }
}
