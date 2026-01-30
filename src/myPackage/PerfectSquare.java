package myPackage;

public class PerfectSquare{
    public static void main(String[] args){

    int[] array = {36,4,9,25};
    System.out.println(isPerfectSquare(array));
    }

    public static boolean isPerfectSquare(int[] array){
        for (int count = 0; count < array.length; count++){
            int number = array[count];
            for (int index = 1; index <= number; index++){
                if (index * index == number){
                    return true;
                }
            }
        }
        return false;
    }
}
