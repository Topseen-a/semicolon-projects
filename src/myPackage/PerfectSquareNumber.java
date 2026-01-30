package myPackage;

public class PerfectSquareNumber{
    public static void main(String[] args){

    System.out.println(isPerfectNumber(8128));
    }


public static boolean isPerfectNumber(int number){

    int sumOfNumber = 0;
    
    for (int count = 1; count < number; count++){
        if (number % count == 0){
            sumOfNumber += count;
        }
    }
        if (number == sumOfNumber){
            return true;
        }
        else {
            return false;    
        }
    }
}
