package com.example.emilia.myfirstapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent in = getIntent();
        //getting which index to display
        int index = in.getIntExtra("com.example.emilia.myfirstapp,ITEM_INDEX", -1);

        int pic = getImg(index);
        ImageView img = (ImageView) findViewById(R.id.imageView);
//        if(index > -1){
//            int pic = getImg(index);
//            ImageView img = (ImageView) findViewById(R.id.imageView);
////            scaleImg(img, pic);
//        }
    }

    //methods to shrink down the images

    //int to represent the index of the resource image
    private int getImg(int index){ //this method identifies which picture to show depending on which item was clicked
        switch (index){
            case 0:
                return R.drawable.peach;
            case 1:
                return R.drawable.tomato;
            case 2:
                return R.drawable.squash;
            default:
                return -1;
        }
    }

    private void scaleImg (ImageView img, int pic){ //method to scale an image that it takes in
        Display screen = getWindowManager().getDefaultDisplay(); //identifies the size of the screen
        BitmapFactory.Options options = new BitmapFactory.Options(); //accesses java library that knows how to scale images

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        //getting the width and height of image
        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();
        if(imgWidth > screenWidth){
            int ratio = Math.round((float) imgWidth / (float) screenWidth);
            options.inSampleSize = ratio;
        }
        options.inJustDecodeBounds = false;

        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);
    }
}
