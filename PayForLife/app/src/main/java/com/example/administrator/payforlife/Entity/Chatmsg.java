package com.example.administrator.payforlife.Entity;

/**
 * Created by Administrator on 2018/5/24.
 */

public class Chatmsg {
    public static final int YTPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    public String content;
    public int type;

    public Chatmsg (String content,int type){
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
