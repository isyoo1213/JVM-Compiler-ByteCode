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

    private static void loopHeapify(int[] a, int parentIndex, int lastIndex) {
        int leftChildIndex;
        int rightChildIndex;
        int largestIndex;

        // *** 오른쪽 자식 노드 인덱스를 기준으로 하면, 부모 노드가 왼쪽 자식만 가지고 있을 경우, 오른쪽 자식 노드가 없으므로 조건문에서 제외되므로 왼쪽 자식 노드 인덱스를 기준으로 설정해야 함
        while ((parentIndex * 2) + 1 <= lastIndex) {
            leftChildIndex = (parentIndex * 2) + 1;
            rightChildIndex = (parentIndex * 2) + 2;
            largestIndex = parentIndex;

            if (a[leftChildIndex] > a[largestIndex]) {
                largestIndex = leftChildIndex;
            }

            //while의 조건을 왼쪽 자식 노드 인덱스로 기준을 잡았으므로, 오른쪽 자식 노드 인덱스에 대한 범위 검사 필요
            if (rightChildIndex <= lastIndex && a[rightChildIndex] > a[largestIndex]) {
                largestIndex = rightChildIndex;
            }

            if (largestIndex != parentIndex) {
                swap(a, parentIndex, largestIndex);
            } else {
                return;
            }
        }
    }


    public static void maxHeapify(int[] a) {
        int size = a.length;
        if (size < 2) {
            return;
        }
        int parentIndex = getParent(size - 1);
        for (int i = parentIndex; i >= 0; i--) {
            heapify(a, i, size - 1);
        }
    }

    public static void heapSort(int[] a) {

        //maxHeapify
        int size = a.length;
        if (size < 2) {
            return;
        }
        int parentIndex = getParent(size - 1);
        for (int i = parentIndex; i >= 0; i--) {
            heapify(a, i, size - 1);
        }

        //sort
        for (int i = size - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, 0, i - 1);
        }
    }

}
