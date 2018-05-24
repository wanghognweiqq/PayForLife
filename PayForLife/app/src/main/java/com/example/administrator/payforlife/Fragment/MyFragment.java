package com.example.administrator.payforlife.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.payforlife.Activity.CashActivity;
import com.example.administrator.payforlife.Activity.Personal_propertyActivity;
import com.example.administrator.payforlife.Activity.Setting_Activity;
import com.example.administrator.payforlife.R;

/**
 * Created by Administrator on 2018/5/23 0023.
 */

public class MyFragment extends Fragment {
    private Context mContext;
    private TextView tvInstall;
    private Button btnBalance;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.my_layout,container,false);
        tvInstall=view.findViewById(R.id.tv_install);
        btnBalance=view.findViewById(R.id.btn_balance);

        tvInstall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(mContext, Setting_Activity.class);
                startActivity(intent);
            }
        });

        btnBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(mContext, Personal_propertyActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        this.mContext=context;
        super.onAttach(context);
    }
}
