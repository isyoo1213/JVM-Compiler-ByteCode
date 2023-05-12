package main.sourcecode.generic;

interface GenericInterface <T extends Comparable<T>>{
    T max();
}

class NumUtil<T extends Comparable<T>> implements GenericInterface<T> {

    T[] value;

    NumUtil(T[] value) {
        this.value = value;
    }

    @Override
    public T max() {
        T v = value[0];

        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(v) > 0) {
                v = value[i];
            }
        }
        return v;
    }
}

public class GenericInterfaceTest{
    public static void main(String[] args){
        Integer[] iNum = {1, 2, 3, 4, 5};
        Double[] dNum = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sNum = {"1", "2", "3", "4", "5"};

        NumUtil iUtil = new NumUtil(iNum);
        NumUtil dUtil = new NumUtil(dNum);
        NumUtil sUtil = new NumUtil(sNum);

        System.out.println("inum 최댓값 : " + iUtil.max());
        System.out.println("dnum 최댓값 : " + dUtil.max());
        System.out.println("snum 최댓값 : " + sUtil.max());

        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요");
        System.out.println(sb);
        sb.insert(0, "반갑습니다.");
        System.out.println(sb);


    }
}

