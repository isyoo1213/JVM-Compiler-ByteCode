package main.sourcecode.overrideandload;

public class Student extends Person {
    private String major;

    public Student() {
        System.out.println("Student constructor call");
    }

    public Student(String name, int age, String major) {
        //부모로부터의 필드
        //부모 클래스의 생성자 호출
        super(name, age);

        //자식만 가지고 있는 필드
        //자식 클래스의 method 호출
        this.setMajor(major);
        System.out.println("Student constructor(name, age, major) call");
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void printData() {
        super.toString();
        System.out.println(this.getName() + ":" + this.getAge() + ":" + this.getMajor());
    }

    @Override
    public String toString() {
        return super.toString() + ":" + this.getMajor();
    }
}
