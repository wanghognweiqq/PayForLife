package com.example.administrator.payforlife.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.payforlife.Adapter.TurnMoneyFriendAdapter;
import com.example.administrator.payforlife.Entity.Friend;
import com.example.administrator.payforlife.Fragment.ShouyeFragment;
import com.example.administrator.payforlife.R;

import java.util.ArrayList;
import java.util.List;

public class TurnMoneyActivity extends AppCompatActivity {
    private ListView  listView;
    private TextView tvTurnMoneyHonme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_money);
        listView=findViewById(R.id.lv_turnfriend);
        TurnMoneyFriendAdapter adapter=new TurnMoneyFriendAdapter(this,R.layout.turnmoney_friend_item,getTurnData());
        listView.setAdapter(adapter);
        tvTurnMoneyHonme=findViewById(R.id.tv_turnMoneyHome);
        tvTurnMoneyHonme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private List<Friend> getTurnData(){
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

