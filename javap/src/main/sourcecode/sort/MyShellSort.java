package main.sourcecode.sort;

public class MyShellSort {

    private final static int[] gap =
            {1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
             8858, 19930, 44842, 100894, 227011, 510774,
             1149241, 2585792, 5818032, 13090572, 29453787,
             66271020, 149109795, 335497038, 754868335, 1698453753};

    private static int getGap(int length) {
        int index = 0;
        int len = (int) (length / 2.25);
        while (gap[index] < len) {
            index++;
        }
        return index;
    }

    private static void shellSort(int[] a) {
        shellSort(a, a.length);
    }

    private static void shellSort(int[] a, int size) {
        int index = getGap(size);
        for (int i = index; i >= 0; i--) {
            for (int j = 0; j < gap[i]; j++) {
                insertionSort(a, j, size, gap[i]);
            }
        }
    }

    private static void insertionSort(int[] a, int start, int size, int gap) {
        for (int i = start + gap; i < size; i = i + gap) {
            int target = a[i];
            int j = i - gap;
            while (j >= start && target < a[j]) {
                a[j + gap] = a[j];
                j = j - gap;
            }
            a[j + gap] = target;
        }
    }

    private static void shortShellSort(int[] a, int size) {
        int gapIndex = getGap(size);
        while (gapIndex >= 0) {
            int step = gap[gapIndex];
            for (int i = step; i < size; i++) {
                for (int j = i; j - step >= 0; j = j - step) { //a[j-step]이 음수가 되는 경우인 오류상황을 포함하므로, && 앞의 조건에서 걸러져 오류가 안생기는지 확인해야함
                    if (a[j] < a[j - step]) {
                        swap(a, j, j - step);
                    }
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
