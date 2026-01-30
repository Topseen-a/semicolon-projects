package myPackage;

import java.util.Scanner;
public class MenstrualApp{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int currentDay = 0;
        int cycleLength = 0;
        int periodDuration = 0;

        while(true){
            System.out.print("Enter current day of your cycle: ");
            currentDay = input.nextInt();

            System.out.print("How many days is your full cycle? ");
            cycleLength = input.nextInt();
            
            System.out.print("How many days does bleeding last? ");
            periodDuration = input.nextInt();

            if (currentDay < 1 || currentDay > cycleLength){
                System.out.println("Invalid day entered, try again");
                continue;
            }
            if (cycleLength < 21){
                System.out.println("Cycle length is too short, try again");
                continue;
            }
            if (periodDuration < 1 || periodDuration > cycleLength){
                System.out.println("Invalid bleeding duration, try again");
                continue;
            }
            break;
        }

        int nextCycle = cycleLength - currentDay;
        
        int ovulationDay = cycleLength - 14;
    
        int daysToOvulation = ovulationDay - currentDay;

        int fertileStart = ovulationDay - 4;
        int fertileStop = ovulationDay + 1;

        int safePeriodOneStart = periodDuration + 1;
        int safePeriodOneStop = fertileStart - 1;

        int safePeriodTwoStart = fertileStop + 1;
        int safePeriodTwoStop = cycleLength;

        if (currentDay >= 1 && currentDay <= periodDuration){
            System.out.println("You are currently in your menstrual flow phase");
        }
        else if (currentDay == ovulationDay){
            System.out.println("Today is your ovulation day");
        }
        else if (currentDay >= fertileStart && currentDay <= fertileStop){
            System.out.println("You are in your fertile window (high risk of pregnancy)");
        }
        else if ((currentDay >= safePeriodOneStart && currentDay <= safePeriodOneStop) || (currentDay >= safePeriodTwoStart && currentDay <= safePeriodTwoStop)){
            System.out.println("You are in your fertile window (low risk of pregnancy)");
        }
        else {
            System.out.println("Unable to determine your current phase");
        }

        System.out.println("Your next menstrual cycle starts in " + nextCycle + " days");
        System.out.println("Your next ovulation day is in " + daysToOvulation + " days");
    }
}
