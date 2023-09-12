package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  * 문제
 *  * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 *  * 입력
 *  * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *  * 출력
 *  * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *  * 예제 출력
 *  * *********
 *  *  *******
 *  *   *****
 *  *    ***
 *  *     *
 *  *    ***
 *  *   *****
 *  *  *******
 *  * *********
 */

public class StarsBRSB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = (2 * number) - 1 - (2 * i); k > 0; k = k - 1) {
                sb.append("*");
            }
            sb.append("\n");
        }


/*
        //** 생각해볼 점
        //1. 꼭 변수를 사용해서 반복 조건을 구성해야할까?
        //2. 변수를 사용해야 한다면, 공차가 동일한 등차수열 중 어떤 걸 사용할지(바깥 for문의 i), 고정된 상수(number)를 사용할지
        //3. 이를 고려할 때 구성해줄 숫자들의 구성이 등차 수열인지, 아닌지

        for (int i = 0; i < number - 1; i++) {//i = 0, 1, 2, 3
            for (int j = number - 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 3 + (2 * i); k > 0; k = k - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        for (int i = 0; i < number - 1; i++) {
            //j에서 구현해야 할 것 - 4, 3, 2, 1, 0의 등차수열 만들기
            //-> ** 어차피 반복의 조건변화는 공차가 1인 등차수열로 구성해야함
            //-> 그렇다면 j의 시작점 or 조건의 제어에서 변수를 사용해야 함
            // -> number는 시작점 설정을 위해,  i는 조건의 제어를 위해 필수로 사용하게 됨
            for (int j = 1; j < number - 1 - i; j++) {
                sb.append(" ");
            }

            //k에서 구현해야 할 것 - 3 5 7 9 ... 공차가 2인 등차수열
            //-> ** 어차피 반복의 조건변화는 공차가 1인 등차수열로 구성해야함
            //-> k의 시작점/조건 제어 생각하기
            //-> 시작점은 3으로 고정 -> number 사용 필요 없음
            //-> 조건 제어는 공차를 이루므로 변수 사용
            for (int k = 0; k < 3 + (2 * i); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
