package myPackage;

public class FireDrillThirteen{
    public static void main(String[] args){

    int[] numbers = {2,4,1,7,3,8};
    
    int largest = numbers[0];
    int secondLargest = 0;

    for(int count = 0;  count < numbers.length; count++){
        if(numbers[count] > largest){
            largest = numbers[count];		
        } 
    }	
    for(int index = 0;  index < numbers.length; index++){
        if (numbers[index] > secondLargest && numbers[index] != largest){
            secondLargest = numbers[index];
        }
    }
    System.out.println("The second largest number is " + secondLargest);
    }
}
