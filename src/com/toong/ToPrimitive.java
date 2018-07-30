package com.toong;


import java.util.ArrayList;
import java.util.List;

public class ToPrimitive {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7};
        int[] ints = toPrimitive(integers);

        List<Integer> s = new ArrayList<>();
        s.remove(new Integer(1));
    }

    public static int[] toPrimitive(final Integer[] array) {
        if (array == null) {
            return null;
        }
        final int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
