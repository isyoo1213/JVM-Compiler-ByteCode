package main.sourcecode.generic;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

    static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number v : list) {
            total = total + v.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] iNum = {1, 2, 3, 4, 5};
        Double[] dNum = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sNum = {"1", "2", "3", "4", "5"};

        List<Integer> iList = Arrays.asList(iNum);
        List<Double> dList = Arrays.asList(dNum);
        List<String> sList = Arrays.asList(sNum);

        double iSum = sum(iList);
        double dSum = sum(dList);
        //sum(sNum); //오류 - by List<? extends Number>

        System.out.println("iSum의 합계 : " + iSum);
        System.out.println("dSum의 합계 : " + dSum);

        System.out.println(isInclude(3, iNum));
        System.out.println(isInclude(4, dNum));
        //isInclude(2, sNum);

        WildCardTest.<Integer, Integer>isInclude(2, iNum);
        WildCardTest.<Double, Double>isInclude(2.0, dNum);
    }


}
