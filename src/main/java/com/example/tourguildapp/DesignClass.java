package com.example.tourguildapp;

public class DesignClass {

    private int mImageResource;
    private String mName;
    private String mPlace;


    public DesignClass(int mImageResource, String mName, String mPlace) {
        this.mImageResource = mImageResource;
        this.mName = mName;
        this.mPlace = mPlace;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmName() {
        return mName;
    }

    public String getmPlace() {
        return mPlace;
    }
}