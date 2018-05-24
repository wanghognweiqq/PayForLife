package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.payforlife.R;

public class CashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash);
    }
    public void goback(View view){
        Intent intent = new Intent();
        intent.setClass(CashActivity.this,Personal_propertyActivity.class);
        startActivity(intent);
    }
}
