package myPackage;

import java.util.Scanner;
public class SportsRecommender{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
    
        System.out.println(sportsRecommender(celsius));
    }

    public static String sportsRecommender(double celsius){
        if (celsius >= 20 && celsius <= 30){
            return "It's a lovely weather for Sports today!";
        }
        else if (celsius >= 10 && celsius <= 40){
            return "It's a reasonable weather for Sports today!";
        }
        else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }
}
