package main.sourcecode.sort;

public class MyBinaryInsertionSort {

    public static void binaryInsertionSort(int[] a) {
        binaryInsertionSort(a, a.length);
    }

    private static void binaryInsertionSort(int[] a, int size) {
        for(int i = 1; i < size; i++) {
            int target = a[i];
            int location = binarySearch(a, target, 0, i);
            int j = i - 1;
            while(j >= location) {
                a[j + 1] = a[j];
                j--;
            }
            a[location] = target;
        }
    }

    private static int binarySearch(int[] a, int key, int low, int high) {
        int mid;
        while(low < high) {
            mid = low + ((high - low) / 2);
            if(key < a[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return high;
    }

    int getAscending(int[] a, int low, int high) {

        int limit = low + 1;
        if(limit == high) {
            return 1;
        }

        if(a[low] <= a[limit]) {
            while(limit < high && a[limit - 1] <= a[limit]) {
                limit++;
            }
        }
        else {
            while(limit < high && a[limit - 1] > a[limit]) {
                limit++;
            }
            reversing(a, low, limit);
        }

        return limit - low;
    }

    void reversing(int[] a, int low, int high) {
        high--;
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }

}
