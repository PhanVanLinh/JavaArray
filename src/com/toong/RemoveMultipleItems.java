package com.toong;

import java.util.*;

public class RemoveMultipleItems {

    public static <E> boolean removeAll(List<E> list, Object o) {
        Iterator<E> it = list.iterator();
        if (o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                }
            }
        }
        return false;
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
            removeAll(result, deleteItem);
            return result.toArray(new String[0]);
        }
    }
}
