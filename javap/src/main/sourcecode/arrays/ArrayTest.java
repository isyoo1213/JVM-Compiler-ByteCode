package main.sourcecode.arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = {2, 4, 6, 8, 10};

        // ** for loop 내부의 i는 index를 직접 가리키는 것이 아니라, index에 저장되어 있는 값을 가져와서 할당받는다
        for (int i : intArray) {
            System.out.println(i);
            System.out.println(intArray[i-1]); //i는 index가 아님을 명확하게 파악해야 함
        }

        for (int i : intArray2) {
            System.out.println(i);
        }


    }
}
