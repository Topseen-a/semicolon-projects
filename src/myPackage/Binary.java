package myPackage;

public class Binary{
    public static void main(String[] args){

        System.out.println(getBinary(20));
    }

    public static String getBinary(int number){

        if (number < 0){
            number *= -1;
        }

        if (number == 0){
            return "0";
        }

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        String store = "";
        int originalNumber = number;  

        for (int count = 0; count < number; count++){

            numberOne = originalNumber / 2;
            numberTwo = numberOne * 2;
            numberThree = originalNumber - numberTwo;

            store += numberThree + "";

            if (numberOne == 0){
                break;   
            }  
            originalNumber = numberOne;
        }

        String reverse = "";
        for (int index = store.length() - 1; index >= 0; index--){
            reverse += store.charAt(index);
        }
    
        return reverse;
        }
    
}
