package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제
 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 입력
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.
 * 예제 출력 1
 * 40.000%
 * 57.143%
 * 33.333%
 * 66.667%
 * 55.556%
 */

/* 예제 입력 1
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

//BufferedReader는 개행문자 전까지만 입력받으므로 줄바꿈을 포함한 데이터 복사 후 붙여넣기하면 정상적으로 입출력 가능
*/

public class OverAverageBRST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a;

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int numberOfStudent = Integer.parseInt(st.nextToken());

            a = new int[numberOfStudent];

            double sum = 0;

            for (int j = 0; j < numberOfStudent; j++) {
                int score = Integer.parseInt(st.nextToken());
                a[j] = score;
                sum = sum + score;
            }

            double mean = sum / numberOfStudent;
            double count = 0;

            for (int j = 0; j < numberOfStudent; j++) {
                if (a[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/numberOfStudent) * 100);
        }
    }
}
