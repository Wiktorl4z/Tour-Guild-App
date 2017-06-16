package com.example.tourguildapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class IntrestingPlaces extends Fragment {

    private LinearLayout linearLayout;
    private ArrayList array;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fun, container, false);

        linearLayout = (LinearLayout) view.findViewById(R.id.linearLayout);
        array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            View partialCell = inflater.inflate(R.layout.partial_info, linearLayout, false);
            linearLayout.addView(partialCell);
        }
        return view;
    }
}