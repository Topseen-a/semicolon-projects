package myPackage;

import java.util.Arrays;
import java.util.Scanner;
public class FireDrill{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){


//        int[] numbers = new int[10];
        int[] numbers = {10,25,43,54,25,46,27,18,49,6};
//        System.out.println(Arrays.toString(taskOne(numbers)));
//        FireDrill.taskTwo(numbers);
//        FireDrill.taskThree(numbers);
//        System.out.println(Arrays.toString(taskFour(numbers)));
//        System.out.println(Arrays.toString(taskFive(numbers)));
//        System.out.println(taskSix(numbers));
//        System.out.println(taskSeven(numbers));
//        System.out.println(taskEight(numbers));
//        System.out.println(taskNine(numbers));
//        System.out.println(taskTen(numbers));
//        System.out.println(taskEleven(numbers));
        System.out.println(Arrays.toString(taskTwelve(numbers)));
    }

    public static int[] taskOne(int[] numbers){
        for (int count = 0; count < numbers.length; count++){
            System.out.println("Enter your score " + (count +1));
            numbers[count] = input.nextInt();
        }
        return numbers;
    }
    
    public static void taskTwo(int[] numbers){
        for (int count = 0; count < numbers.length; count++){

            System.out.println("Enter your score " + (count +1));
            numbers[count] = input.nextInt();
        }
        for (int index = 0; index < numbers.length; index++){
            System.out.println(numbers[index]);
        }
    }
        
    public static void taskThree(int[] numbers){
        for (int count = 0; count < numbers.length; count++){

            System.out.println("Enter your score " + (count +1));
            numbers[count] = input.nextInt();
        }
        for (int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index]);
        }
    }

    public static int[] taskFour(int[] numbers){

        int arrayLength = 0;
        
        if (numbers.length % 2 == 0){
            arrayLength = numbers.length / 2;
        }
        else {
            arrayLength = (numbers.length / 2) + 1;
        }

        int[] evenElement = new int[arrayLength];
        int counter = 0;

        for (int count = 0; count < numbers.length; count +=2){
            evenElement[counter] = numbers[count];
            counter++;
        }
        return evenElement;
    }

    public static int[] taskFive(int[] numbers){

        int[] oddElement = new int[numbers.length / 2];
        int counter = 0;

        for (int count = 0; count < numbers.length; count ++){
            if (count % 2 != 0){
                oddElement[counter] = numbers[count];
                counter++;
            }
        }
        return oddElement;
    }

    public static int taskSix(int[] numbers){
        
        int arrayLength = 0;
        if (numbers.length % 2 == 0){
            arrayLength = numbers.length / 2;
        }
        else {
            arrayLength = (numbers.length / 2) + 1;
        }

        int[] evenElement = new int[arrayLength];
        int counter = 0;

        for (int count = 0; count < numbers.length; count +=2){
            evenElement[counter] = numbers[count];
            counter++;
        }

        int sum = 0;
        for (int count = 0; count < evenElement.length;count++){
            sum += evenElement[count];
        }
        return sum;
    }

    public static int taskSeven(int[] numbers){

        int[] oddElement = new int[numbers.length / 2];
        int counter = 0;

        for (int count = 0; count < numbers.length; count++){
            if (count % 2 != 0){
                oddElement[counter] = numbers[count];
                counter++;
            }
        }
        
        int sum = 0;
        for (int count = 0; count < oddElement.length; count++){
            sum += oddElement[count];
        }
        return sum;
    }

    public static int taskEight(int[] numbers){

        int arrayLength = 0;
        
        if (numbers.length % 2 == 0){
            arrayLength = numbers.length / 2;
        }
        else {
            arrayLength = (numbers.length / 2) + 1;
        }

        int[] evenElement = new int[arrayLength];
        int counter = 0;

        for (int count = 0; count < numbers.length; count +=2){
            evenElement[counter] = numbers[count];
            counter++;
        }

        int[] newArray =  new int[evenElement.length];
        int minimum = evenElement[0];

        for (int count = 0; count < evenElement.length; count++){
            if (evenElement[count] < minimum){
                minimum = evenElement[count];
            }        
        }
    return minimum;
    }

    public static int taskNine(int[] numbers){
        
        int[] oddElement = new int[numbers.length / 2];
        int counter = 0;

        for (int count = 0; count < numbers.length; count ++){
            if (count % 2 != 0){
                oddElement[counter] = numbers[count];
                counter++;
            }
        }
    
        int[] newArray = new int[oddElement.length];
        int minimum = oddElement[0];

        for (int count = 0; count < oddElement.length; count++){
            if (oddElement[count] < minimum){
                minimum = oddElement[count];
            }
        }
        return minimum;
    }

    public static int taskTen(int[] numbers){
        
        int arrayLength = 0;
        
        if (numbers.length % 2 == 0){
            arrayLength = numbers.length / 2;
        }
        else {
            arrayLength = (numbers.length / 2) + 1;
        }

        int[] evenElement = new int[arrayLength];
        int counter = 0;

        for (int count = 0; count < numbers.length; count +=2){
            evenElement[counter] = numbers[count];
            counter++;
        }
        
        int[] newArray = new int[evenElement.length];
        int maximum = evenElement[0];

        for (int count = 0; count < evenElement.length; count++){
            if (evenElement[count] > maximum){
                maximum = evenElement[count];
            }
        }
        return maximum;
    }

    public static int taskEleven(int[] numbers){
        
        int[] oddElement = new int[numbers.length / 2];
        int counter = 0;

        for (int count = 0; count < numbers.length; count ++){
            if (count % 2 != 0){
                oddElement[counter] = numbers[count];
                counter++;
            }
        }
        
        int[] newArray = new int[oddElement.length];
        int maximum = oddElement[0];

        for (int count = 0; count < oddElement.length; count++){
            if (oddElement[count] > maximum){
                maximum = oddElement[count];
            }
        }
        return maximum;
    }

    public static int[] taskTwelve(int[] numbers){
        
        int swap;
        for (int count = 0; count < numbers.length; count++){
            if (count % 2 != 0){
                swap = numbers[count];
                numbers[count] = count - 1;
                numbers[count] = swap;
            }     
            
        }
        return numbers;
    }


}
