package myPackage;

import java.util.Arrays;
public class Sort{
    public static void main(String[] args){

    int[] array = {4,6,2,7,1};

    int swap;
    for (int count = 0; count < array.length; count++){
        for (int index = 0; index < array.length; index++){
            if (array[count] > array[index]){
                swap = array[index];
                array[index] = array[count];
                array[count] = swap;
                }     
            }
        }
    System.out.println(Arrays.toString(array));

    for (int count = 0; count < array.length; count++){
        for (int index = 0; index < array.length; index++){
            if (array[index] > array[count]){
                swap = array[index];
                array[index] = array[count];
                array[count] = swap;
                }     
            }
        }
    System.out.println(Arrays.toString(array));

//    for (int count = 0; count < array.length; count++){
//        for (int index = 0; index < array.length; index++){
//            if (array[count] > array[index +1]){
//                swap = array[index];
//                array[index] = array[count];
//                array[count] = swap;
//                }     
//            }
//        }
//    System.out.println(Arrays.toString(array));

//    for (int count = 0; count < array.length; count++){
//        for (int index = 0; index < array.length; index++){
//            if (array[index +1] > array[count]){
//                swap = array[index];
//                array[index] = array[count];
//                array[count] = swap;
//                }     
//            }
//        }
//    System.out.println(Arrays.toString(array));

//    for (int count = 0; count < array.length; count++){
//        for (int index = 0; index < array.length; index++){
//            if (array[index] > array[index +1]){
//                swap = array[index];
//                array[index] = array[count];
//                array[count] = swap;
//                }     
//            }
//        }
//    System.out.println(Arrays.toString(array));

//    for (int count = 0; count < array.length; count++){
//        for (int index = 0; index < array.length; index++){
//            if (array[count] > array[count +1]){
//                swap = array[index];
//                array[index] = array[count];
//                array[count] = swap;
//                }     
//            }
//        }
//    System.out.println(Arrays.toString(array));

    }
}
