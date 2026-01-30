package myPackage;

public class Table{
    public static void main(String[] args){

    System.out.println("N\tN2\tN3\tN4");

    for (int count = 1; count <= 5; count++){
        int countTwo = count * count;
        int countThree = count * count * count;
        int countFour = count * count * count * count;
    System.out.println(count + "\t" + countTwo + "\t" + countThree + "\t" + countFour);
     }
    }
}
