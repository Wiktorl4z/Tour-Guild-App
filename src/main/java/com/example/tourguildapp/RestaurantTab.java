package com.example.tourguildapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main2, container, false);
        ArrayList<DesignClass> arrayList = new ArrayList<>();
        arrayList.add(new DesignClass(R.drawable.czarcia_lapa, getString(R.string.czarcia), getString(R.string.runekAdress), getString(R.string.czarciaNumber)));
        arrayList.add(new DesignClass(R.drawable.stol_wol, getString(R.string.stolIWol), getString(R.string.bramaAdress), getString(R.string.stolNumber)));
        arrayList.add(new DesignClass(R.drawable.zydowska, getString(R.string.zydowska), getString(R.string.rynekAdress), getString(R.string.rynekNumber)));
        arrayList.add(new DesignClass(R.drawable.perlowa_pijalnia, getString(R.string.perlowa), getString(R.string.bernardynskaAdress), getString(R.string.perlowaNumber)));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);
        return view;
    }
}