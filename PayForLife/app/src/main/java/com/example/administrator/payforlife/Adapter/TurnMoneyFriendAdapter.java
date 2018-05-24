package com.example.administrator.payforlife.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.payforlife.Entity.Friend;
import com.example.administrator.payforlife.R;

import java.util.List;

/**
 * Created by Administrator on 2018/5/24 0024.
 */

public class TurnMoneyFriendAdapter extends ArrayAdapter<Friend> {
    private int resourceId;
    public TurnMoneyFriendAdapter(Context context, int textViewResourceId, List<Friend> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Friend friend = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView iv_header_friend = view.findViewById(R.id.iv_friend);
        TextView tv_name_friend = view.findViewById(R.id.tv_friend_name);
        TextView tv_time_friend = view.findViewById(R.id.tv_time);
        iv_header_friend.setImageResource(friend.getImg());
        tv_name_friend.setText(friend.getFriendname());
        tv_time_friend.setText(friend.getFriendtime());
        return view;
    }
}
