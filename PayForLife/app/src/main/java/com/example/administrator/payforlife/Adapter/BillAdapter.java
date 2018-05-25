package com.example.administrator.payforlife.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.payforlife.Entity.Billdata;
import com.example.administrator.payforlife.R;

public class BillAdapter extends BaseAdapter {
    private Context context;

    public BillAdapter(Context context) {
        this.context=context;

    }


    public Context getContext() {
        return context;
    }




    Billdata[] data={new Billdata("徐仁贵",R.drawable.img1,"+12.35"),new Billdata("李云芳", R.drawable.img1, "-25.36")};


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }


    @Override
    public Billdata getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout ll=null;
        if(convertView!=null){
            ll=(LinearLayout) convertView;
        }
        else{
            ll=(LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.bill_zi, null);
        }

        Billdata dt=getItem(position);

        ImageView icon=(ImageView) ll.findViewById(R.id.iconId);
        TextView name=(TextView) ll.findViewById(R.id.name);
        TextView money=(TextView) ll.findViewById(R.id.money);

        icon.setImageResource(dt.getIconid());
        name.setText(dt.getName());
        money.setText(dt.getMoney());

        return ll;
    }

}
