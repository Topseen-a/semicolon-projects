package myPackage;

import java.util.Arrays;
public class SortArrays{
    public static void main(String[] args){

        int[] array = {10,5,5,7};
        System.out.println(Arrays.toString(squareOfArray(array)));
    }

    public static int[] sortedArray(int[] array){

        int swap = 0;

        for (int count = 0; count < array.length; count++){
            for (int index = 0; index < array.length; index++){
                if (array[count] < array[index]){
                    swap = array[index];
                    array[index] = array[count];
                    array[count] = swap;
                }
            }
        }
        return array;
    }

    public static int[] squareOfArray(int[] array){

        int[] newArray = new int[array.length];

        for (int count = 0; count < array.length; count++){
            newArray[count] = array[count] * array[count]; 
        }  
        return sortedArray(newArray);
    }
}
