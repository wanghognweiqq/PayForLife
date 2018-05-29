package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.payforlife.Fragment.ShouyeFragment;
import com.example.administrator.payforlife.R;

public class Setting_Activity extends AppCompatActivity {
    private Button btnSettingToHome;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        OnclickedImpl listener = new OnclickedImpl();
        gitview();
        setListener(listener);

    }

    private void setListener(OnclickedImpl listener) {
        btnSettingToHome.setOnClickListener(listener);
        btnLogout.setOnClickListener(listener);
    }

    private void gitview() {
        btnSettingToHome = findViewById(R.id.btn_settingtoshome);
        btnLogout = findViewById(R.id.btn_logout);
    }

    private class OnclickedImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_settingtoshome:
                    Intent intent = new Intent(Setting_Activity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_logout:
                    Intent intent1 = new Intent(Setting_Activity.this,RegisterActivity.class);
                    startActivity(intent1);
            }
        }
    }
}
