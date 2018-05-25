package com.example.administrator.payforlife.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.payforlife.Adapter.ChattingAdapter;
import com.example.administrator.payforlife.Entity.Chatmsg;
import com.example.administrator.payforlife.Fragment.FriendFragment;
import com.example.administrator.payforlife.R;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {
    private List<Chatmsg> chatmsgList = new ArrayList<>();
    private EditText editText;
    private Button send;
    private Button backtofriend;
    private RecyclerView chatrecyclerview;
    private ChattingAdapter chattingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatting);
        init();
        getview();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        chatrecyclerview.setLayoutManager(layoutManager);
        chattingAdapter = new ChattingAdapter(chatmsgList);
        chatrecyclerview.setAdapter(chattingAdapter);
        onClickedImpl listener = new onClickedImpl();
        send.setOnClickListener(listener);
        backtofriend.setOnClickListener(listener);
    }

    private void getview() {
        editText = findViewById(R.id.et_chatinput);
        send = findViewById(R.id.btn_chatmsgsend);
        chatrecyclerview = findViewById(R.id.rv_chatting);
        backtofriend = findViewById(R.id.btn_chattingtofriend);
    }
    private void init(){
        Chatmsg chatmsg1 = new Chatmsg("hello",0);
        Chatmsg chatmsg2 = new Chatmsg("hello",1);
        chatmsgList.add(chatmsg1);
        chatmsgList.add(chatmsg2);
    }
    public class onClickedImpl implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_chatmsgsend:
                    String content = editText.getText().toString();
                    if (!"".equals(content)) {
                        Chatmsg chatmsg = new Chatmsg(content, Chatmsg.TYPE_SENT);
                        chatmsgList.add(chatmsg);
                        chattingAdapter.notifyItemInserted(chatmsgList.size() - 1);
                        chatrecyclerview.scrollToPosition(chatmsgList.size() - 1);
                        editText.setText("");
                    }
                    break;
                case R.id.btn_chattingtofriend:
                    Intent intent = new Intent(ChatActivity.this,MainActivity.class);
//                    intent.putExtra("fragment","friendfragment");
                    startActivity(intent);
                    break;
            }
        }
    }
}
