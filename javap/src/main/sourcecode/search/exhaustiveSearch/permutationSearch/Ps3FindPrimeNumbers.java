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

    static String numbers = "123";

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
        System.out.println("n = " + n);
        System.out.println("prefix = " + prefix);
        if (!prefix.equals("") ) {
            set.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < n; i++) {
            System.out.println("prefix = " + prefix + " / i = " + i + " / n = " + n);
            System.out.println("str = " + str);
            System.out.println("str.substring(0, " + i + ") = " + str.substring(0, i));
            System.out.println("str.substring(" + (i + 1) + ", " + n + ") = " + str.substring(i+1, n));
            System.out.println("prefix + str.charAt(i) = " + prefix + str.charAt(i));
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
            //str.substring()의 반복
            // - 각각 i, n까지 이므로, permutation에 진입할 때마다
            //1. substring(0, 0)은 남아있는 배열의 첫 번째 수를 버리고
            //2. substring(i + 1, n)은 위에서 버리고 남아있는 배열의 숫자를 가지고 있게 된다
            //3. n이 0이 되는 경우, 즉 for문을 배열에 있는 숫자의 수만큼 진입하게 되면 n = 0이므로 더 이상 재귀를 반복하지 않게 된다
            // - 즉, 재귀를 들어갈 수록, 전달되는 str의 배열의 숫자가 하나씩 줄어드는 것을 가정
            // ex) 배열의 size가 3일 경우
            // i = 0 -> 배열의 1, 2 인덱스에 해당하는 숫자만 남음
            // i = 1 -> 배열의 0, 2 인덱스에 해당하는 숫자만 남음
            // i = 2 -> 배열의 0, 1 인덱스에 해당하는 숫자만 남음
            // - 즉, 포인트는 str.substring을 통해 재귀를 탈 때 i에 해당하는 인덱스가 제외되며 배열의 사이즈가 하나씩 줄어들고,
            // - 줄어드는 인덱스가 각각의 모든 인덱스에 해당하는 경우를 모두 구현하도록 가정한다는 것이 포인트
        }
    }

    public static void main(String[] args) {
        System.out.println("소수의 총 개수 : " + solution(numbers));
    }
}
