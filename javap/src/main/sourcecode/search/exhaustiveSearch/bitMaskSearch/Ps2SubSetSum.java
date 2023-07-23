package main.sourcecode.search.exhaustiveSearch.bitMaskSearch;

import java.util.Scanner;

public class Ps2SubSetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setSize = sc.nextInt();
        int totalSum = sc.nextInt();
        int[] a = new int[setSize];
        int resultCount = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < (1 << setSize); i++) {
            int subSetSum = 0;
            for (int j = 0; j < setSize; j++) {
                if ((1 & (i >> j)) == 0) {
                    continue;
                }
                subSetSum = subSetSum + a[a.length - 1 - j];
            }
            if (subSetSum == totalSum) {
                resultCount = resultCount + 1;
            }
        }
        System.out.println(resultCount);
    }
}
