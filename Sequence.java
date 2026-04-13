/*
* Algorithms: Insertion sort, Selection sort
* Abstract data type: Sequence
* Version: 0.2
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

    private static void exchange(byte[] array, int i, int j) {
        byte temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(byte[] array, boolean nonincreasingOrder) {
        if (nonincreasingOrder) {
            int largest = -1;
            for (start = 0; start < (array.length - 1); start++) {
                largest = start;
                for (end = start + 1; end < array.length; end++) {
                    if (array[end] > array[largest]) {
                        largest = end;
                    }
                }
                exchange(array, start, largest);
            }
            return;
        }
        int smallest = -1;
        for (start = 0; start < (array.length - 1); start++) {
            smallest = start;
            for (end = start + 1; end < array.length; end++) {
                if (array[end] < array[smallest]) {
                    smallest = end;
                }
            }
            exchange(array, start, smallest);
        }
    }

    public static void selectionSort(byte[] array) {
        selectionSort(array, false);
    }

    private static void exchange(char[] array, int i, int j) {
        char temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(char[] array, boolean nonincreasingOrder) {
        if (nonincreasingOrder) {
            int largest = -1;
            for (start = 0; start < (array.length - 1); start++) {
                largest = start;
                for (end = start + 1; end < array.length; end++) {
                    if (array[end] > array[largest]) {
                        largest = end;
                    }
                }
                exchange(array, start, largest);
            }
            return;
        }
        int smallest = -1;
        for (start = 0; start < (array.length - 1); start++) {
            smallest = start;
            for (end = start + 1; end < array.length; end++) {
                if (array[end] < array[smallest]) {
                    smallest = end;
                }
            }
            exchange(array, start, smallest);
        }
    }

    public static void selectionSort(char[] array) {
        selectionSort(array, false);
    }
}