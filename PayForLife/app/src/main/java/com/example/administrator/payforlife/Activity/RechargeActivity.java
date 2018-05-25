package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.payforlife.R;

public class RechargeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);
    }
    public void goback(View view){
        Intent intent = new Intent();
        intent.setClass(RechargeActivity.this,Personal_propertyActivity.class);
        startActivity(intent);
    }
}
