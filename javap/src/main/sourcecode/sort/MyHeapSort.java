package main.sourcecode.sort;

public class MyHeapSort {

    private static int getParent(int child) {
        return (child - 1) / 2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void heapify(int[] a, int parentIndex, int lastIndex) {
        int leftChildIndex = (parentIndex * 2) + 1;
        int rightChildIndex = (parentIndex * 2) + 2;
        int largestIndex = parentIndex;

        if (leftChildIndex <= lastIndex && a[largestIndex] < a[leftChildIndex]) {
            largestIndex = leftChildIndex;
        }
        if (rightChildIndex <= lastIndex && a[largestIndex] < a[rightChildIndex]) {
            largestIndex = rightChildIndex;
        }

        if (parentIndex != largestIndex) {
            swap(a, largestIndex, parentIndex);
            heapify(a, largestIndex, lastIndex);
        }

    }

    public static void heapSort(int[] a) {
        int size = a.length;
        if (size < 2) {
            return;
        }
        int parentIndex = getParent(size - 1);
        for (int i = parentIndex; i >= 0; i--) {
            heapify(a, i, size - 1);
        }
    }

}
