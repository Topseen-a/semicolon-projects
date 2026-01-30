package myPackage;

public class VariableLength{
    public static void main(String[] args){

    System.out.println("Average is " + average(10,20,30));
    }

    public static double average(int...numbers){
        int sum = 0;

        for (int count = 0; count < numbers.length; count++){
            sum += numbers[count];
        }
        double average = sum / numbers.length;
        return average;
    }
}
