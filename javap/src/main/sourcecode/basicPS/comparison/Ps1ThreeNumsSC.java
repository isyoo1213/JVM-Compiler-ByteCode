package main.sourcecode.basicPS.comparison;

import java.util.Scanner;

/**
 * 문제
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 *
 * 출력
 * 두 번째로 큰 정수를 출력한다.
 *
 * 예제 입력 1
 * 20 30 10
 * 예제 출력 1
 * 20
 * 예제 입력 2
 * 30 30 10
 * 예제 출력 2
 * 30
 */
public class Ps1ThreeNumsSC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }
}
