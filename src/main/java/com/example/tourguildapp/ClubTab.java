package com.example.tourguildapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubTab extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main2, container, false);

        ArrayList<DesignClass> arrayList = new ArrayList<>();
        arrayList.add(new DesignClass(R.drawable.cream_fixed, getString(R.string.creamClub), getString(R.string.jasna_7), getString(R.string.creamNumber)));
        arrayList.add(new DesignClass(R.drawable.czekolada_fixed, getString(R.string.czekoladaClub), getString(R.string.narutowicza9), getString(R.string.czekoladaNumber)));
        arrayList.add(new DesignClass(R.drawable.shine_fixed, getString(R.string.shineClub), getString(R.string.jasna7), getString(R.string.shineNumber)));
        arrayList.add(new DesignClass(R.drawable.silence_fixed, getString(R.string.silenceClub), getString(R.string.radziszewskiego8), getString(R.string.silenceNumber)));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}
