package main.sourcecode.arrays;

import java.util.Arrays;

public class ObjectArrayTest {

    //*** static keyword를 사용하는 이유를 명확히 알아야 한다.
    public static int findIndex(MyObject[] array, MyObject target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(MyObject[] objArray) {
        for (MyObject obj : objArray) {
            System.out.println("objArray[" + findIndex(objArray, obj) + "] = " + obj.toString());
            System.out.println("objArray[" + findIndex(objArray, obj) + "].age = " + obj.age);
            System.out.println("objArray[" + findIndex(objArray, obj) + "].name = " + obj.name);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        MyObject[] objArray = new MyObject[3];
        objArray[0] = new MyObject(10, "azuma");
        objArray[1] = new MyObject(15, "lily");
        objArray[2] = new MyObject(100, "nozomi");

        printArray(objArray);

        MyObject[] objArray2 = objArray;
        printArray(objArray2);

        MyObject[] objArray3 = Arrays.copyOf(objArray, 3);
        printArray(objArray3);

        if (objArray.equals(objArray2)) {
            System.out.println("Array1 == Array2");
        }
        if (objArray.equals(objArray3)) {
            System.out.println("Array1 == Array3");
        } else {
            System.out.println("Array1 != Array3");
        }

    }

}
