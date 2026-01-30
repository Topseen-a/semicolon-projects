package myPackage;

public class Statement{
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before: x = " + x);

        x += x++ - 5;

        System.out.println("After: x = " + x);
    }
}
