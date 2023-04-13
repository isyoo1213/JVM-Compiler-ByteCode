package main.sourcecode;

public class Cat {

    public int age;
    public String name;

    Cat(){
        super();
    }

    Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

/*    Cat() {
        this(1, "nabi");
    }*/

    public int getCurrentAge() {
        return age;
    }

    public int getNextAge() {
        return age + 1;
    }

    public int getYearAge(int year) {
        return age + year;
    }

}
