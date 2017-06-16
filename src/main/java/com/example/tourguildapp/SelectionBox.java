package com.example.tourguildapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectionBox extends Fragment {

    private ImageView mImageView;
    private TextView mName, mPlace;
    private TextView score;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fun, container, false);

        mName = (TextView) rootView.findViewById(R.id.name);
        mPlace = (TextView) rootView.findViewById(R.id.place);
        mImageView = (ImageView) rootView.findViewById(R.id.image);

        return rootView;
    }
}

