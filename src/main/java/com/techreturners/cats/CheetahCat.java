package com.techreturners.cats;

public class CheetahCat extends Cat{
    boolean is_asleep = false;
    int height = 1100;
    String domestic_wild = "wild";


    public boolean isAsleep(){
        return is_asleep;
    }


    public void goToSleep() {
        is_asleep = true;
    }

    public void wakeUp() {
        is_asleep = false;
    }

    public String getSetting() {
        return domestic_wild;
    }

    public int getAverageHeight() {
        return height;
    }

    public String eat() {
        return "Zzzzzzz";
    }
}
