package com.techreturners.cats;

 class DomesticCat implements Cat{

     boolean is_asleep = false;
     int height = 23;
     String domestic_wild = "domestic";

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

     public int getHeight() {
         return height;
     }
 }
