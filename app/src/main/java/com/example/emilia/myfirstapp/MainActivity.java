package com.example.emilia.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
CheckBox vegCBox,veganCBox,gfCBox;
Button japBtn, chinBtn, indBtn, medBtn, pizBtn, bgBtn, texmexBtn,
    chickBtn, burgBtn, cheapBtn, midBtn, expenBtn, nextBtn;
TextView dietTView, favFoodTView, priceTView;
RestPref rf = new RestPref();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vegCBox = (CheckBox) findViewById(R.id.vegCB);
        veganCBox = (CheckBox) findViewById(R.id.veganCB);
        gfCBox = (CheckBox) findViewById(R.id.gfCB);

        japBtn = (Button) findViewById(R.id.japButton);
        chinBtn = (Button) findViewById(R.id.chinButton);
        indBtn = (Button) findViewById(R.id.indButton);
        medBtn = (Button) findViewById(R.id.medButton);
        pizBtn = (Button) findViewById(R.id.pizButton);
        bgBtn = (Button) findViewById(R.id.bgButton);
        texmexBtn = (Button) findViewById(R.id.texmexButton);
        chickBtn = (Button) findViewById(R.id.chickButton);
        burgBtn = (Button) findViewById(R.id.burgButton);
        cheapBtn = (Button) findViewById(R.id.cheapButton);
        midBtn = (Button) findViewById(R.id.midButton);
        expenBtn = (Button) findViewById(R.id.expenButton);
        nextBtn = (Button) findViewById(R.id.nextButton);

        dietTView = (TextView) findViewById(R.id.nextButton);
        favFoodTView = (TextView) findViewById(R.id.favFoodTV);
        priceTView = (TextView) findViewById(R.id.priceTV);

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
    public void onClick(View view)
    {
        if(view.getId() == R.id.vegCB)
        {
            rf.setVeg(true);
            System.out.println(rf.getVeg());
        }
        if(view.getId() == R.id.veganCB)
        {
            rf.setVegan(true);
            System.out.println(rf.getVegan());
        }
        if(view.getId() == R.id.gfCB)
        {
            rf.setGF(true);
            System.out.println(rf.getGF());
        }

        if(view.getId() == R.id.japButton)
        {
            rf.setJap(true);
            System.out.println(rf.getJap());
        }
        if(view.getId() == R.id.chinButton)
        {

        }
        if(view.getId() == R.id.indButton)
        {

        }
        if(view.getId() == R.id.medButton)
        {

        }
        if(view.getId() == R.id.pizButton)
        {

        }
        if(view.getId() == R.id.bgButton)
        {

        }
        if(view.getId() == R.id.texmexButton)
        {

        }
        if(view.getId() == R.id.chickButton)
        {

        }
        if(view.getId() == R.id.burgButton)
        {

        }
        if(view.getId() == R.id.cheapButton)
        {

        }
        if(view.getId() == R.id.midButton)
        {

        }
        if(view.getId() == R.id.expenButton)
        {

        }
        if(view.getId() == R.id.nextButton)
        {

        }
    }

    public class RestPref
    {
        boolean isVeg, isVegan, isGF, likesJap, likesChin, likesInd, likesMed, likesPiz,
            likesBG, likesTexmex, likesChick, likesBurg, payCheap, payMid, payExpen;

        public RestPref()
        {
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
                        boolean lChk, boolean lB, boolean pC, boolean pM, boolean pE)
        {
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

        public void setVeg(boolean b)
        {
            isVeg = b;
        }
        public boolean getVeg()
        {
            return isVeg;
        }

        public void setVegan(boolean b)
        {
            isVeg = b;
        }
        public boolean getVegan()
        {
            return isVegan;
        }

        public void setGF(boolean b)
        {
            isGF = b;
        }
        public boolean getGF()
        {
            return isGF;
        }

        public void setJap(boolean b)
        {
            likesJap = b;
        }
        public boolean getJap()
        {
            return likesJap;
        }
    }
}
