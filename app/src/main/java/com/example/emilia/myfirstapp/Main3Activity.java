package com.example.emilia.myfirstapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    //creating a var for the listview to use it anywhere (more than once)
    ListView myListView;
    String[] items;
    String[] descriptions;

    FoodPlace BarrettDiningCenter = new FoodPlace("Barrett Dining Center");
    FoodPlace Hassayampa = new FoodPlace("Hassayampa");
    FoodPlace ManzanitaDining = new FoodPlace("Manzanita Dining");
    FoodPlace Pitchforks = new FoodPlace("Pitchforks");
    FoodPlace TookerHouseDining = new FoodPlace("Tooker House Dining");
    FoodPlace AFC = new FoodPlace("AFC");
    FoodPlace BurgerKing = new FoodPlace("Burger King");
    FoodPlace ChickFilA = new FoodPlace("Chick-fil-A");
    FoodPlace ChickIn = new FoodPlace("Chick-In");
    FoodPlace DevilsGreens = new FoodPlace("Devil\'s Greens");
    FoodPlace DogsHouse = new FoodPlace("DogsHouse");
    FoodPlace Dominos = new FoodPlace("Domino\'s");
    FoodPlace EinsteinBrosBagels = new FoodPlace("Einstein Bros Bagels");
    FoodPlace Engrained = new FoodPlace("Engrained");
    FoodPlace Freshii = new FoodPlace("Freshii");
    FoodPlace JambaJuice = new FoodPlace("Jamba Juice");
    FoodPlace Qdoba = new FoodPlace("Qdoba");
    FoodPlace PeiWei = new FoodPlace("Pei Wei");
    FoodPlace Subway = new FoodPlace("Subway");
    FoodPlace TheCrepeClub = new FoodPlace("The Crepe Club");
    FoodPlace DonerDudes = new FoodPlace("DonerDudes");
    FoodPlace RosiesAtMU = new FoodPlace("RosiesAtMU");
    FoodPlace BurningBCafes = new FoodPlace("BurningBCafes");
    FoodPlace CharliesCafe = new FoodPlace("Charlie\'s Cafe");
    FoodPlace Starbucks = new FoodPlace("Starbucks");
    FoodPlace SonoraMarket = new FoodPlace("Sonora Market");
    FoodPlace PodMarket = new FoodPlace("POD Market");

    FoodPlace[] placesList = {BarrettDiningCenter, Hassayampa, ManzanitaDining, Pitchforks, TookerHouseDining, AFC, BurgerKing, ChickFilA,
            ChickIn, DevilsGreens, DogsHouse, Dominos, EinsteinBrosBagels, Engrained, Freshii, JambaJuice, Qdoba, PeiWei,
            Subway, TheCrepeClub, DonerDudes, RosiesAtMU, BurningBCafes, CharliesCafe, Starbucks, SonoraMarket, PodMarket};

    ArrayList foodToRecommend = new ArrayList();

    //addressing an object RestPref

    @Override
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


public FoodPlace[] recommendPlaces(RestPref restPref){
    for(int i = 0; i < placesList.length; i++){
        if((restPref.isVeg().equals(placesList[i].isVegetarian()) &&
                (restPref.isVegan().equals(placesList[i].isVegan()) &&
                (restPref.isGF().equals(placesList[i].isGlutenFree()) &&
                (restPref.likesJap().equals(placesList[i].isJapanese()) &&
                (restPref.likesChin().equals(placesList[i].isChinese()) &&
                (restPref.likesInd().equals(placesList[i].isIndian()) &&
                (restPref.likesMed().equals(placesList[i].isMediterranean()) &&
                (restPref.likesPiz().equals(placesList[i].isPizza()) &&
                (restPref.likesBG().equals(placesList[i].isBakedGoods()) &&
                (restPref.likesTexmex().equals(placesList[i].isMexican()) &&
                (restPref.likesChick().equals(placesList[i].isChicken()) &&
                (restPref.likesBurg().equals(placesList[i].isBurgers()) &&
                (restPref.payCheap().equals(placesList[i].price) &&
                (restPref.payMid().equals(placesList[i].price) &&
                (restPref.payExpen().equals(placesList[i].price)){

        }

    }
}

