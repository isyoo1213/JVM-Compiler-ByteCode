package main.sourcecode.innerAdvanced;

public class innerAdvancedTest {
    public static void main(String[] args) {


        OuterClass.StaticClass.b = "ab";
        OuterClass.InstanceClass.b = "23";
        System.out.println(OuterClass.InstanceClass.b);

        OuterClass o1 = new OuterClass();
        OuterClass.InstanceClass i1 = o1.new InstanceClass(); //outerClass의 인스턴스를 통해서만 생성 가능

        System.out.println(i1.b);

        OuterClass.StaticClass i2 = new OuterClass.StaticClass(); //outerClass 인스턴스 없이 클래스 접근으로 생성 가능
        //OuterClass.StaticClass i3 = o1.new StaticClass();
        // 오류 - innerClass 생성하는 new 명령어는 이미 qualified 됐다고 함
        OuterClass.StaticClass i3 = new OuterClass.StaticClass();


        System.out.println(i2.getClass().toString());
        System.out.println(i3.getClass().toString());

        i2.a = 3;
        i3.a = 4;

        System.out.println(i2.a); //3
        System.out.println(i3.a); //4 -> Static Class의 인스턴스 field는 서로 다른 주소를 가진다

        OuterClass.InstanceClass.b = "sdf";
        OuterClass.StaticClass.b = "hello";

        if (i2.equals(i3)) {
            System.out.println("i2.toString : " + i2.toString());
            System.out.println("i3.toString : " + i3.toString());
            System.out.println("i2와 i3는 같은 주소를 참조합니다");
        } else {
            System.out.println("i2.toString : " + i2.toString());
            System.out.println("i3.toString : " + i3.toString());
            System.out.println("i2와 i3는 서로 다른 주소를 참조합니다");
        }

        i2.method1(); //static Class의 '인스턴스 멤버'는 static Class의 인스턴스를 통해 접근 + * 클래스 정보로 접근 불가능
        OuterClass.StaticClass.b = "static 필드 b";
        OuterClass.StaticClass.method2(); //static Class의 'static 멤버'는 클래스 정보로 접근 가능 + 인스턴스로 접근 가능
        i2.method2();
    }
}
