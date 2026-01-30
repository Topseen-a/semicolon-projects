package myPackage;

public class FireDrillTen{
    public static void main(String[] args){

    int[] array = {1,2,3,4,5};

    int maximum = array[0];
    int minimum = array[0];

    for (int count = 1; count < array.length; count++){
        if (array[count] > maximum){
            maximum = array[count];
        }
        if (array[count] < minimum){
            minimum = array[count];
        }
    }
    System.out.println("The maximum is " + maximum);
    System.out.println("The minimum is " + minimum);
    }
}
