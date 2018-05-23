package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.payforlife.R;

public class Personal_propertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_property);
    }
    public void cash(View view){
        Intent intent = new Intent();
        intent.setClass(Personal_propertyActivity.this,CashActivity.class);
        startActivity(intent);
    }
    public void recharge(View view){
        Intent intent = new Intent();
        intent.setClass(Personal_propertyActivity.this,RechargeActivity.class);
        startActivity(intent);
    }
}