package com.example.nani.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.nani.R;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout creditCard, debitCard;
    private TextView onCC, onDC, saveCreditFuturePay, saveDebitFuturePay,title;
    private String inputCCN, inputDCN;
    private EditText inputCreditCardDetails, inputDebitCardDetails, creditExpiry, debitExpiry, creditCVV, debitCVV;
    private Button creditProceed, debitProceed;
    private int a = 0;
    private int b = 0;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        initIds();
        setClicks();

        creditCard.setVisibility(View.GONE);
        debitCard.setVisibility(View.VISIBLE);
        onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_circle,0, 0, 0);
    }


    private void initIds()
    {
        creditCard = findViewById(R.id.details_credit_card);
        debitCard = findViewById(R.id.details_debit_card);
        inputCreditCardDetails = findViewById(R.id.input_card_details);
        onCC = findViewById(R.id.payment_credit_card_text);
        onDC = findViewById(R.id.payment_debit_card_text);
        inputDebitCardDetails = findViewById(R.id.input_debit_card_details);
        creditExpiry = findViewById(R.id.input_expiry_valid_details);
        debitExpiry = findViewById(R.id.input_debit_expiry_valid_details);
        creditCVV = findViewById(R.id.input_cvv_details);
        debitCVV = findViewById(R.id.input_debit_cvv_details);
        creditProceed = findViewById(R.id.credit_payment_proceed_button);
        debitProceed =findViewById(R.id.debit_payment_proceed_button);
        saveCreditFuturePay = findViewById(R.id.payment_save_details_future);
        saveDebitFuturePay = findViewById(R.id.debit_payment_save_details_future);
        title=findViewById(R.id.title_app_bar_small);
        title.setText("Choose Payment Method");
        back=findViewById(R.id.appbar_small_image1);

    }


    private void setClicks()
    {
        creditProceed.setOnClickListener(this);
        debitProceed.setOnClickListener(this);
        onDC.setOnClickListener(this);
        onCC.setOnClickListener(this);
        saveCreditFuturePay.setOnClickListener(this);
        saveDebitFuturePay.setOnClickListener(this);
        back.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.payment_debit_card_text:
                if(creditCard.getVisibility() == View.GONE) {
                    if (debitCard.getVisibility() == View.VISIBLE) {
                        debitCard.setVisibility(View.GONE);
                        onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    }
                    else {
                        debitCard.setVisibility(View.VISIBLE);
                        onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_circle,0, 0, 0);

                    }
                }
                if(creditCard.getVisibility() == View.VISIBLE)
                {
                    creditCard.setVisibility(View.GONE);
                    onCC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    if (debitCard.getVisibility() == View.VISIBLE) {
                        debitCard.setVisibility(View.GONE);
                        onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    }
                    else {
                        debitCard.setVisibility(View.VISIBLE);
                        onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_circle,0, 0, 0);
                    }
                }
                inputCreditCardDetails.setText("");
                creditExpiry.setText("");
                creditCVV.setText("");
                saveCreditFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_future_payment_rounded_square,0, 0, 0);
                break;

            case R.id.payment_credit_card_text:
                if(debitCard.getVisibility() == View.GONE)
                {
                    if (creditCard.getVisibility() == View.VISIBLE)
                    {
                        creditCard.setVisibility(View.GONE);
                        onCC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    }
                    else
                    {
                        creditCard.setVisibility(View.VISIBLE);
                        onCC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_circle,0, 0, 0);
                    }
                }
                if(debitCard.getVisibility() == View.VISIBLE)
                {
                    debitCard.setVisibility(View.GONE);
                    onDC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    if (creditCard.getVisibility() == View.VISIBLE) {
                        creditCard.setVisibility(View.GONE);
                        onCC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_payment_option_selector,0, 0, 0);
                    }
                    else {
                        creditCard.setVisibility(View.VISIBLE);
                        onCC.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_circle,0, 0, 0);
                    }
                }
                inputDebitCardDetails.setText("");
                debitExpiry.setText("");
                debitCVV.setText("");
                saveDebitFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_future_payment_rounded_square,0, 0, 0);
                break;

            case R.id.payment_save_details_future:



                if(a == 0)
                {
                    saveCreditFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.future_pay_selected,0, 0, 0);
                    a = 1;
                }

                else if(a == 1)
                {
                    saveCreditFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_future_payment_rounded_square,0, 0, 0);
                    a = 0;
                }
                break;

            case R.id.debit_payment_save_details_future:
                if(b == 0)
                {
                    saveDebitFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.future_pay_selected,0, 0, 0);
                    b = 1;
                }
                else if(b == 1)
                {
                    saveDebitFuturePay.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_future_payment_rounded_square,0, 0, 0);
                    b = 0;
                }
                break;


            case R.id.credit_payment_proceed_button:
                startActivity(new Intent(PaymentActivity.this,OrderDetailsActivity.class));
                break;

            case R.id.debit_payment_proceed_button:
                startActivity(new Intent(PaymentActivity.this,OrderDetailsActivity.class));
                break;

            case R.id.appbar_small_image1:
                finish();
                break;


        }
    }





}
