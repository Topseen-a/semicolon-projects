package myPackage;

import java.util.Arrays;
public class NewArray{
    public static void main(String[] args){

        int[][] array = {{5,6},{7,1},{3,2}};
        System.out.println(Arrays.toString(calculateSum(array)));
    
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

    public static int[] calculateSum(int[][] array){

        int[] sum = new int[array.length];

        for (int count = 0; count < array.length; count++){
            for (int index = 0; index < array[count].length; index++){
            sum[count] += array[count][index];
            }
        }
        return sortedArray(sum);
    }
}
