package com.techreturners.cats;
import java.util.Random;

 public class DomesticCat extends Animal {

     private String[] arrStringMessage = {"Purrrrrrr", "It will do I suppose"};

     public DomesticCat() {
         super("domestic",23);
     }

     public String eat(){
         Random r=new Random();
         int randomNum=r.nextInt(arrStringMessage.length);
         return arrStringMessage[randomNum];
     }


 }
