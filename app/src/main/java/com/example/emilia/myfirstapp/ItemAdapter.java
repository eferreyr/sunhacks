package com.example.emilia.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] items;
    String[] descriptions;
    String[] prices;

    public ItemAdapter(Context context, String[] items, String[] descriptions, String[] prices){
        this.items = items;
        this.descriptions = descriptions;
        this.prices = prices;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() { //counts how many items there are in the list
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { //explains to android how to present the information
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        //working with the three textview elements that will comprise a single list item
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        //retrieving the info about each item
        String name = items[position];
        String descr = descriptions[position];
        String cost = prices[position];

        nameTextView.setText(name);
        descriptionTextView.setText(descr);
        priceTextView.setText(cost);

        return v; //returning the view we've created
    }
}
