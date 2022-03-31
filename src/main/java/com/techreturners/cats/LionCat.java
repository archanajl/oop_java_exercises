package com.techreturners.cats;

 class LionCat extends Cat{

    private boolean is_asleep = false;
    private final int height = 1100;
    private final String domestic_wild = "wild";


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

     public String eat(){
         return "Roar!!!!";
     }
}
