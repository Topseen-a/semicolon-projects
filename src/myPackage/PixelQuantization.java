package myPackage;

public class PixelQuantization{
    public static void main(String[] args){
        
        int[] array = {5,17,24,44,64,78,97,112,140,160,172,200};

        for (int count = 0; count < array.length; count++){
            array[count] = quantize(array[count]);
        }
        for (int number : array){
            System.out.println("Quatized numbers are: " + number);
        }
    }

    public static int quantize(int number){
        if (number >= 0 && number <= 20){
            return 10;
        }
        else if (number <= 40){
            return 30;
        }
        else if (number <= 60){
            return 50;
        }
        else if (number <= 80){
            return 70;
        }
        else if (number <= 100){
            return 90;
        }
        else if (number <= 120){
            return 110;
        }
        else if (number <= 140){
            return 130;
        }
        else if (number <= 160){
            return 150;
        }
        else if (number <= 180){
            return 170;
        }
        else {
            return 190;
        }
    }
}
