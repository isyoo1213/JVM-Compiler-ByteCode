package main.sourcecode.mytest.inner.localclass;

public class NonStaticClass {

    public int d;
    public ClassNonLocalInner classNonLocalInner; // outer의 인스턴스

    public NonStaticClass(ClassNonLocalInner classNonLocalInner) {
        this.classNonLocalInner = classNonLocalInner;
    }

    void method2() {
        System.out.println("NonLocalClass Field d : " + d);
    }

    void method3() {
        System.out.println("NonStaticClass method using NonLocalInnerClass : " + classNonLocalInner.b);
    }
}
