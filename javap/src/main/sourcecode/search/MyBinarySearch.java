package main.sourcecode.search;

import java.util.Scanner;

public class MyBinarySearch {
    int binarySearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public void run() {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차 순으로 입력하세요");

        System.out.println("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.println("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.println("검색할 값 : ");
        int key = stdIn.nextInt();
        int index = binarySearch(x, num, key);
        if (index == -1) {
            System.out.println("해당 값의 요소가 없습니다.");
        } else {
            System.out.println(key + "는 x[" + index + "]에 있습니다.");
        }
    }

    public static void main(String[] args) {
        MyBinarySearch bs = new MyBinarySearch();
        bs.run();
    }
}
