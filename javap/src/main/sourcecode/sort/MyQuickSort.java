package main.sourcecode.sort;

public class MyQuickSort {
    private static void sort(int[] a) {
        leftPivotSort(a, 0, a.length - 1);
    }

    private static void leftPivotSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = leftPivotPartition(a, low, high);
        leftPivotSort(a, low, pivot - 1);
        leftPivotSort(a, pivot + 1, high);
    }

    private static int leftPivotPartition(int[] a, int left, int right) {
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

    private static void rightPivotSort(int[] a, int low, int high) {
        if (low > high) {
            return;
        }

        int pivot = rightPivotPartition(a, low, high);
        rightPivotSort(a, low, pivot - 1);
        rightPivotSort(a, pivot + 1, high);
    }

    private static int rightPivotPartition(int[] a, int left, int right) {
        int low = left;
        int high = right;
        int pivot = a[right];

        while (low < high) {
            while (a[low] < pivot && low < high) {
                low++;
            }
            while (a[high] >= pivot && low < high) {
                high--;
            }
            swap(a, low, high);
        }
        return high;
    }

    private static void middlePivotSort(int[] a, int low, int high) {

        if(low >= high) {
            return;
        }

        int pivot = middlePivotPartition(a, low, high);

        middlePivotSort(a, low, pivot);
        middlePivotSort(a, pivot + 1, high);
    }

    private static int middlePivotPartition(int[] a, int left, int right) {

        int low = left - 1;
        int high = right + 1;
        int pivot = a[(left + right) / 2];		// 부분리스트의 중간 요소를 피벗으로 설정


        while(true) {
            do {
                low++;
            } while(a[low] < pivot);

            do {
                high--;
            } while(a[high] > pivot && low <= high);

            if(low >= high) {
                return high;
            }

            swap(a, low, high);
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
