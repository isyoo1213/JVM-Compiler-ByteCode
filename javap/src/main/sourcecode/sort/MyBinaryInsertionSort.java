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

    public static void advancedBinaryInsertionSort(int[] a) {
        if(a.length < 2) {
            return;
        }
        int incLength = getAscending(a, 0, a.length);
        advancedBinaryInsertionSort(a, 0, a.length, incLength);
    }

    private static void advancedBinaryInsertionSort(int[] a, int low, int high ,int start) {
        if(low == start) {
            start++;
        }

        for (; start < high; start++) {
            int target = a[start];
            int loc = advancedBinarySearch(a, target, low, start);
            int j = start - 1;

            while (j >= loc) {
                a[j + 1] = a[j];
                j--;
            }
            a[loc] = target;
        }
    }

    private static int advancedBinarySearch(int[] a, int key, int low, int high) {

        int mid;
        while (low < high) {
            mid = low + ((high - low) / 2);
            if (key < a[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int getAscending(int[] a, int low, int high) {

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

    private static void reversing(int[] a, int low, int high) {
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
