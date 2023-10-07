package main.sourcecode.inheritance;

import main.sourcecode.implementation.GalaxyMessanger;
import main.sourcecode.implementation.Messanger;

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

        Messanger messanger = new GalaxyMessanger();
        messanger.setLogin("login");
        e.printData();
        s.printData();
    }
}
