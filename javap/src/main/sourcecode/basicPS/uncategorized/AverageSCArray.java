package main.sourcecode.basicPS.uncategorized;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSCArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] a = new double[sc.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }

        sc.close();

        double total = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            total = total + ((a[i] / a[a.length - 1]) * 100);
        }

        System.out.println(total / a.length);
    }
}
