package com.example.petshop;   // 这里用你自己项目的包名

import java.util.Date;

public abstract class Mood {
    private Date date;
    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMoodMessage();
}
