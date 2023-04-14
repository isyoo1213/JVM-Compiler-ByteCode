package main.sourcecode;

public class Main {

    static String mainA = "7";
    String mainB = "8";
    static int mainC;

//    Main() {
//        super();
//        this.mainA = 3;
//        this. mainB = 5;
//    }

    public static void main (String args[]) {

        int a = 3;
        int b = 5;
        int ab;
        System.out.println(a+b);
        String c = "cat";

        Cat cat1 = new Cat(1, "nabi");
        cat1.getCurrentAge();

        Calculator calculator1 = new Calculator();
        Calculator calculator2 = new Calculator();
        calculator1.addUse(a, b);

        showMainA();

        //System.out.println(ab);
        System.out.println(Main.mainC);
    }

    public static String showMainA() {
        return Main.mainA;
    }
}