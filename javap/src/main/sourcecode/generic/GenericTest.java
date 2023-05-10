package main.sourcecode.generic;

public class GenericTest {
    public static void main(String[] args) {
        Bag<Book> bag1 = new Bag<Book>(new Book());
        Bag bag2 = new Bag<>(new Book());
    }
}
