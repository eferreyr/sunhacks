package com.example.emilia.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class PlacesLiked extends AppCompatActivity implements View.OnClickListener{
    CheckBox checkManzi, checkTooker, checkBarret, checkJamba, checkPitch, checkBurgerK, checkHassa, checkAFS, checkDominos, checkPei, checkSubway, checkQdoba, checkBagels, checkChick, checkCrepe, checkGreens,checkEngrained;
    Places places = new Places();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_liked);
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

        checkManzi.setOnClickListener(this);
        checkTooker.setOnClickListener(this);
        checkBarret.setOnClickListener(this);
        checkJamba.setOnClickListener(this);
        checkPitch.setOnClickListener(this);
        checkBurgerK.setOnClickListener(this);
        checkHassa.setOnClickListener(this);
        checkAFS.setOnClickListener(this);
        checkDominos.setOnClickListener(this);
        checkPei.setOnClickListener(this);
        checkSubway.setOnClickListener(this);
        checkQdoba.setOnClickListener(this);
        checkBagels.setOnClickListener(this);
        checkChick.setOnClickListener(this);
        checkCrepe.setOnClickListener(this);
        checkGreens.setOnClickListener(this);
        checkEngrained.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.checkManzi)
        {
            places.setBooleanManzi(true);
        }
        if (v.getId() == R.id.checkTooker)
        {
            places.setBooleanTooker(true);
        }
        if (v.getId() == R.id.checkBarret)
        {
            places.setBooleanBarret(true);
        }
        if (v.getId() == R.id.checkJamba)
        {
            places.setBooleanJamba(true);
        }
        if (v.getId() == R.id.checkPitch)
        {
            places.setBooleanPitch(true);
        }
        if (v.getId() == R.id.checkBurgerK)
        {
            places.setBooleanBurgerK(true);
        }
        if (v.getId() == R.id.checkHassa)
        {
            places.setBooleanHassa(true);
        }
        if (v.getId() == R.id.checkAFS)
        {
            places.setBooleanAFS(true);
        }
        if (v.getId() == R.id.checkDominos)
        {
            places.setBooleanDominos(true);
        }
        if (v.getId() == R.id.checkPei)
        {
            places.setBooleanPei(true);
        }
        if (v.getId() == R.id.checkSubway)
        {
            places.setBooleanSubway(true);
        }
        if (v.getId() == R.id.checkQdoba)
        {
            places.setBooleanQdoba(true);
        }
        if (v.getId() == R.id.checkBagels)
        {
            places.setBooleanBagels(true);
        }
        if (v.getId() == R.id.checkChick)
        {
            places.setBooleanChick(true);
        }
        if (v.getId() == R.id.checkCrepe)
        {
            places.setBooleanCrepe(true);
        }
        if (v.getId() == R.id.checkGreens)
        {
            places.setBooleanGreens(true);
        }
        if (v.getId() == R.id.checkEngrained)
        {
            places.setBooleanEngrained(true);
        }
    }

    public class Places
    {
        boolean booleanManzi, booleanTooker, booleanBarret, booleanJamba, booleanPitch, booleanBurgerK, booleanHassa, booleanAFS, booleanDominos, booleanPei, booleanSubway, booleanQdoba, booleanBagels, booleanChick, booleanCrepe, booleanGreens, booleanEngrained;

        public Places()
        {
            booleanManzi = false;
            booleanTooker = false;
            booleanBarret = false;
            booleanJamba = false;
            booleanPitch = false;
            booleanBurgerK = false;
            booleanHassa = false;
            booleanAFS= false;
            booleanDominos = false;
            booleanPei = false;
            booleanSubway = false;
            booleanQdoba = false;
            booleanBagels = false;
            booleanChick = false;
            booleanCrepe = false;
            booleanGreens = false;
            booleanEngrained = false;
        }

        public void setBooleanManzi(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanManzi()
        {
            return booleanManzi;
        }

        public void setBooleanTooker(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanTooker()
        {
            return booleanManzi;
        }

        public void setBooleanBarret(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanBarret()
        {
            return booleanManzi;
        }

        public void setBooleanJamba(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanJamba()
        {
            return booleanManzi;
        }

        public void setBooleanPitch(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanPitch()
        {
            return booleanManzi;
        }

        public void setBooleanBurgerK(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanBurgerK()
        {
            return booleanManzi;
        }

        public void setBooleanHassa(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanHassa()
        {
            return booleanManzi;
        }

        public void setBooleanAFS(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanAFS()
        {
            return booleanManzi;
        }

        public void setBooleanDominos(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanDominos()
        {
            return booleanManzi;
        }

        public void setBooleanPei(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanPei()
        {
            return booleanManzi;
        }

        public void setBooleanSubway(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanSubway()
        {
            return booleanManzi;
        }

        public void setBooleanQdoba(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanQdoba()
        {
            return booleanManzi;
        }

        public void setBooleanBagels(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanBagels()
        {
            return booleanManzi;
        }

        public void setBooleanChick(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanChick()
        {
            return booleanManzi;
        }

        public void setBooleanCrepe(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanCrepe()
        {
            return booleanManzi;
        }

        public void setBooleanGreens(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanGreens()
        {
            return booleanManzi;
        }

        public void setBooleanEngrained(boolean M)
        {
            booleanManzi = M;
        }
        public boolean getBooleanEngrained()
        {
            return booleanManzi;
        }
    }
}
