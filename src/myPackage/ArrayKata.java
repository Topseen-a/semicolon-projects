package myPackage;

import java.util.Arrays;
public class ArrayKata{
    public static void main(String[] args){

    int[] array = {7,12,3,8,4};
    System.out.println(Arrays.toString(squareNumbersIn(array)));
    }

    public static int maximumIn(int[] array){
        int maximum = array[0];
        for (int count = 1; count < array.length; count++){
            if (array[count] > maximum){
            maximum = array[count];
            }
        }
        return maximum;
    }

    public static int minimumIn(int[] array){
        int minimum = array[0];
        for (int count = 1; count < array.length; count++){
            if (array[count] < minimum){
                minimum = array[count];        
            }
        }
        return minimum;
    }

    public static int sumOf(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            sum += array[count];
        }
        return sum;
    }

    public static int sumOfEvenNumbersIn(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 == 0){
                sum += array[count];
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersIn(int[] array){
        int sum = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 != 0){
                sum += array[count];
            }
        }
        return sum;
    }

    public static int[] maximumAndMinimumOf(int[] array){
        int[] newArray = new int[2];
        int maximum = array[0];
        int minimum = array[0];
        for (int count = 0; count < array.length; count++){
            if (array[count] > maximum){
                maximum = array[count];
            }
            if (array[count] < minimum){
                minimum = array[count];
            }
        }
        newArray[0] = maximum;
        newArray[1] = minimum;
        return newArray;
    }
    
    public static int noOfOddNumbersIn(int[] array){
        int counter = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 != 0){
                counter++;
            }
        }
        return counter;
    }

    public static int noOfEvenNumbersIn(int[] array){
        int counter = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int[] evenNumbersIn(int[] array){
        int evenCount = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 == 0){
                evenCount++;
            }
        }

        int[] newArray = new int[evenCount];

        int index = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 == 0){
                newArray[index] = array[count];
                index++;
            }
        }
        return newArray;
    }

    public static int[] oddNumbersIn(int[] array){
        int oddCount = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 != 0){
                oddCount++;
            }
        }
        
        int[] newArray = new int[oddCount];

        int index = 0;
        for (int count = 0; count < array.length; count++){
            if (array[count] % 2 != 0){
                newArray[index] = array[count];
                index++;
            }    
        }
        return newArray;
    }

    public static int[] squareNumbersIn(int[] array){
        int[] newArray = new int[array.length];
        for (int count = 0; count < array.length; count++){
            int square = array[count] * array[count];
            newArray[count] = square;
        }
        return newArray;
    }
}
