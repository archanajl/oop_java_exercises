package com.techreturners.cats;

 public class DomesticCat extends Cat{

     boolean is_asleep = false;
     int height = 23;
     String domestic_wild = "domestic";


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
