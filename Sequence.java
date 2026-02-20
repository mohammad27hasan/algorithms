/*
* Algorithms: Insertion sort
* Abstract data type: Sequence
* Version: 0.0.9
* Author: Mohammad Hasan
*/
package algo;

public final class Sequence {
    private static int start;
    private static int end;

    private Sequence() {}

    public static void insertionSort(byte[] array) {
        byte key = 0;
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
        char key = '0';
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
        double key = 0.0;
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
        float key = 0.0f;
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
        int key = 0;
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
        long key = 0L;
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
        short key = 0;
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

    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        T key = null;
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

    public static void reverse(byte[] array) {
        byte temp = 0;
        start = 0;
        end = array.length - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverse(char[] array) {
        char temp = '0';
        start = 0;
        end = array.length - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}