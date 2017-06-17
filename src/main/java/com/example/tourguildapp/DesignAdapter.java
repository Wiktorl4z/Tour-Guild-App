package com.example.tourguildapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DesignAdapter extends ArrayAdapter<DesignClass> {

    private static final String LOG_TAG = DesignClass.class.getSimpleName();

    public DesignAdapter(Activity context, ArrayList<DesignClass> designClassAdapters) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, designClassAdapters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.partial_info, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        DesignClass currentlyDesignClassFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentlyDesignClassFlavor.getmName());

        TextView textView = (TextView) listItemView.findViewById(R.id.contact);
        textView.setText(currentlyDesignClassFlavor.getmPhone());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.place);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentlyDesignClassFlavor.getmAdress());
        /*numberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentItem.hasAddress()) {
                    address.setText(currentItem.getAddress());
                    address.setPaintFlags(address.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                    address.setVisibility(View.VISIBLE);
                    addressIcon.setVisibility(View.VISIBLE);
                    address.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String mapAddress = "http://maps.google.co.in/maps?q=" + currentItem.getAddress();
                            Uri mapUri = Uri.parse(mapAddress);
                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                            mapIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            mapIntent.setPackage("com.google.android.apps.maps");
                            _context.getApplicationContext().startActivity(mapIntent);
                        }
                    });
                } else {
                    address.setVisibility(View.GONE);
                    addressIcon.setVisibility(View.GONE);
                }
            }
        });*/

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentlyDesignClassFlavor.getmImageResource());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
