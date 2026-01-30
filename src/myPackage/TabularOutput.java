package myPackage;

public class TabularOutput{
    public static void main(String[] args){

        System.out.println("N\t N2\t N3\t N4\t");

    for (int count = 1; count <= 5; count++){
        int countTwo = count * count;
        int countThree = count * count * count;
        int countFour = count * count * count * count;

        System.out.println(count + "\t" + countTwo + "\t" + countThree + "\t" + countFour);
            }   
    }

}
