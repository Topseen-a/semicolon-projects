package myPackage;

public class BaseTen{
    public static void main(String[] args){

        System.out.println(convertToBaseTen(1010));
    }

    public static int convertToBaseTen(int number){

        String value = number + "";
        int baseTen = 0;

        if (number < 0){
            number *= -1;
        }

        for (int count = 0; count < value.length(); count++){

            int powerOfTwo = 1;
            for (int index = 0; index < count; index++){
                powerOfTwo *= 2;
            }

            baseTen += (number %  10) * powerOfTwo;
            number /= 10; 
        }
        return baseTen;
    }
}
