package myPackage;

import java.util.Random;
    public class Dice{
        public static void main(String[]args){
        
        Random random = new Random();
        
        int dieOne = random.nextInt(6) + 1;
        int dieTwo = random.nextInt(6) + 1;

        int total = dieOne + dieTwo;

        System.out.println("The first die: " +  dieOne);
        System.out.println("The second die: " +  dieTwo);
        System.out.println("Your total roll is " +  total); 
        }
    }
