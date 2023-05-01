package main.sourcecode.mytest.inner.localclass;

public class ClassNonLocalInner {

    public int a = 30;
    public String b = "koala";
    public static String staticField = "staticField of OuterClass";

    public void method1() {
        NonStaticClass nonStaticClass = new NonStaticClass(ClassNonLocalInner.this);
        nonStaticClass.d = 2222;
        nonStaticClass.method2();
        nonStaticClass.method3();
    }


}
