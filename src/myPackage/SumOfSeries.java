package myPackage;

public class SumOfSeries{
    public static void main(String[] args){
    
        long sum = 0;
        System.out.println("N\tSum");

        for (int count = 1; count <= 100; count++){
            sum += count;
            System.out.println(count + "\t" + sum);
        }     
    }
}
