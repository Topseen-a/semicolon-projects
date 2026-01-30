package myPackage;

import java.util.Arrays;
public class Array{
    public static void main(String[] args){

    int[] array = {2,5,3,8,7,-3};
    System.out.println(Arrays.toString(getOutput(array)));
//    int[] array = {48,36,10,19,12,17};
    System.out.println(Arrays.toString(getLargestLowest(array)));

}

public static int[] getOutput(int[] array){
    int[] newArray = new int[array.length];
    
    for (int count = 0; count < array.length; count++){
        if (array[count] % 2 == 0){
            newArray[count] = array[count] * array[count];
            }
        else{
            newArray[count] = array[count] + 1;
            }
        }  
     return newArray;
    }

public static int[] getLargestLowest(int[] array){
    
    int[] newArray =  new int[2];
   
    int largest = array[0];
    int smallest = array[0];
    int largestIndex = 0;
    int smallestIndex = 0;

    for (int count = 0; count < array.length; count++){
        if (array[count] > largest){
            largest = array[count];
            largestIndex = count;
            }
        if (array[count] < smallest){
            smallest = array[count];
            smallestIndex = count;
            }        
        }
    newArray[0] = largestIndex;
    newArray[1] = smallestIndex;

    int difference = largest - smallest;
    System.out.println("The difference is " + difference);
    return newArray;
    }








}
