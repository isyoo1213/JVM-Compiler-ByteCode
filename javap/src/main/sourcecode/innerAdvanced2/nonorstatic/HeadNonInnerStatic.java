package main.sourcecode.mytest.inner.nonorstatic;

public class HeadNonInnerStatic {
    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    //1.
    //public static HairStateNonInnerStatic hairState = new HairStateNonInnerStatic(this);
    // *** 외부 자료형을 static 필드로 사용할 때는, 생성자에 *** 동적으로 생성되는 일반 인스턴스인 this나 field(this.field)를 넘겨줄 수 없다.
    // *** 왜? 인스턴스화가 필요하니까. static 필드는 그 이전에 생성되고 최초 초기화 된다.

    // 즉, 이 케이스는 outer/innerClass 처럼 두 인스턴스가 서로를 가지고 있는 경우이며, static이 인스턴스를 물고 있기 위해서는..
    // 1-1. 이처럼 static 인스턴스를 만들어서 넘겨주는 방법이 있다.
    //public static HeadNonInnerStaticJavap head = new HeadNonInnerStaticJavap();
    //public static HairStateNonInnerStatic hairState = new HairStateNonInnerStatic(head);

    //2.
    //public static HairStateNonInnerStatic hairState = new HairStateNonInnerStatic(HeadNonInnerStaticJavap.hair);
    // 이 케이스는 static 필드의 생성자에서 *** 동적으로 생성되는 클래스의 인스턴스가 아닌 static 인스턴스를 물고 있으므로, 클래스로딩 시점에서 생성 가능

    //3.
    //public static HairStateNonInnerStatic hairState = new HairStateNonInnerStatic();
    // 이 케이스는 인스턴스와 상관 없이, static 필드를 생성하는 것이므로 ok

}
