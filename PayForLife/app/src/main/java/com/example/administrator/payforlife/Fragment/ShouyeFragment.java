package com.example.administrator.payforlife.Fragment;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.administrator.payforlife.Activity.BillActivity;
import com.example.administrator.payforlife.Activity.Personal_propertyActivity;
import com.example.administrator.payforlife.Activity.PhonefareActivity;
import com.example.administrator.payforlife.Activity.TurnMoneyActivity;
import com.example.administrator.payforlife.R;

/**
 * Created by Administrator on 2018/5/18 0018.
 */

public class ShouyeFragment extends Fragment {
    private Context mContext;
    private Button btnSqc;
    private Button btnPay;
    private Button btnCallPay;
    private Button btnBalance;
    private Button btnTurnMoney;
    private Button btnMyBill;

    private Button btnCamra;
    private ImageView ivPhoto;
    private final int CAMERA_REQUEST = 8888;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shouye_layout,container,false);

        getViews(view);
        OnClickListenerImpl listener=new OnClickListenerImpl();
        btnTurnMoney.setOnClickListener(listener);
        btnBalance.setOnClickListener(listener);
        btnSqc.setOnClickListener(listener);

        btnPay.setOnClickListener(listener);
        btnCallPay.setOnClickListener(listener);
        btnMyBill.setOnClickListener(listener);
        return view;

    }


    private class OnClickListenerImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_sqc:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        requestPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
                        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(cameraIntent, CAMERA_REQUEST);

                    }
                    break;
                case R.id.btn_pay:

                    break;
                case R.id.btn_callPay:
                    Intent intent2=new Intent();
                    intent2.setClass(mContext, PhonefareActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.btn_balance:
                    Intent intent=new Intent();
                    intent.setClass(mContext, Personal_propertyActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_turn:
                    Intent intent1=new Intent();
                    intent1.setClass(mContext, TurnMoneyActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.btn_myBill:
                    Intent intent3=new Intent();
                    intent3.setClass(mContext, BillActivity.class);
                    startActivity(intent3);
                    break;
            }

        }
    }

    private void getViews(View view) {
        btnSqc=view.findViewById(R.id.btn_sqc);
        btnPay=view.findViewById(R.id.btn_pay);
        btnCallPay=view.findViewById(R.id.btn_callPay);
        btnBalance=view.findViewById(R.id.btn_balance);
        btnTurnMoney=view.findViewById(R.id.btn_turn);
        btnMyBill=view.findViewById(R.id.btn_myBill);
        btnCamra = view.findViewById(R.id.btn_sqc);
//        ivPhoto = view.findViewById(R.id.iv_photo);
    }

    @Override
    public void onAttach(Context context) {
        this.mContext=context;
        super.onAttach(context);
    }


}

