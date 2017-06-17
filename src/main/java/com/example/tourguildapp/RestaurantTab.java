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
        arrayList.add(new DesignClass(R.drawable.czarcia_lapa, "Czarcia Lapa", "Rynek 19, 20-111 Lublin", "81 532 82 00"));
        arrayList.add(new DesignClass(R.drawable.stol_wol, "Stol i Wol", "Bramowa 2, 20-111 Lublin", "81 565 55 55"));
        arrayList.add(new DesignClass(R.drawable.zydowska, "Mandragora", "Rynek 9, 20-400 Lublin", "81 536 20 20"));
        arrayList.add(new DesignClass(R.drawable.perlowa_pijalnia, "Perlowa Pijalnia Piwa", "Bernardyńska 15A, 20-001 Lublin", "81 710 12 05"));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}