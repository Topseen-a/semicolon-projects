package myPackage;

import java.util.Arrays;
public class PepperFunction{
    public static void main(String[] args){

    int[] array = {12,2,4,56,7};
    int number = 56;
    int result = isLargest(array);
    System.out.println("The largest is " + result);
    System.out.println(checkElement(array, number));
    int secondResult = getTotal(array);
    System.out.println("The result is " + secondResult);
    System.out.println(Arrays.toString(getReverse(array)));
    int[] secondArray = {3,21,78,45,53,34};
    int[] firstArray = {32,215,80,71,89,04,78,90,43,21,89};
    System.out.println(Arrays.toString(combineArray(firstArray, secondArray)));
    System.out.println(checkIndex(array, number));
    }

public static int isLargest(int[] array){
    int largest = array[0];

    for (int count = 1; count < array.length; count ++){
        if (array[count] > largest){
            largest = array[count];
            }        
        }
    return largest;
    }

public static int[] getReverse(int[] array){
    int[] newArray = new int[array.length];
    int counter = 0;
    for (int count = array.length -1; count >= 0; count--){
        newArray[counter] = array[count];
        counter++;
        }
    return newArray;
    }

public static boolean checkElement(int[] array, int number){
    for (int count = 0; count < array.length; count++){    
        if (number == array[count])
            return true;
        }
            return false; 
    }

public static int getTotal(int[] array){
    int sum = 0;

    for (int count = 0; count < array.length; count++){
        sum += array[count];   
        }
    return sum;
    }

public static int[] combineArray(int[] firstArray, int[] secondArray){
    int[] newArray = new int [firstArray.length + secondArray.length];

    int firstArrayCount = 0;
    int secondArrayCount = 0;

    for (int count = 0; count < newArray.length; count++){

    if(firstArrayCount < firstArray.length){
        newArray[count++] = firstArray[firstArrayCount];
        firstArrayCount++;
        }
    if (secondArrayCount < secondArray.length){
        newArray[count] = secondArray[secondArrayCount];
        secondArrayCount++;
        }
    }
    return newArray;
    }

public static int checkIndex(int[] array, int number){
    for (int count = 0; count < array.length; count++){    
        if (number == array[count])
            return count;
        }
            return -1; 
    }
}













