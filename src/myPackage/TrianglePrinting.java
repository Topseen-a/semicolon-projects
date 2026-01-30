package myPackage;

public class TrianglePrinting{
    public static void main(String[] args){

        for(int count = 1; count <= 10; count++){
            for(int index = 1; index <= count; index++){
            System.out.print("*");
            }
        System.out.println();
        }

        for(int count = 10; count >= 1; count--){
            for(int index = 1; index <= count; index++){
            System.out.print("*");
            }
        System.out.println();
        }       
    }
}
