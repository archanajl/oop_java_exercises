package com.techreturners.cats;

 public class DomesticCat extends Cat{

     private boolean is_asleep = false;
     private final int height = 23;
     private final String domestic_wild = "domestic";


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
         return "Purrrrrrr";
     }


 }
