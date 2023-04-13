package main.sourcecode;

public class Main {

    int mainA;
    int mainB;

    Main() {
        super();
        this.mainA = 3;
        this. mainB = 5;
    }

    public static void main (String args[]) {

        int a = 3;
        int b = 5;
        System.out.println(a+b);
        String c = "cat";

        Cat cat1 = new Cat(1, "nabi");
        cat1.getCurrentAge();

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        calculator1.addUse(a, b);

        showCatAge(cat1);
    }

    public static int showCatAge(Cat cat) {
        return cat.getCurrentAge();
    }
}

