/*
* Algorithms: Insertion sort, Selection sort
* Abstract data type: Sequence
* Version: 0.3
* Author: Mohammad Hasan
*/
package algo;

public final class Sequence {

    private Sequence() {}

    public static void insertionSort(byte[] array, boolean isNonincreasingOrder) {
        byte key = 0;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(byte[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(char[] array, boolean isNonincreasingOrder) {
        char key = '0';
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
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
        insertionSort(array, false);
    }

    public static void insertionSort(double[] array, boolean isNonincreasingOrder) {
        double key = 0.0;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key; 
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
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
        insertionSort(array, false);
    }

    public static void insertionSort(float[] array, boolean isNonincreasingOrder) {
        float key = 0.0f;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(float[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(int[] array, boolean isNonincreasingOrder) {
        int key = 0;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
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
        insertionSort(array, false);
    }

    public static void insertionSort(long[] array, boolean isNonincreasingOrder) {
        long key = 0L;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(long[] array) {
        insertionSort(array, false);
    }

    public static void insertionSort(short[] array, boolean isNonincreasingOrder) {
        short key = 0;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i] < key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void insertionSort(short[] array) {
        insertionSort(array, false);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] array, boolean isNonincreasingOrder) {
        T key = null;
        int i = 0;

        if (isNonincreasingOrder) {
            for (int j = 1; j < array.length; j++) {
                key = array[j];
                i = j - 1;
                while ((i > -1) && (array[i].compareTo(key) < 0)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            return;
        }

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while ((i > -1) && (array[i].compareTo(key) > 0)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
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

    public static void selectionSort(byte[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
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

    public static void selectionSort(char[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(char[] array) {
        selectionSort(array, false);
    }

    private static void exchange(double[] array, int i, int j) {
        double temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(double[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(double[] array) {
        selectionSort(array, false);
    }

    private static void exchange(float[] array, int i, int j) {
        float temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(float[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(float[] array) {
        selectionSort(array, false);
    }

    private static void exchange(int[] array, int i, int j) {
        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(int[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(int[] array) {
        selectionSort(array, false);
    }

    private static void exchange(long[] array, int i, int j) {
        long temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(long[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(long[] array) {
        selectionSort(array, false);
    }

    private static void exchange(short[] array, int i, int j) {
        short temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static void selectionSort(short[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[largest]) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static void selectionSort(short[] array) {
        selectionSort(array, false);
    }

    private static <T> void exchange(T[] array, int i, int j) {
        T temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            int largest = 0;
            for (int i = 0; i < (array.length - 1); i++) {
                largest = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j].compareTo(array[largest]) > 0) {
                        largest = j;
                    }
                }
                exchange(array, i, largest);
            }
            return;
        }
        
        int smallest = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[smallest]) < 0) {
                    smallest = j;
                }
            }
            exchange(array, i, smallest);
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        selectionSort(array, false);
    }

    private static void merge(byte[] array, int p, int q, int r, boolean isNonincreasingOrder) {
        int n1 = q - p + 1;
        int n2 = r - q;

        byte[] left = new byte[n1 + 1];
        byte[] right = new byte[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = array[p + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = array[q + j + 1];
        }

        int i = 0;
        int j = 0;

        if (isNonincreasingOrder) {
            
            left[n1] = Byte.MIN_VALUE;
            right[n2] = Byte.MIN_VALUE;

            for (int k = p; k < (r + 1); k++) {
                if (left[i] >= right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
            }
            return;
        }
        
        // increasing order merge
        left[n1] = Byte.MAX_VALUE;
        right[n2] = Byte.MAX_VALUE;

        for (int k = p; k < (r + 1); k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }
    }

    private static void mergeSort(byte[] array, int p, int r, boolean isNonincreasingOrder) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q, isNonincreasingOrder);
            mergeSort(array, (q + 1), r, isNonincreasingOrder);
            merge(array, p, q, r, isNonincreasingOrder);
        }
    }

    public static void mergeSort(byte[] array, boolean isNonincreasingOrder) {
        if (isNonincreasingOrder) {
            mergeSort(array, 0, (array.length - 1), true);
        } else {
            mergeSort(array, 0, (array.length - 1), false);
        }
    }

    public static void mergeSort(byte[] array) {
        mergeSort(array, false);
    }
}