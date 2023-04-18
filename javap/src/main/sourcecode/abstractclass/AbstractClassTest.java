package main.sourcecode.abstractclass;

public class AbstractClassTest {

    public static void main(String[] args) {

        Director d1 = new Director();
        System.out.println(d1.calcSalary());
        System.out.println(d1.calcIncentive());

        Director d2 = new Director(400);
        System.out.println(d2.calcSalary());
        System.out.println(d2.calcIncentive());

        Director d3 = new Director(300, 600);
        System.out.println(d3.calcSalary());
        System.out.println(d3.calcIncentive());
    }
}
