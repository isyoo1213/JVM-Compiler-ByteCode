package main.sourcecode.basicPS.InputOutput;

import java.util.Scanner;

public class Ps1TimesTableSCFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        sc.close();

        long start = System.currentTimeMillis();

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }

        long end = System.currentTimeMillis();
        long resultTime = end - start;
        System.out.println("소요 시간 : " + resultTime + "ms");
    }
}
