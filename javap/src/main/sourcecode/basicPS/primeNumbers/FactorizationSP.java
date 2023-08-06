package main.sourcecode.basicPS.primeNumbers;

import java.util.Scanner;

/**
 * "소인수분해"란 특정한 자연수를 소수들의 곱으로 나타내는 것을 의미합니다. 예를들어 24의 경우, 2X2X2X3으로 표현이 가능하지요. 재귀함수를 이용해서 소인수분해를 연산하는 코드를 작성해 봅시다.
 *
 * 표준입력(Scanner)를 통해 "N"을 입력 받습니다.
 * 재귀를 통해 소인수분해를 수행하는 메서드를 생성하고, 연산결과를 출력합니다.
 *
 * 입력 예)
 * 24
 * 60
 * 출력 예)
 * 2, 2, 2, 3
 * 2, 2, 3, 5
 */

public class FactorizationSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
        }

        if (n != 1) {
            System.out.println(n);
        }
    }
}
