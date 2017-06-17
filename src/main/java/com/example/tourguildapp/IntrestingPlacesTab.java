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
        arrayList.add(new DesignClass(R.drawable.zamek, "Zamek", "Lublin"));
        arrayList.add(new DesignClass(R.drawable.brama, "Brama Krakowska", "Lublin"));
        arrayList.add(new DesignClass(R.drawable.majdanek, "Majdanek", "Lublin"));
        arrayList.add(new DesignClass(R.drawable.katedra, "Katedra Św Jana Chrzciciela", "Lublin"));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}