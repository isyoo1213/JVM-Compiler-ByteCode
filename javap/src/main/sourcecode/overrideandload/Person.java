package main.sourcecode.overrideandload;

public class Person {
    private String name;
    protected int age;

    public Person() {
        System.out.println("Person constructor call");
    }

    public Person(String name, int age) {
        System.out.println("Person constructor(name, age) call");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printData() {
        System.out.println(name + ":" + age);
    }

    public String toString() {
        return name + ":" + age;
    }

    public void onlyParentMethd() {
        System.out.println("call onlyParentMethod : " + this.name);
    }
}
