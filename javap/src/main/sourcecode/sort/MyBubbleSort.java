package main.sourcecode.sort;

public class MyBubbleSort {

    public static void bubbleSort(int[] a) {
        bubbleSort(a, a.length);
    }

    public static void bubbleSort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
