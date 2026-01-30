package myPackage;

public class FireDrillSix{
    public static void main(String[] args){

    int[] array = {2,5,3,8,7};

    int largest = array[0];

    for (int count = 1; count < array.length; count++){
        if (array[count] > largest){
            largest = array[count];
            }    
    }
    System.out.println("The largest is " + largest);

    }

}
