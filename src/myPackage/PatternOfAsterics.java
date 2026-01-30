package myPackage;

public class PatternOfAsterics{
    public static void main(String[] args){

    int rows = 8;
    int columns = 8;
    
    for(int index = 1; index <= rows; index++){
        for (int count = 1; count <= columns; count++){
            if ((index + count) % 2 == 0){
                System.out.print("* ");
                }
            else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }



    }





}
