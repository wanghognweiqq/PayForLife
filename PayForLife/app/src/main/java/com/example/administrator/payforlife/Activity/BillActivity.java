package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.administrator.payforlife.Adapter.BillAdapter;
import com.example.administrator.payforlife.R;

public class BillActivity extends AppCompatActivity {

    ListView lv=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill);

        lv=(ListView) findViewById(R.id.listview);
        lv.setAdapter(new BillAdapter(this));
    }

    public void gohome(View view){
        Intent intent = new Intent();
        intent.setClass(BillActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
