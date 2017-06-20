package com.example.tourguildapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class GymTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main2, container, false);
        ArrayList<DesignClass> arrayList = new ArrayList<>();
        arrayList.add(new DesignClass(R.drawable.paco_fixed, getString(R.string.paco), getString(R.string.pacoStreet), getString(R.string.pacoNumber)));
        arrayList.add(new DesignClass(R.drawable.samson_fixed, getString(R.string.samson), getString(R.string.samsonAdress), getString(R.string.samsonNumber)));
        arrayList.add(new DesignClass(R.drawable.city_fit, getString(R.string.cityFit), getString(R.string.citiFitAdress), getString(R.string.cityFitNumber)));
        arrayList.add(new DesignClass(R.drawable.dragon_fixed, getString(R.string.dragon), getString(R.string.dragonAdress), getString(R.string.dragonNumber)));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);
        return view;
    }
}