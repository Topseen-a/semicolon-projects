package myPackage;

public class Divisible{
    public static void main(String[] args){

    System.out.println(isDivisible(10));
    }

    public static boolean isDivisible(int number){
        if (number % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
