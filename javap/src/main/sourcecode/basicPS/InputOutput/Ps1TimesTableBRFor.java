package main.sourcecode.basicPS.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ps1TimesTableBRFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        br.close();

        long start = System.currentTimeMillis();

        for (int i = 1; i < 5000; i++) {
            System.out.println(a + " * " + +i + " = " + (a * i));
        }

        long end = System.currentTimeMillis();
        long resultTime = end - start;
        System.out.println("소요 시간 : " + resultTime + "ms");
    }
}
