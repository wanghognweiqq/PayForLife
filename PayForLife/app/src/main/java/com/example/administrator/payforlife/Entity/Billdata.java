package com.example.administrator.payforlife.Entity;

public class Billdata {

    public Billdata(String name, int iconid, String money) {
        super();
        this.name = name;
        this.iconid = iconid;
        this.money = money;
    }

    private String name;
    private int iconid;
    private String money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconid() {
        return iconid;
    }

    public void setIconid(int iconid) {
        this.iconid = iconid;
    }

    public String getMoney() {
        return money;
    }

    public void setSex(String money) {
        this.money = money;
    }
}
