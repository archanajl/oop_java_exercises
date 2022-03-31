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

 }
