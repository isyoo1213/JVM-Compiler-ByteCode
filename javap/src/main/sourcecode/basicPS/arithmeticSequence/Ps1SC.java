package main.sourcecode.basicPS.arithmeticSequence;

import java.util.Scanner;

/**
 * 문제
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력
 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

public class Ps1SC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(arithmeticSequence(sc.nextInt()));
        
        sc.close();

    }

    private static int arithmeticSequence(int number) {
        int count = 0;

        //100 미만의 수는 모두 등차수열이므로 굳이 반복문을 돌지 않도록 케이스를 나누어 처리리
        if (number < 100) {
            return number;
        } else {
        //100 이상의 수는 최소 한수의 개수가 99개부터 시작
            count = 99;

            // * number의 범위는 100~999 이므로 3자리수로 고정됨
            // -> 자리수가 고정되지 않은 문제일 경우, while을 통해 접근하는 방법도 생각해봐야함
            for (int i = 100; i < number; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10 ;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        return count;
    }
}
