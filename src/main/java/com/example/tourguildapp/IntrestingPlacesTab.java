package com.example.tourguildapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class IntrestingPlacesTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main2, container, false);

        ArrayList<DesignClass> arrayList = new ArrayList<>();
        arrayList.add(new DesignClass(R.drawable.zamek, "Zamek Lubelski", "Zamkowa 9, 20-117 Lublin", "81 532 17 43"));
        arrayList.add(new DesignClass(R.drawable.brama, "Brama Krakowska", "Bramowa 2, 20-400 Lublin", "81 532 60 01"));
        arrayList.add(new DesignClass(R.drawable.majdanek, "Majdanek", "Droga Męczenników Majdanka 67, 20-325 Lublin", "81 710 28 33"));
        arrayList.add(new DesignClass(R.drawable.katedra, "Katedra Św Jana Chrzciciela", "Królewska 10, 20-109 Lublin", "81 532 11 96"));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}