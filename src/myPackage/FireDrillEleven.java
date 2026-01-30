package myPackage;

import java.util.Arrays;
public class FireDrillEleven{
    public static void main(String[] args){

    int[] array = {2,4,1,7,3,8};

    int[] newArray = new int[array.length];
    int counter = 0;

    for (int count = 1; count < array.length; count++){
        newArray[counter] = array[count];
        counter++;    
    }
    System.out.println(Arrays.toString(newArray));



    }







}
