package main.sourcecode.overrideandload;

public class Employee extends Person {
    private Long empId;

    public Employee() {
        System.out.println("Employee constructor call");
    }

    public Employee(String name, int age, Long empId) {
        //부모로부터의 필드

        //부모 클래스의 생성자 호출
        super(name, 0);
        // 부모 클래스의 method호출
        super.setName(name);
        //부모 클래스의 필드 바로 접근 (protected int age)
        super.age = age;
        //부모 클래스의 필드 바로 접근 (private String name) - 불가능
        //super.name = name;

        //자식 클래스에서 부모의 method 호출
        this.setAge(age);
        this.age = age;

        //자식만 가지고 있는 필드
        //자식 클래스의 필드 바로 초기화
        this.empId = empId;
        System.out.println("Employee constructor(name, age, empId) call");
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }

    @Override
    public void printData() {
        System.out.println(this.getName() + ":" + this.getAge() + ":" + this.getEmpId());
    }

    @Override
    public String toString() {
        return super.toString() + ":" + this.getEmpId();
    }
}
