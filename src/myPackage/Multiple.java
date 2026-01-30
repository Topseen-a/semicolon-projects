package myPackage;

public class Multiple{
    public static void main(String[] args){

    System.out.println(isMultiple(4,12));
}

    public static boolean isMultiple(int numberOne, int numberTwo){
        if (numberTwo % numberOne == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
