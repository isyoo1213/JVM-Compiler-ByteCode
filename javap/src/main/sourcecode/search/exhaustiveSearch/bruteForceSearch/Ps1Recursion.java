package main.sourcecode.search.exhaustiveSearch.bruteForceSearch;

import java.util.Scanner;

public class Ps1Recursion {
    /**
     * N개의 숫자를 입력받아
     * 이 중 임의의 R개의 수를 골랐을 때,
     * 고른 R개의 합이 S인 모든 경우의 수를 구하여라.
     * 입력은 첫째줄에 공백을 기준으로 순서대로 N, R, S가 주어진다.
     * (R ≤ N ≤ 20, lSl ≤ 1,000,000. 2 ≤ R ≤ 7)
     * 두번째줄에는 N개의 정수가 공백을 기준으로 주어지며,
     * 각 정수의 절대값은 1,000,000을 넘지 않는다.(제한시간1초)
     */

    private static int resultCount = 0;
    private static int[] input;
    private static int n, r, s;

    private static void solve(int index, int sum, int count) {
        //base case
        if (count == r) {
            if (sum == s) {
                resultCount++;
            }
            return;
        }

        //recursion
        for (int i = index + 1; i < n; i++) {
            sum = sum + input[i];
            solve(i, sum, count + 1);
            sum = sum - input[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        s = sc.nextInt();
        input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        solve(-1, 0, 0);
        System.out.println(resultCount);
    }
}
