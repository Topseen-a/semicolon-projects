package myPackage;

import java.util.Arrays;
public class NewSort{
    public static void main(String[] args){

        int[] array = {6,7,9,1};
        System.out.println(Arrays.toString(squareOfArray(array)));
    }

    public static int[] squareOfArray(int[] array){
//        int swap = 0;
        int[] newArray = new int[array.length];

        for (int count = 0; count < array.length; count++){
            for (int index = 0; index < array.length; index++){
                if (array[count] < array[index]){
                    newArray[count] = array[index];
                    array[index] = array[count];
                    array[count] = newArray[count];

                }
            }
        }

//        int[] newArray = new int[array.length];
//
//        for (int count = 0; count < array.length; count++){
//            newArray[count] = array[count] * array[count]; 
//        }
//        
        return array;
    }
}
