package main.sourcecode.mytest;

public class FieldWIthConstructor {
    public int age;
    public String name;
    public static int publicAge;
    public static String publicName;
    public static final int androidAge = 5;
    public static final String androidName = "and_azma";

    public ForStaticVar noneStaticVar = new ForStaticVar();
    public static ForStaticVar staticVar = new ForStaticVar();

    public FieldWIthConstructor() {
        this.age = 10;
        this.name = "koala";
        this.publicAge = 3;
        publicName = "azma";
    }

    public void useNonStaticField() {
        noneStaticVar.print();
    }

    public void useStaticField() {
        System.out.println(staticVar);
        staticVar.print();
    }

}
