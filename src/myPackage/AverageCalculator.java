package myPackage;//Create a Scanner for user input

//Prompt user to "Enter the first score: "
//Read input on firstScore

//Prompt user to "Enter the second score: "
//Read input secondScore

//Prompt user to "Enter the third score: "
//Read input on thirdScore

//Calculate the averageScore = (firstScore + secondScore + thirdScore) / 3

//Display "Average score is: " + averageScore

//Declare grade as character

//if averageScore >= 90 THEN
    //grade = 'A'
//else if averageScore >= 80 THEN
    //grade = 'B'
//else if averageScore >= 70 THEN
    //grade = 'C'
//else if averageScore >= 60 THEN
    //grade = 'D'
//else
    //grade = 'F'

//Display "Grade is: " + grade

import java.util.Scanner;
    public class AverageCalculator{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double firstScore = input.nextDouble();

        System.out.print("Enter the second score: ");
        double secondScore = input.nextDouble();

        System.out.print("Enter the third score: ");
        double thirdScore = input.nextDouble();

        double averageScore = (firstScore + secondScore + thirdScore) / 3;
        System.out.println("Average score is: " + averageScore);
            
        char grade;

        if (averageScore >= 90){
            grade = 'A';
            }
        else if (averageScore >= 80){
            grade = 'B';   
            }
        else if (averageScore >= 70){
            grade = 'C';
            }
        else if (averageScore >= 60){
            grade = 'D';
            }
        else {
            grade = 'F';
            }

        System.out.println("Grade is: " + grade);
        }
    }
