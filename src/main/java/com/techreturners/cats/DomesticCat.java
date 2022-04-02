package com.techreturners.cats;
import java.util.Random;

 public class DomesticCat extends Animal {

     private String[] arrStringMessage = {"Purrrrrrr", "It will do I suppose"};

     public DomesticCat() {
         super("domestic",23);
     }

     public int randomGenerator(){
         Random r=new Random();
         return r.nextInt(arrStringMessage.length);
     }

     public String eat(){
         return arrStringMessage[randomGenerator()];
     }


 }
