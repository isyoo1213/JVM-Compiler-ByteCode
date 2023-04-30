package main.sourcecode.mytest.inner.localclass;

public class OuterClass {

    public int a = 30;
    public String b = "koala";

    public void method1() {

        class LocalClass {
            int d;

            int f = OuterClass.this.a;

            void method2() {
                System.out.println("LocalClass Field d : " + d);
            }

            void method3() {
                System.out.println("LocalClass Field d using Outer field : " + f);
            }
        }

        LocalClass inner1 = new LocalClass(); //자동적으로 outer의 this를 생성자로 넘긴다
        inner1.d = 1004;
        inner1.method2();
        inner1.method3();
    }

}
