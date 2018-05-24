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


    }

    @Override
    public int getItemCount() {
        return chatmsgList.size();
    }
}
