package main.sourcecode.basicPS.comparison;

import java.util.Scanner;

public class Ps1ThreeNumsSCIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        /**
         * 3개의 수를 If문을 통해 비교할 경우의 대표적인 분기 케이스
         */
        if (a >= b) {
            if (a >= c) {
                if (b >= c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(a);
            }
        } else {
            if (a <= c) {
                if (b <= c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(a);
            }
        }
    }
}
