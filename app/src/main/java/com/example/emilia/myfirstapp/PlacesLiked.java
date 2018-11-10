package com.example.emilia.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

public class PlacesLiked extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_liked);
    }

    public void addListenerOnButton()
    {
        CheckBox checkManzi, checkTooker, checkBarret, checkJamba, checkPitch, checkBurgerK, checkHassa, checkAFS, checkDominos, checkPei, checkSubway, checkQdoba, checkBagels, checkChick, checkCrepe, checkGreens,checkEngrained;

        checkManzi = findViewById(R.id.checkManzi);
        checkTooker = findViewById(R.id.checkTooker);
        checkBarret = findViewById(R.id.checkBarret);
        checkJamba = findViewById(R.id.checkJamba);
        checkPitch = findViewById(R.id.checkPitch);
        checkBurgerK = findViewById(R.id.checkBurgerK);
        checkHassa = findViewById(R.id.checkHassa);
        checkAFS= findViewById(R.id.checkAFS);
        checkDominos = findViewById(R.id.checkDominos);
        checkPei = findViewById(R.id.checkPei);
        checkSubway = findViewById(R.id.checkSubway);
        checkQdoba = findViewById(R.id.checkQdoba);
        checkBagels = findViewById(R.id.checkBagels);
        checkChick = findViewById(R.id.checkChick);
        checkCrepe = findViewById(R.id.checkCrepe);
        checkGreens = findViewById(R.id.checkGreens);
        checkEngrained = findViewById(R.id.checkEngrained);

    }

}
