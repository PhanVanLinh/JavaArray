package com.toong;

import java.util.*;

public class RemoveMultipleItems {

    public static void main(String[] args) {
        String[] inputs = new String[]{"a", "b", "c", "d"};

        CopyToNewList copyToNewListTest = new CopyToNewList();
        copyToNewListTest.removeElements2(inputs, "a");
    }


    static class CopyToNewList {
        public static String[] removeElements(String[] input, String deleteItem) {
            List<String> results = new LinkedList<>();
            for (String item : input) {
                if (!item.equals(deleteItem)) {
                    results.add(item);
                }
            }
            return results.toArray(input);
        }

        static String[] removeElements2(String[] input, String deleteItem) {
            List<String> result = Arrays.asList(input);
            result.removeAll(Collections.singleton(deleteItem));
            return result.toArray(new String[0]);
        }
    }
}
