package main.sourcecode.basicPS.InputOutput;

import java.io.*;

public class Ps1TimesTableBRBW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long start = System.currentTimeMillis();

        for (int i = 1; i < 5000; i++) {
            bw.write(a + " * " + i + " = " + (a * i) + "\n");
        }

        long end = System.currentTimeMillis();
        long resultTime = end - start;

        bw.flush();

        System.out.println("소요시간 : " + resultTime + "ms");

        bw.close();
    }
}
