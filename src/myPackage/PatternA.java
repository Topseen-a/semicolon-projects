package myPackage;

public class PatternA{
    public static void main(String[] args){

    for (int count = 1; count <= 6; count++){
        
        for (int index = 1; index <= 6 - count + 1; index++){
            System.out.print(index);
            }
    
        System.out.println();
        }
    }
}
