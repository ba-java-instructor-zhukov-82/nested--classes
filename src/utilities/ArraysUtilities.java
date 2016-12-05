package utilities;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ArraysUtilities {

    public static void main(String[] args) {
        Object[] array = { "A", "B", "C", "D", "E" };
        System.out.println(Arrays.toString(array));
        shift(array);
        System.out.println(Arrays.toString(array));
    }

    /* shift array elements */
    public static void shift(Object[] array) {
        for(int i = 0; i < array.length; ++i) {
            int min = i, max = array.length - 1;
            int r = (int)(min + (Math.random() * (max - min)));
            swap(array, i, r);
        }
    }

    public static void swap(Object[] array, int i, int r) {
        Object aCopy = array[i];
        array[i] = array[r];
        array[r] = aCopy;
    }
}
