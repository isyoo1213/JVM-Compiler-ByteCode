package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifRemaindersBRArray {
    public static void main(String[] args) throws IOException {
        boolean[] a = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            a[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for (boolean value : a) {
            if (value) {
                count++;
            }
        }

        System.out.println(count);
    }
}
