package com.techreturners.cats;

public abstract class Animal implements Cat{

    private boolean is_asleep;
    private  int height;
    private  String domestic_wild;

    public Animal(String domestic_wild, int height) {
        this.is_asleep = false;
        this.height = height;
        this.domestic_wild = domestic_wild;
    }

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

    public abstract String eat();
}
