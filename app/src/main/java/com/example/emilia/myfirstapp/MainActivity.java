package com.example.emilia.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox vegCBox, veganCBox, gfCBox;
    CheckBox japBtn, chinBtn, indBtn, medBtn, pizBtn, bgBtn, texmexBtn,
            chickBtn, burgBtn, cheapBtn, midBtn, expenBtn;
    Button nextBtn;
    TextView dietTView, favFoodTView, priceTView, wasPressed;
    RestPref rf = new RestPref();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vegCBox = (CheckBox) findViewById(R.id.vegCB);
        veganCBox = (CheckBox) findViewById(R.id.veganCB);
        gfCBox = (CheckBox) findViewById(R.id.gfCB);

        japBtn = (CheckBox) findViewById(R.id.japCB);
        chinBtn = (CheckBox) findViewById(R.id.chinCB);
        indBtn = (CheckBox) findViewById(R.id.indCB);
        medBtn = (CheckBox) findViewById(R.id.medCB);
        pizBtn = (CheckBox) findViewById(R.id.pizCB);
        bgBtn = (CheckBox) findViewById(R.id.bgCB);
        texmexBtn = (CheckBox) findViewById(R.id.tmCB);
        chickBtn = (CheckBox) findViewById(R.id.chickCB);
        burgBtn = (CheckBox) findViewById(R.id.burgCB);
        cheapBtn = (CheckBox) findViewById(R.id.cheapCB);
        midBtn = (CheckBox) findViewById(R.id.midCB);
        expenBtn = (CheckBox) findViewById(R.id.expenCB);
        nextBtn = (Button) findViewById(R.id.nextButton);

        dietTView = (TextView) findViewById(R.id.nextButton);
        favFoodTView = (TextView) findViewById(R.id.favFoodTV);
        priceTView = (TextView) findViewById(R.id.priceTV);
        wasPressed = (TextView) findViewById(R.id.btnPressTxt);

        vegCBox.setOnClickListener(this);
        veganCBox.setOnClickListener(this);
        gfCBox.setOnClickListener(this);

        japBtn.setOnClickListener(this);
        chinBtn.setOnClickListener(this);
        indBtn.setOnClickListener(this);
        medBtn.setOnClickListener(this);
        pizBtn.setOnClickListener(this);
        bgBtn.setOnClickListener(this);
        texmexBtn.setOnClickListener(this);
        chickBtn.setOnClickListener(this);
        burgBtn.setOnClickListener(this);
        cheapBtn.setOnClickListener(this);
        midBtn.setOnClickListener(this);
        expenBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.vegCB) {
            rf.setVeg(true);
            wasPressed.setText("Vegetarian Selected");
        }
        if (view.getId() == R.id.veganCB) {
            rf.setVegan(true);
            wasPressed.setText("Vegan Selected");
        }
        if (view.getId() == R.id.gfCB) {
            rf.setGF(true);
            wasPressed.setText("Gluten Free Selected");
        }

        if (view.getId() == R.id.japCB) {
            rf.setJap(true);
            wasPressed.setText("Japanese Selected");
        }
        if (view.getId() == R.id.chinCB) {

        }
        if (view.getId() == R.id.indCB) {

        }
        if (view.getId() == R.id.medCB) {

        }
        if (view.getId() == R.id.pizCB) {

        }
        if (view.getId() == R.id.bgCB) {

        }
        if (view.getId() == R.id.tmCB) {

        }
        if (view.getId() == R.id.chickCB) {

        }
        if (view.getId() == R.id.burgCB) {

        }
        if (view.getId() == R.id.cheapCB) {

        }
        if (view.getId() == R.id.midCB) {

        }
        if (view.getId() == R.id.expenCB) {

        }
        if (view.getId() == R.id.nextButton) {
            OpenPlacesLiked();
        }
    }

    public void OpenPlacesLiked() {
        Intent intent = new Intent(this, PlacesLiked.class);
        startActivity(intent);
    }

    public class RestPref {
        boolean isVeg, isVegan, isGF, likesJap, likesChin, likesInd, likesMed, likesPiz,
                likesBG, likesTexmex, likesChick, likesBurg, payCheap, payMid, payExpen;

        public RestPref() {
            isVeg = false;
            isVegan = false;
            isGF = false;
            likesJap = false;
            likesChin = false;
            likesInd = false;
            likesMed = false;
            likesPiz = false;
            likesBG = false;
            likesTexmex = false;
            likesChick = false;
            likesBurg = false;
            payCheap = false;
            payMid = false;
            payExpen = false;
        }

        public RestPref(boolean iVg, boolean iVgn, boolean iGF, boolean lJ, boolean lChn,
                        boolean lI, boolean lM, boolean lP, boolean lBG, boolean lTM,
                        boolean lChk, boolean lB, boolean pC, boolean pM, boolean pE) {
            isVeg = iVg;
            isVegan = iVgn;
            isGF = iGF;
            likesJap = lJ;
            likesChin = lChn;
            likesInd = lI;
            likesMed = lM;
            likesPiz = lP;
            likesBG = lBG;
            likesTexmex = lTM;
            likesChick = lChk;
            likesBurg = lB;
            payCheap = pC;
            payMid = pM;
            payExpen = pE;
        }

        public void setVeg(boolean b) {
            isVeg = b;
        }

        public boolean getVeg() {
            return isVeg;
        }

        public void setVegan(boolean b) {
            isVeg = b;
        }

        public boolean getVegan() {
            return isVegan;
        }

        public void setGF(boolean b) {
            isGF = b;
        }

        public boolean getGF() {
            return isGF;
        }

        public void setJap(boolean b) {
            likesJap = b;
        }

        public boolean getJap() {
            return likesJap;
        }



        public void setChin(boolean b)
        {
            likesChin = b;
        }
        public boolean getChin()
        {
            return likesChin;
        }

        public void setInd(boolean b)
        {
            likesJap = b;
        }
        public boolean getInd()
        {
            return likesInd;
        }

        public void setMed(boolean b)
        {
            likesMed = b;
        }
        public boolean getMed()
        {
            return likesMed;
        }

        public void setPiz(boolean b)
        {
            likesPiz = b;
        }
        public boolean getPiz()
        {
            return likesPiz;
        }

        public void setBG(boolean b)
        {
            likesBG = b;
        }
        public boolean getBG()
        {
            return likesBG;
        }

        public void setTexmex(boolean b)
        {
            likesTexmex = b;
        }
        public boolean getTexmex()
        {
            return likesTexmex;
        }

        public void setChick(boolean b)
        {
            likesChick = b;
        }
        public boolean getChick()
        {
            return likesChick;
        }

        public void setBurg(boolean b)
        {
            likesBurg = b;
        }
        public boolean getBurg()
        {
            return likesBurg;
        }

        public void setCheap(boolean b)
        {
            payCheap = b;
        }
        public boolean getCheap()
        {
            return payCheap;
        }

        public void setMid(boolean b)
        {
            payMid = b;
        }
        public boolean getMid()
        {
            return payMid;
        }

        public void setExpen(boolean b)
        {
            payExpen = b;
        }
        public boolean getExpen()
        {
            return payExpen;
        }
    }
}
