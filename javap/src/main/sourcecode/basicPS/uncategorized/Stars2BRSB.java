package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stars2BRSB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        if (number == 1) {
            sb.append("*");
        } else {
            for (int i = 0; i < number * 2; i++) {
                if ((i % 2) == 0) {
                    for (int j = 0; j < ((number - 1) / 2) + 1; j++) {
                        sb.append("* ");
                    }
                } else {
                    for (int k = 0; k < ((number - 2) / 2) + 1; k++) {
                        sb.append(" *");
                    }
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
