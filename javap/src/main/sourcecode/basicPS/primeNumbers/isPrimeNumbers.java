package main.sourcecode.basicPS.primeNumbers;

public class isPrimeNumbers {

    public static boolean isPrimeV1(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeV2(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeV3(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeV1(43));
        System.out.println(isPrimeV2(43));
        System.out.println(isPrimeV3(43));
    }
}
