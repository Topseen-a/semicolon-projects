package myPackage;

import java.util.Random;
public class DiceRolling{
    public static void main(String[] args){

        Random random = new Random();

        int[] total = new int[13];

        for (int count = 0; count < 36000; count++){
            int dieOne = random.nextInt(1,7);
            int dieTwo = random.nextInt(1,7);
            int sum = dieOne + dieTwo;

            total[sum]++;
        }
        System.out.println("Sum\tFrequency");
        for (int index = 2; index <= 12; index++){
            System.out.println(index + "\t" + total[index]);
        }
    }
}
