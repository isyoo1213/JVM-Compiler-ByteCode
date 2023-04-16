package main.sourcecode.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        Employee e = new Employee();
        Student s = new Student();

        e.setName("koala");
        e.setAge(33);
        e.setEmpId(1234L);

        s.setName("azuma");
        s.setAge(2);
        s.setMajor("film");


        e.printData();
        s.printData();
    }
}
