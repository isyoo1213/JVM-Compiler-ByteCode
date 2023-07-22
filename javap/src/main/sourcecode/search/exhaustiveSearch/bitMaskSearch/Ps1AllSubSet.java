package main.sourcecode.search.exhaustiveSearch.bitMaskSearch;

public class Ps1AllSubSet {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int setSize = a.length;

        System.out.println("이진수 표현");
        for (int i = 0; i < (1 << setSize); i++) {
            System.out.println("i = " + i + " - 이진수 i : " + Integer.toBinaryString(i));
        }

        System.out.println("부분집합 표현");
        for (int i = 0; i < (1 << setSize); i++) {
            System.out.print("i = " + i + " - 이진수 i : " + Integer.toBinaryString(i) + " - subset : { ");
            boolean dotCount = false;
            for (int j = 0; j < setSize; j++) {
                if ((1 & (i >> j)) == 0) {
                    continue;
                } else {
                    if (dotCount) System.out.print(", ");
                    dotCount = true;
                    System.out.print(a[a.length - 1 - j]);
                }
            }
            System.out.println(" }");
        }
    }

}
