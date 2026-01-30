package myPackage;

import java.util.Arrays;
public class FireDrillNine{
    public static void main(String[] args){

    int[] array = {1,2,3,4,5};

    int[] newArray = new int[array.length];
    int counter = 0;

    for (int count = array.length - 1; count >= 0; count--){
        newArray[counter] = array[count];
        counter++;    
    }
    System.out.println("The reversed is " + Arrays.toString(newArray));
    }
}
