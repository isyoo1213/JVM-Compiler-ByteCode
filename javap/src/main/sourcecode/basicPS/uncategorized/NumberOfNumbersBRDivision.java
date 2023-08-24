package main.sourcecode.basicPS.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfNumbersBRDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] a = new int[10];

        while (value != 0) {
            a[value % 10]++;
            value = value / 10;
        }

        for (int result : a) {
            System.out.println(result);
        }
    }
}
