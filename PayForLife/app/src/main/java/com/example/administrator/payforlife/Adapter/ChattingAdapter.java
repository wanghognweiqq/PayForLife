package com.example.administrator.payforlife.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.payforlife.Entity.Chatmsg;
import com.example.administrator.payforlife.R;

import java.util.List;

/**
 * Created by Administrator on 2018/5/24.
 */

public class ChattingAdapter extends RecyclerView.Adapter<ChattingAdapter.ViewHolder> {
    private List<Chatmsg> chatmsgList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView tvleftchatting;
        TextView tvrightchatting;
        ImageView ivleftchatting;
        ImageView ivrightchatting;

        public ViewHolder(View view) {
            super(view);
            leftLayout = view.findViewById(R.id.chatting_left_layout);
            rightLayout = view.findViewById(R.id.chatting_right_layout);
            tvleftchatting = view.findViewById(R.id.tv_chattinglf);
            tvrightchatting = view.findViewById(R.id.tv_chattingrg);
            ivleftchatting = view.findViewById(R.id.iv_chattinglf);
            ivrightchatting = view.findViewById(R.id.iv_chattingrg);
        }
    }

    public  ChattingAdapter(List<Chatmsg> chatmsgList){
        this.chatmsgList = chatmsgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view   = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chatting_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Chatmsg chatmsg = chatmsgList.get(i);
        if (chatmsg.getType() == Chatmsg.YTPE_RECEIVED) {
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.tvleftchatting.setText(chatmsg.getContent());
        } else if (chatmsg.getType() == Chatmsg.TYPE_SENT){
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.tvrightchatting.setText(chatmsg.getContent());
        }
    }

    @Override
    public int getItemCount() {
        return chatmsgList.size();
    }
}
