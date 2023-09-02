package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class OXQuizBRSBBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int count = 0;
            int sum = 0;

            for (byte value : br.readLine().getBytes(StandardCharsets.UTF_8)) {
                if (value == 'O') {
                    count++;
                    sum = sum + count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
