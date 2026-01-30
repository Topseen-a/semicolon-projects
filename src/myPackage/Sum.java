package myPackage;

public class Sum{
    public static void main(String[] args){

    System.out.println(isArmstrong(1234));

}

public static int isSumOfIntegers(int number){

    int total = 0;
    while (number != 0){
        total += (number % 10);
            number /= 10;
        }
        
    return total;
    }

public static int isReversedNumber(int number){

    int reversed = 0;
    int newNumber = 0;
    while (number != 0){
        newNumber = (number % 10);
            reversed = (reversed * 10) + newNumber;
            number /= 10;
        }
    return reversed;
    }

public static boolean isArmstrong(int number){

    int armstrong = 0;
    while (number != 0){
        int digit = (number % 10);
        armstrong += number * number * number; 
    }
    if (number == armstrong){
        return true;
    }
    else {
        return false;
    }

    }


}
