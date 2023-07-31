package main.sourcecode.search.exhaustiveSearch.RecursiveSearch;

public class Ps1Factorial {
    public static void main(String[] args) {
        int n = 5;
        boolean isFirst = true;
        System.out.print(n + "! = ");
        System.out.println(factorial(n, isFirst));
    }

    public static int factorial(int n, boolean isFirst) {
        if (n == 0) {
            if (!isFirst) {
                System.out.print(" = ");
            }
            return 1;
        } else {
            if (isFirst == false) {
                System.out.print(" * ");
            }
            System.out.print(n);
            isFirst = false;
            return n * factorial(n - 1, isFirst);
        }
    }
}
