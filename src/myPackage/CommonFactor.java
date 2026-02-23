package myPackage;

import java.util.Arrays;

public class CommonFactor {
    public static void main(String[] args) {
        int[] array = {4,6,8};
        System.out.println(Arrays.toString(commonFactor(array)));
    }

    public static int[] commonFactor(int[] array) {

        int minimum = array[0];

        for (int index = 1; index < array.length; index++) {
            if (array[index] < minimum) {
                minimum = array[index];
            }
        }

        int[] temp = new int[minimum];
        int counter = 0;

        int count = 0;
        for (int index = 2; index <= minimum; index++) {

            boolean isCommon = true;

            for (count = 0; count < array.length; count++) {
                if (array[count] % index != 0) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                temp[counter] = index;
                counter++;
            }
        }
        int[] result = new int[count];

        for (int index = 0; index < count; index++) {
            result[index] = temp[index];
        }
        return result;
    }
}
