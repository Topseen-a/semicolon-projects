package myPackage;

public class LogisticsDelivery{
    public static void main(String[] args){

    System.out.println(getCollectionRate(80));            
    }

public static int getCollectionRate(int number){
    int riderWage;

    if (number < 50){
        riderWage = (number * 160) + 5000;
        }
    else if (number >= 50 && number <= 59){
        riderWage = (number * 200) + 5000;
        }
    else if (number >= 60 && number <= 69){
        riderWage = (number * 250) + 5000;
        }
    else {
        riderWage = (number * 500) + 5000;    
        }
    return riderWage;
}
}
