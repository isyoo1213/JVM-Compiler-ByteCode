package main.sourcecode;

public class ThisConstructorTest {
    private String name;
    private int age;

    public ThisConstructorTest() {
        this("guest");
    }

    public ThisConstructorTest(String name) {
        this(name, 0);
    }

    public ThisConstructorTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ThisConstructorTest o1 = new ThisConstructorTest();
        ThisConstructorTest o2 = new ThisConstructorTest("Amy");
        ThisConstructorTest o3 = new ThisConstructorTest("Amy", 23);
    }
}
