package main.sourcecode.sort;

public class MyInsertionSort {

    public static void insertionSort(int[] a) {
        insertionSort(a, a.length);
    }

    public static void insertionSort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            int target = a[i];
            int j = i - 1;
            while (j >= 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = target;
        }
    }
}
