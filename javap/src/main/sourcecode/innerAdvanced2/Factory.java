package main.sourcecode.innerAdvanced2;

public class Factory {
    public static void main(String[] args) {
        Person p1 = new Person();
        Head.hair = true;

        System.out.println(p1.head.amount);
        System.out.println(p1.head.hairstate.hairAmount);
        System.out.println(p1.head.hairstate.hairColor);

        Person p2 = new Person();
        System.out.println(p2.headNonInner.amount);
        System.out.println(p2.head.hairstate.hairAmount);
        System.out.println(p2.head.hairstate.hairColor);
    }
}
