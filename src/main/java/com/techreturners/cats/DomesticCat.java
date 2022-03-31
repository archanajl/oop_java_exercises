package com.techreturners.cats;
import java.util.Random;

 public class DomesticCat extends Cat{

     private boolean is_asleep = false;
     private final int height = 23;
     private final String domestic_wild = "domestic";
     private String[] arrStringMessage = {"Purrrrrrr", "It will do I suppose"};


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
         Random r=new Random();
         int randomNum=r.nextInt(arrStringMessage.length);
         return arrStringMessage[randomNum];
     }


 }
