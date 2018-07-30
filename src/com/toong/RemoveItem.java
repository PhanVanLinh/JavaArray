package com.toong;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveItem {

    public static void main(String[] args) {

    }

    static class RemoveUseCopy {

        public static Integer[] removeElement(final Integer[] array, final short element) {
            return (Integer[]) remove(array, 0);
        }

        public static Object[] remove(Object[] array, int index) {
            final int length = array.length;
            if (index < 0 || index >= length) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
            }
            final Object[] result = new Object[length - 1];
            System.arraycopy(array, 0, result, 0, index);
            if (index < length - 1) {
                System.arraycopy(array, index + 1, result, index, length - index - 1);
            }
            return result;
        }

        public static String[] removeElements(String[] input, String deleteMe) {
            List<String> results = new LinkedList<>();
            for (String item : input) {
                if (!deleteMe.equals(item)) {
                    results.add(item);
                }
            }
            return results.toArray(input);
        }
    }

    static class RemoveUseList {

        public static String[] removeElements(String[] input, String removeItem) {
            List<String> results = Arrays.asList(input);
            results.remove(removeItem);
            return results.toArray(input);
        }
    }
}
