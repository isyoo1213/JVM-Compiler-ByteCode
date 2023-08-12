package main.sourcecode.basicPS.comparison;

import java.util.Arrays;
import java.util.Scanner;

public class Ps1ThreeNumsSCArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();

        Arrays.sort(a); //기본 오름차순 정렬

        System.out.println(a[1]);
    }
}
