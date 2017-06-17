package com.example.tourguildapp;

public class DesignClass {

    private static final String NO_ADDRESS_PROVIDED = "None";
    private int mImageResource;
    private String mName;
    private String mAdress;
    private String mPhone;

    public DesignClass(int mImageResource, String mName, String mAdress, String mPhone) {
        this.mImageResource = mImageResource;
        this.mName = mName;
        this.mAdress = mAdress;
        this.mPhone = mPhone;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmName() {
        return mName;
    }

    public String getmAdress() {
        return mAdress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public boolean hasAddress() {
        return mAdress != NO_ADDRESS_PROVIDED;
    }
}
