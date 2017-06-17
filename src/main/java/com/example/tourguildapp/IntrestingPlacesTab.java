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
        arrayList.add(new DesignClass(R.drawable.zamek, getString(R.string.zamekLubelski), getString(R.string.zamekAdres), getString(R.string.zamekNumber)));
        arrayList.add(new DesignClass(R.drawable.brama, getString(R.string.bramaKrakowska), getString(R.string.bramaAdres), getString(R.string.bramaNumber)));
        arrayList.add(new DesignClass(R.drawable.majdanek, getString(R.string.majdanek), getString(R.string.drogaAdress), getString(R.string.majdanekNumber)));
        arrayList.add(new DesignClass(R.drawable.katedra, getString(R.string.katedra), getString(R.string.katedraAdress), getString(R.string.katedraNumber)));

        DesignAdapter clubA = new DesignAdapter(getActivity(), arrayList);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.listview_flavor);
        listView.setAdapter(clubA);
        return view;
    }
}