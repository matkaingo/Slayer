package com.example.slayer;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;

public class Bird extends BaseObject{
    private ArrayList<Bitmap> arrBms = new ArrayList<>();
    public Bird(){

    }
    public void draw(Canvas canvas){

    }

    public ArrayList<Bitmap> getArrBms() {
        return arrBms;
    }

    public void setArrBms(ArrayList<Bitmap> arrBms) {
        this.arrBms = arrBms;
    }
}
