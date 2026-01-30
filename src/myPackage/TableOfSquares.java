package myPackage;

public class TableOfSquares{
    public static void main(String... args){

    System.out.println("number\t square\t cube");
        
    for (int count = 0; count <= 10; count++){

        int square = count * count;
        int cube = count * count * count;

        System.out.println(count + "\t" + square + "\t" + cube);
        }
    }
}
