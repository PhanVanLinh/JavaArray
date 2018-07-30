package com.toong;

public class FindIndexOf {

    public static final int INDEX_NOT_FOUND = -1;

    public static int indexOf(final Object[] array, final Object objectToFind) {
        if (array == null) {
            return INDEX_NOT_FOUND;
        }
        if (objectToFind == null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (objectToFind.equals(array[i])) {
                    return i;
                }
            }
        }
        return INDEX_NOT_FOUND;
    }
}
