package myPackage;

public class FireDrillEight{
    public static void main(String[] args){

    int[] array = {1,2,3,4,5};

    int sum = 0;

    for (int count = 0; count < array.length; count++){
            sum += array[count];
    }
    System.out.println("The sum is " + sum);

    }
}
