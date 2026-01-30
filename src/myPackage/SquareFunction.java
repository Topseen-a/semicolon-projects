package myPackage;

public class SquareFunction{
    public static void main(String[] args){

        System.out.println(calculateSquare(4,3));
    }

    public static int calculateSquare(int firstNumber, int secondNumber){
        int save = 0;
        for (int count = 1; count <= firstNumber; count++){
            save += secondNumber;
        }
        return save;     
    }
}
