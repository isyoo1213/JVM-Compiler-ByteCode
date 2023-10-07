package main.sourcecode.innerAdvanced2.localclass;

public class MyTest {
    public static void main(String[] args) {

        OuterClass outer1 = new OuterClass();
        outer1.method1();
        outer1.staticMethod();

        ClassNonLocalInner ins1 = new ClassNonLocalInner();
        ins1.method1();

    }


}
