package main.sourcecode.basicPS.primeNumbers;

import java.util.ArrayList;

public class FindPrimeNumbers {

    public static ArrayList<Integer> findPrimeNumbers(int num) { //num > 3 - sqrt 사용을 위해
        boolean[] sieveOfEratosthenes = new boolean[num + 1]; //true인 경우, num의 약수
        sieveOfEratosthenes[0] = true;
        sieveOfEratosthenes[1] = true;

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; (i - 1) * (i - 1) <= num; i++) {
            if (sieveOfEratosthenes[i] == false) {
                for (int p = 2; p * i <= num; p++) {
                    sieveOfEratosthenes[p * i] = true;
                }
            }
        }

        for (int i = 0; i <= num; i++) {
            if (sieveOfEratosthenes[i] == false) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = findPrimeNumbers(16);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println("소수의 개수 = " + result.size());
    }
}
