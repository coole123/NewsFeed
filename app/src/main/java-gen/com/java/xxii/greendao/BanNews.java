package com.java.xxii.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table BAN_NEWS.
 */
public class BanNews {

    /** Not-null value. */
    private String News_ID;

    public BanNews() {
    }

    public BanNews(String News_ID) {
        this.News_ID = News_ID;
    }

    /** Not-null value. */
    public String getNews_ID() {
        return News_ID;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNews_ID(String News_ID) {
        this.News_ID = News_ID;
    }

}
