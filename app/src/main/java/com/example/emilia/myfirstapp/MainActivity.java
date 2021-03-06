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
    Restaurant r [] = new Restaurant[27];

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

        r[0] = new Restaurant("Barret", 1, 1, true,true,true,true,true,true,true,true,true,true,true,true);
        r[1] = new Restaurant("Hassayampa", 1,1,true, true,true,true,true,true,true,true,true,true,true,true);
        r[2] = new Restaurant("Manzanita",1,1, true,true,true,true,true,true,true,true,true,true,true,true);
        r[3] = new Restaurant("Tooker", 1,1,true,true,true,true,true,true,true,true,true,true,true,true);
        r[4] = new Restaurant("Pitchforks", 1,1,true,true,true,true,true,true,true,true,true,true,true,true);
        r[5] = new Restaurant("Chick Fil A", 2,1,false,false,true,false,false,false,false,false,false,false,true,false);
        r[6] = new Restaurant("AFC Sushi", 2,1,true,true,true,true,false,false,false,false,false,false,false,false);
        r[7] = new Restaurant("Burger King",2,1,true,false,false,false,false,false,false,false,false,false,true,true );
        r[8] = new Restaurant("Einstein Bagel Bros",2,1,true,true,false,false,false,false,false,false,true,false,false,false);
        r[9] = new Restaurant("Pei Wei",2,2, true,true,true,true,true,false,false,false,false,false,true,false);
        r[10] = new Restaurant("QDoba", 2,1,true, true,true,false,false,false,false,false,true,true,true,false);
        r[11] = new Restaurant("Crepe Club", 2,2,true,false,false,false,false,false,false,false,true,false,false,false);
        r[12] = new Restaurant("Devils Greens", 2,2,true,true,true,false,false,false,true,false,false,false,true,false);
        r[13] = new Restaurant("Subway", 2,1,true,true,false,false,false,false,false,false,true,false,true,false);
        r[14] = new Restaurant("Dominos", 2,1,true,false,true,false,false,false,false,true,true,false,true,false);
        r[15] = new Restaurant("Engrained", 1,3,true,true,true,false,false,false,false,false,true,false,true,false);
        r[16] = new Restaurant("Jamba Juice", 2,1,true,true,true,false,false,false,false,false,true,false,false,false);
        r[17] = new Restaurant("Chick-In", 2,1,true,false,true,false,false,false,true,false,false,false,true,false);
        r[18] = new Restaurant("Dog House",2,1,true,false,true,false,false,false,false,false,false,false,false,true);
        r[19] = new Restaurant("Starbucks", 3,2,true,true,true,false,false,false,false,false,true,false,false,false);
        r[20] = new Restaurant("Burning B Cafe",3,2,true,true,true,false,false,false,false,false,true,false,false,false);
        r[21] = new Restaurant("Charlie's Cafe",3,2, true,true,true,false,false,false,false,false,true,false,false,false);
        r[22] = new Restaurant("Freshii", 2,1,true,true,true,false,false,false,true,false,true,false,true,false);
        r[23] = new Restaurant("Pod Market", 4,2,true,true,true,true,false,false,true,true,true,true,true,true);
        r[24] = new Restaurant("Doner Dudes", 2,1,true,true,true,false,false,false,true,false,false,false,true,false);
        r[25] = new Restaurant("Rosie's Bakery", 2,2,true,false,false,false,false,false,false,false,true,false,false,false);
        r[26] = new Restaurant("Sonora Market", 4,1,true,true,true,true,false,false,true,true,true,true,true,true);

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
            rf.setChin(true);
            wasPressed.setText("Chinese Selected");
        }
        if (view.getId() == R.id.indCB) {
            rf.setInd(true);
            wasPressed.setText("Indian Selected");
        }
        if (view.getId() == R.id.medCB) {
            rf.setMed(true);
            wasPressed.setText("Mediterranean Selected");
        }
        if (view.getId() == R.id.pizCB) {
            rf.setPiz(true);
            wasPressed.setText("Pizza Selected");
        }
        if (view.getId() == R.id.bgCB) {
            rf.setBG(true);
            wasPressed.setText("Baked Goods Selected");
        }
        if (view.getId() == R.id.tmCB) {
            rf.setTexmex(true);
            wasPressed.setText("TexMex Selected");
        }
        if (view.getId() == R.id.chickCB) {
            rf.setChick(true);
            wasPressed.setText("Chicken Selected");
        }
        if (view.getId() == R.id.burgCB) {
            rf.setBurg(true);
            wasPressed.setText("Burger Selected");
        }
        if (view.getId() == R.id.cheapCB) {
            rf.setCheap(true);
            wasPressed.setText("Cheap Range Selected");
        }
        if (view.getId() == R.id.midCB) {
            rf.setMid(true);
            wasPressed.setText("Middle Range Selected");
        }
        if (view.getId() == R.id.expenCB) {
            rf.setExpen(true);
            wasPressed.setText("Expensive Range Selected");
        }
        if (view.getId() == R.id.nextButton) {
            OpenPlacesLiked();
        }
    }

    public void OpenPlacesLiked() {
        Intent intent = new Intent(this, PlacesLiked.class);
        startActivity(intent);
    }

    public class Restaurant
    {
        String name;
        int type,price;
        boolean vegOp, veganOp, gfOp, japOp, chinOp, indOp, medOp, pizOp, bgOp, tmOp,
            chickOp, burgOp, cheap, mid, expen;

        public Restaurant(String n, int t, int pr, boolean vg, boolean vgn, boolean gf, boolean j,
                          boolean chn, boolean i, boolean med, boolean p, boolean bg, boolean tm,
                          boolean chk, boolean bgr)
        {
            name = n;
            type = t;
            price = pr;
            vegOp = vg;
            veganOp = vgn;
            gfOp = gf;
            japOp = j;
            chinOp = chn;
            indOp = i;
            medOp = med;
            pizOp = p;
            bgOp = bg;
            tmOp = tm;
            chickOp = chk;
            burgOp = bgr;
            
        }
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
