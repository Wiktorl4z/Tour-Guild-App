package com.example.tourguildapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Fun extends Fragment {

    private ArrayList array;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main2, container, false);



        ArrayList<Club> arrayList = new ArrayList<>();
        arrayList.add(new Club(R.drawable.cream_fixed, "Cream", "Lublin"));
        arrayList.add(new Club(R.drawable.czekolada_fixed, "Czekolada", "Lublin"));
        arrayList.add(new Club(R.drawable.shine_fixed, "Shine", "Lublin"));
        arrayList.add(new Club(R.drawable.silence_fixed, "Silence", "Lublin"));

        ClubAdapter clubA = new ClubAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}
