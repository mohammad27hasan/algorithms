/*
* Class: Sorting algorithm
* Data structure: Array
* Version: 0.0.3
* Author: Mohammad Hasan
*/
package algo.sort;

public final class Sequence {
    private static int i;
    private static int j;

    private Sequence() {}

    public static void insertionSort(byte[] array) {
        byte key = 0;
        for (j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(char[] array) {
        char key = '0';
        for (j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(double[] array) {
        double key = 0.0;
        for (j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(int[] array) {
        int key = 0;
        for (j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}