package com.example.emilia.myfirstapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    //creating a var for the listview to use it anywhere (more than once)
    ListView myListView;
    String[] items;
    String[] descriptions;
    FoodPlace BarrettDiningCenter = new FoodPlace();

    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendations);

        //create a reference to our resources
        Resources res = getResources();
        //create a reference to our listview in the layout file
        myListView = (ListView) findViewById(R.id.myListView);
        //looking for an array in our resources
        items = res.getStringArray(R.array.items);
        descriptions = res.getStringArray(R.array.descriptions);


        //merging these three arrays into a layout file!

        //create a layout file that will merge the two together (myListView and items)! - was my_listview_detail.xml
        //"this" refers to this list that we're adapting array for, specify layout for the array, give it the array

  //      myListView.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));

        ItemAdapter itemAdapter = new ItemAdapter(this, items, descriptions); //references the item adapter
        //using the newly created item adapter:
        myListView.setAdapter(itemAdapter);

        //creating a new activity that will display info about each item
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                //to know which specific picture to show:
                showDetailActivity.putExtra("com.example.emilia.myfirstapp.ITEM_INDEX", position);
                startActivity(showDetailActivity); //will switch the screen when we click the item
            }
        });
    }
}
