package myPackage;

public class FireDrillSeven{
    public static void main(String[] args){

    int[] array = {9,5,3,8,7};

    int smallest = array[0];

    for (int count = 1; count < array.length; count++){
        if (array[count] < smallest){
            smallest = array[count];
            }    
    }
    System.out.println("The smallest is " + smallest);

    }

}
