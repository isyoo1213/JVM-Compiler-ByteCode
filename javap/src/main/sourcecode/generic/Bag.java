package main.sourcecode.generic;

public class Bag<T extends Solid>{
    T thing;
    String owner = "koala";

    public Bag(T thing) {
        this.thing = thing;
    }

    boolean isSameOwner(Bag obj) {
        if (this.owner.equals(obj.owner)) {
            System.out.println("owner값은 같습니다");
            return true;
        }
        return false;
    }

    boolean isSameOwner2(Bag<T> obj) {
        if (this.owner.equals(obj.owner)) {
            System.out.println("owner값은 같습니다");
            return true;
        }
        return false;
    }

    boolean isSameOwner3(Bag<?> obj) {
        if (this.owner.equals(obj.owner)) {
            System.out.println("owner값은 같습니다");
            return true;
        }
        return false;
    }

}
