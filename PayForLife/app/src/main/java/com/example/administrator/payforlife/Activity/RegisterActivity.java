package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.payforlife.R;

public class RegisterActivity extends AppCompatActivity {
    private Button btnRegistertoLogin;
    private Button btnRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        getview();
        onclickedImpl listener = new onclickedImpl();
        setListener(listener);
    }

    private void setListener(onclickedImpl listener) {
        btnRegistertoLogin.setOnClickListener(listener);
        btnRegistered.setOnClickListener(listener);
    }

    private void getview() {
        btnRegistertoLogin = findViewById(R.id.btn_registertologin);
        btnRegistered = findViewById(R.id.btn_registered);
    }
    private class onclickedImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_registertologin:
                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    break;
            }
        }
    }
}
