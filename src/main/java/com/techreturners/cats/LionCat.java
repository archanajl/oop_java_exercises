package com.techreturners.cats;

public class LionCat implements Cat{

    boolean is_asleep = false;
    int height = 1100;
    String domestic_wild = "wild";

    @Override
    public boolean isAsleep(){
        return is_asleep;
    }

    @Override
    public void goToSleep() {
        is_asleep = true;
    }

    @Override
    public void wakeUp() {
        is_asleep = false;
    }

    @Override
    public String getSetting() {
        return domestic_wild;
    }

    @Override
    public int getAverageHeight() {
        return height;
    }
}
