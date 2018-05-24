package com.example.administrator.payforlife.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.administrator.payforlife.Activity.ChatActivity;
import com.example.administrator.payforlife.Activity.Setting_Activity;
import com.example.administrator.payforlife.Adapter.FriendAdapter;
import com.example.administrator.payforlife.Entity.Friend;
import com.example.administrator.payforlife.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/10.
 */

public class FriendFragment extends Fragment {
    private Context context;
    private List<Friend> friends;
    private FriendAdapter friendAdapter;
    private ListView lvFriend;
    private Button btnSetting;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.friendlist,container,false);
        lvFriend = view.findViewById(R.id.lv_friend);
        btnSetting = view.findViewById(R.id.btn_tosetting);
        friends = getdata();
        friendAdapter = new FriendAdapter(context, R.layout.friend_item,friends);
        lvFriend.setAdapter(friendAdapter);
        lvFriend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(context, ChatActivity.class);
                startActivity(intent);
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Setting_Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    private List<Friend> getdata(){
        List<Friend> friends = new ArrayList<>();
        Friend fri1 = new Friend();
        fri1.setFriendname("Lee");
        fri1.setFriendtime("5-21");
        fri1.setImg(R.mipmap.header_first);
        friends.add(fri1);

        Friend fri2 = new Friend();
        fri2.setFriendname("Davies");
        fri2.setFriendtime("5-20");
        fri2.setImg(R.mipmap.header_second);
        friends.add(fri2);

        Friend fri3 = new Friend();
        fri3.setFriendname("LiLy");
        fri3.setFriendtime("5-22");
        fri3.setImg(R.mipmap.header_four);
        friends.add(fri3);
        return friends;
    }
}
