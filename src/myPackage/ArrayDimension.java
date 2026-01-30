package myPackage;

import java.util.Arrays;
public class ArrayDimension{
    public static void main(String[] args){

    int[][] array = {{5,6},{7,1},{3,2}};
    System.out.println(Arrays.deepToString(getMaximumAndMinimum(array)));
    }

    public static int[][] getMaximumAndMinimum(int[][] array){
        int maximum = array[0][0];
        int minimum = array[0][0];

        int minimumCount = 0;
        int minimumIndex = 0;
        int maximumCount = 0;
        int maximumIndex = 0;

        for (int count = 0; count < array.length; count++){
            for(int index = 0; index < array[count].length; index++){
                if (array[count][index] < minimum){
                    minimum = array[count][index];
                    minimumCount = count;
                    minimumIndex = index;
                }
                if (array[count][index] > maximum){
                    maximum = array[count][index];
                    maximumCount = count;
                    maximumIndex = index;
                }
            }
        }
        int[][] result = {{maximumCount, maximumIndex},{minimumCount, minimumIndex}};
        return result;
    }
}
