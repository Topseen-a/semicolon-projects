package myPackage;

public class FireDrillEighteen{
    public static void main(String[] args){

    for (int count = 1; count <= 100; count++){
        if (count % 3 == 0 && count % 5 != 0){
            System.out.println("Fizz");
        }
        else if (count % 5 == 0 && count % 3 != 0){
            System.out.println("Buzz");
        }
        else if (count % 3 == 0 && count % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(count);
        }
    }
    }
}
