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

import com.example.administrator.payforlife.Activity.Personal_propertyActivity;
import com.example.administrator.payforlife.R;

/**
 * Created by Administrator on 2018/5/18 0018.
 */

public class ShouyeFragment extends Fragment {
    private Context mContext;
    private Button btnBalance;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shouye_layout,container,false);
        btnBalance=view.findViewById(R.id.btn_balance);
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
