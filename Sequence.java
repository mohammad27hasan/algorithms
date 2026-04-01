/*
* Algorithm: Insertion sort
* Abstract data type: Sequence
* Version: 0.1.7
* Author: Mohammad Hasan
*/
package algo;

public final class Sequence {
    private static int start;
    private static int end;

    private Sequence() {}

    public static void insertionSort(byte[] array, boolean nonincreasingOrder) {
        byte key = 0;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(byte[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(char[] array, boolean nonincreasingOrder) {
        char key = '0';
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(char[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(double[] array, boolean nonincreasingOrder) {
        double key = 0.0;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key; 
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(double[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(float[] array, boolean nonincreasingOrder) {
        float key = 0.0f;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(float[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(int[] array, boolean nonincreasingOrder) {
        int key = 0;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(int[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(long[] array, boolean nonincreasingOrder) {
        long key = 0L;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(long[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(short[] array, boolean nonincreasingOrder) {
        short key = 0;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start] < key)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start] > key)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static void insertionSort(short[] array) {
        insertionSort(array, false);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array, boolean nonincreasingOrder) {
        T key = null;
        if (nonincreasingOrder) {
            for (end = 1; end < array.length; end++) {
                key = array[end];
                start = end - 1;
                while ((start > -1) && (array[start].compareTo(key) < 0)) {
                    array[start + 1] = array[start];
                    start--;
                }
                array[start + 1] = key;
            }
            return;
        }
        for (end = 1; end < array.length; end++) {
            key = array[end];
            start = end - 1;
            while ((start > -1) && (array[start].compareTo(key) > 0)) {
                array[start + 1] = array[start];
                start--;
            }
            array[start + 1] = key;
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        insertionSort(array, false);
    }
}