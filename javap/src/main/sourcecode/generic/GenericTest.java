package main.sourcecode.generic;

public class GenericTest {
    public static void main(String[] args) {

        Bag<Book> bag1 = new Bag<Book>(new Book());
        System.out.println(bag1.getClass().toString());

        Bag bag2 = new Bag<>(new Book());
        System.out.println(bag2.getClass().toString());

        Bag<Pencil> bag3 = new Bag<>(new Pencil());

        if (bag1.owner.equals(bag2.owner)) {
            System.out.println("두 객체의 owner의 값은 같습니다");
        }

        bag1.isSameOwner(bag2);
        bag1.isSameOwner2(bag2);

        if (bag1.owner.equals(bag3.owner)) {
            System.out.println("두 객체의 owner의 값은 같습니다");
        }

        bag1.isSameOwner(bag3);
        //bag1.isSameOwner2(bag3);
        // *** 오류발생 -> 참조변수에 generic이 명시되어 있으면 해당 클래스는 해당 generic을 필드로 가지는 클래스로 고정되는 것과 유사하게 동작
        // -> 해당 인스턴스가 가지는 method의 generic 또한 고정되므로, 다른 generic으로 생성한 인스턴스는 제한됨
        // *** 그러나 인스턴스 생성 시, 참조변수에 generic을 명시하지 않으면 괜찮음
        // ex> bag2.isSameOwner2(bag3);
        // isSameOwner2() 메서드의 파라미터는 T 유형을 사용하나, 인스턴스의 참조변수가 generic을 사용하지 않으므로 T의 유형이 고정되지 않음

        bag1.isSameOwner3(bag3);
        // *** WildCard
        // 와일드 카드를 사용하면, T가 고정된 참조변수라도 T와 관계없이 해당 클래스 유형의 인스턴스를 모두 사용할 수 있다.

    }
}
