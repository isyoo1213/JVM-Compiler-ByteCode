package main.sourcecode.basicPS.uncategorized;

import java.util.Scanner;

/**
 * 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 출력
 * 첫째 줄부터 차례대로 별을 출력한다.
 * * -1
 * * -2
 *  *
 * *
 *  *
 * * * -3
 *  *
 * * *
 *  *
 * * *
 *  *
 */

public class Stars2SC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number == 1) {
            System.out.println("*");
        } else {
            for (int i = 0; i < number * 2; i++) {
                if ((i % 2) == 0) {
                    for (int j = 0; j < ((number - 1) / 2) + 1; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int k = 0; k < ((number - 2) / 2) + 1; k++) {
                        System.out.print(" *");
                    }
                }
                System.out.println();
            }
        }
    }
}
