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
        arrayList.add(new DesignClass(R.drawable.cream_fixed, "Cream Club", "Jasna 7, 20-077 Lublin", "535 715 692"));
        arrayList.add(new DesignClass(R.drawable.czekolada_fixed, "Czekolada Club", "Narutowicza 9, 20-002 Lublin", "727 507 905"));
        arrayList.add(new DesignClass(R.drawable.shine_fixed, "Shine Club", "Jasna 7, 20-077 Lublin", "725 700 225"));
        arrayList.add(new DesignClass(R.drawable.silence_fixed, "Silence Club", "Radziszewskiego 8, Lublin", "81 477 57 98"));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);

        return view;
    }
}
