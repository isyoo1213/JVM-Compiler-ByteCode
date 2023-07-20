package main.sourcecode.search.exhaustiveSearch.bruteForceSearch;

import java.util.Scanner;

public class Ps1 {

    /**
     * N개의 숫자를 입력받아 이 중 임의의 3개의 수를 골랐을 때, 세 수의 합이 S인 모든 경우의 수를 구하여라.
     * 입력은 첫째줄에 공백을 기준으로 순서대로 N과 S가 주어진다.
     * (3 ≤ N ≤ 20, lSl ≤ 1,000,000)
     * 두번째줄에는 N개의 정수가 공백을 기준으로 주어지며,
     * 각 정수의 절대값은 1,000,000을 넘지 않는다.(제한시간1초)
     */

    //1. 모든 경우의 수 생각해보기
    // 최대 - 20C3 - 20 x 19 x 18 / 3 x 2 = 1140
    // 시간복잡도 고려했을 때 1초 내에 모든 경우의 수 처리 가능
    // -> bruteForce 탐색 가능

    //*** 주의점
    // n에 주어지는 숫자의 중복 여부에 따라 조합이 아닌 순열이 될 수도 있다
    // + 위와 같은 경우, 루프 변수의 중복이 문제가 될 수 있다. (같은 index의 수를 3번 골라도 만족하는 경우)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        //solve
        int resultCount = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    int sum = input[i] + input[j] + input[k];
                    if (sum == s) {
                        resultCount++;
                    }
                }
            }
        }
        System.out.println(resultCount);
    }

}
