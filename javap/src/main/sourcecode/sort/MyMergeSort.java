package main.sourcecode.sort;

public class MyMergeSort {

    private static int[] sorted;

    public static void mergeSort(int[] a) {
        sorted = new int[a.length];
        mergeSort(a, 0, a.length - 1);
        sorted = null;
    }

    private static void mergeSort(int[] a, int left, int right) {
        if(left == right) return;

        int mid = (left + right) / 2;

        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int index = left;

        while(l <= mid && r <= right) {
            if(a[l] <= a[r]) {
                sorted[index] = a[l];
                index++;
                l++;
            } else {
                sorted[index] = a[r];
                index++;
                r++;
            }
        }

        if(l > mid) {
            while(r <= right) {
                sorted[index] = a[r];
                index++;
                r++;
            }
        }

        else {
            while(l <= mid) {
                sorted[index] = a[l];
                index++;
                l++;
            }
        }

        for(int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }
}
