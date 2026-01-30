package myPackage;

import java.util.Arrays;
public class ArrayMax{
    public static void main(String[] args){

    int[][] array = {{2,3,4},{5,6,5}};
    System.out.println(getOutput(array));
    }

    public static int getOutput(int[][] array){
    
        int[] sum = new int[array.length];

        for (int count = 0; count < array.length; count++){
            for (int index = 0; index < array[count].length; index++){
            sum[count] += array[count][index];
            }
        }
    
        int maximum = 0;

        for (int count = 0; count < sum.length; count++){
            if (sum[count] > maximum){
                maximum = sum[count];
            }
        }

        return maximum;

    }

}
