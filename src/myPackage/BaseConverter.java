package myPackage;

public class BaseConverter{
    public static void main(String[] args){

//        System.out.println(toBaseTwo(20));
        System.out.println(convertBase(10100,2,5));
    }

    public static String toBaseTwo(int number){

        if (number < 0){
            number *= -1;
        }
        if (number == 0){
            return "0";
        }
        else {
            String store = "";

            while (number > 0){
                int remainder = number % 2;
                store += remainder;
                number /= 2;

            }

            String reverse = "";
            for (int index = store.length() - 1; index >= 0; index--){
                reverse += store.charAt(index);
            }
            return reverse;
        }
    }

    public static String toBaseFive(int number){
    
        if (number < 0){
            number *= -1;
        }
        if (number == 0){
            return "0";
        }
        else {
            String store = "";
    
            while (number > 0){
                int remainder = number % 5;
                store += remainder;
                number /= 5;
            }

            String reverse = "";
            for (int index = store.length() -1; index>= 0; index--){
                reverse += store.charAt(index);
            }
            return reverse;
        }
    }

    public static int toBaseTen(int number, int fromBase){
        if (number < 0){
            number *= -1;
        }

        int baseTen = 0;
        int power = 0;

        while (number > 0){
            int remainder = number % 10;
            baseTen += remainder * Math.pow(fromBase,power);
            number /= 10;
            power++;
        }
        return baseTen;

    }

    public static String convertBase(int number, int fromBase, int toBase){

        int convertToBase = toBaseTen(number,fromBase);

        if (toBase == 2){
            return toBaseTwo(convertToBase);
        }
        else if (toBase == 5){
            return toBaseFive(convertToBase);
        }
        else {
            return "Invalid conversion";
        }
    }
}
