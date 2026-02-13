package myPackage;

public class Hcf {

    public static void main(String[] args) {
        int[] array = {18,36,54};
//        int[] array = {5,7,9};
        System.out.println(getHcf(array));
    }

    public static int getHcf(int [] array) {

        int minimum = array[0];
        for (int count = 1; count < array.length; count++) {
            if (array[count] < minimum) {
                minimum = array[count];
            }
        }

        for (int count = minimum; count >= 1; count--) {

            int counter = 0;

            for (int index = 0; index < array.length; index++) {
                if (array[index] / count * count == array[index]) {
                    counter++;
                }
            }

            if (counter == array.length) {
                return count;
            }
        }
        return 1;
    }
}
