package main.sourcecode.basicPS.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ps1TimesTableBRSBFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();

        for (int i = 1; i < 5000; i++) {
            sb.append(a).append(" ").append("*").append(" ").append(i);
            sb.append(" ").append("=").append(" ").append(a * i).append("\n");
        }
        System.out.println(sb);

        long end = System.currentTimeMillis();
        long resultTime = end - start;
        System.out.println("소요시간 = " + resultTime + "ms");
    }
}
