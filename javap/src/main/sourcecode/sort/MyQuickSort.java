package main.sourcecode.sort;

public class MyQuickSort {
    private static void sort(int[] a) {
        leftPivotSort(a, 0, a.length - 1);
    }

    private static void leftPivotSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(a, low, high);
        leftPivotSort(a, low, pivot - 1);
        leftPivotSort(a, pivot + 1, high);
    }

    private static int partition(int[] a, int left, int right) {
        int low = left;
        int high = right;
        int pivot = a[left];

        while (low < high) {
            while (a[high] > pivot && low < high) {
                high--;
            }
            while (a[low] <= pivot && low < high) {
                low++;
            }
            swap(a, low, high);
        }

        return low;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
