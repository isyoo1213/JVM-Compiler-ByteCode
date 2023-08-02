package main.sourcecode.search.exhaustiveSearch.permutationSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * BY Programmers
 * 문제 설명
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers는 길이 1 이상 7 이하인 문자열입니다.
 * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 * 입출력 예
 * numbers / return
 * "17"	/ 3
 * "011" / 2
 * 입출력 예 설명
 * 예제 #1
 * [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
 * 예제 #2
 * [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
 *
 * 11과 011은 같은 숫자로 취급합니다.
 */

public class Ps3FindPrimeNumbers {

    static String numbers = "0123";

    public static int solution(String numbers) {
        int answer = 0; //문제에 주어진 변수 + return에 사용해야함

        HashSet<Integer> set = new HashSet<>();

        permutation("", numbers, set);

        while (set.iterator().hasNext()) {
            int a = set.iterator().next();
            set.remove(a);

            /* for isPrimeV1()
            if (a == 2) {
                System.out.println(a);
                answer++;
            }
            if (a % 2 != 0 && isPrimeV2(a)) {
                System.out.println(a);
                answer++;
            }
            */

            if (isPrimeV2(a)) {
                System.out.println(a);
                answer++;
            }

        }
        return answer;
    }

    //isPrimeV1을 사용할 경우, n = 2 인 경우를 따로 처리해주어야 함
    public static boolean isPrimeV1(int n) {
        //0과 1은 소수에서 제외
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeV2(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if (!prefix.equals("") ) {
            System.out.println("prefix = " + prefix);
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
    }

    public static void main(String[] args) {
        System.out.println("소수의 총 개수 : " + solution(numbers));
    }
}
