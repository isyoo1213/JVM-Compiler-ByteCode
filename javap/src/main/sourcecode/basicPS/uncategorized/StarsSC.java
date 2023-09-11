package main.sourcecode.basicPS.uncategorized;

import java.util.Scanner;

/**
 * 문제
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 * 예제 출력
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class StarsSC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (number * 2) - (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = number - 1; i > 0; i--) {
            for (int j = i; j - 1 > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (number * 2) - (i * 2) + 1  ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
