package myPackage;

public class NestedForLoop{
    public static void main(String[] args){

    for (int count = 1; count <= 5; count ++){
        System.out.print(count);
        for (int index = count +1; index <= 5; index ++){

            System.out.print(index);
                    }      
            System.out.println();        
        }
    }
}
