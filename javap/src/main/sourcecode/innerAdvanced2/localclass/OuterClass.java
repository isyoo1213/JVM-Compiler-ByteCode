package main.sourcecode.innerAdvanced2.localclass;

public class OuterClass {

    public int a = 30;
    public String b = "koala";
    public static String staticField = "staticField of OuterClass";


    // case 1. non-static method
    // Method 또한 Outer 클래스의 필드와 유사하다고 생각하자
    // 인스턴스 필드는 'Outer의 인스턴스'가 필요하다
    // - why? -> Outer 인스턴스의 생성(new)과 초기화(생성자 호출)가 인스턴스 필드의 생성과 초기화를 트리깅하므로 '실제 값'을 가질 수 있다.
    // -> 이와 마찬가지로, method 또한 인스턴스 필드의 '실제 값'이 생성되는 것처럼, outer 인스턴스에 '실제 값'을 가지는 것과 유사한 맥락을 가진다.
    // -> (실제로는 class가 로딩되는 Method Area의 'non-satic 영역'에 저장된 정보에 대한 '참조를 생성'하는 것)
    // -> *** non-static 영역에 저장된 method 정보는 instance를 통해서만 접근이 가능하다
    // -> *** why? method의 instruction과, 이 instruction이 사용할 operands가 인스턴스를 위한 참조를 가지고 있기 때문에! - javap 파일을 뜯어보고 직접 확인할 것
    // -> + Stack의 LocalVariablesArray의 첫 index에 Class.this, 즉 인스턴스를 가지고 있어야 한다.
    // -> 즉, non-static method는 Outer 인스턴스에 종속적이다
    // cf) static method
    // static method는 'Outer의 인스턴스'가 아닌 'Outer 클래스 그 자체'에 종속적이다.
    // -> 즉, Outer의 인스턴스의 생성이 static method의 생성을 트리깅 하는 것이 아니다
    // -> static method는 클래스가 로딩될 때 생성이 트리깅 된다
    // -> (실제로는 class가 로딩되는 Method Area의 'static 영역'에 method 정보에 대한 '참조를 생성'하는 것)
    // -> ClassLoading 시점에서 별도의 static 영역(java8 이후로는 heap)에 생성이 된다.
    // -> *** static method는 Outer 인스턴스에 비종속적이다

    //1.1 non-static inner
    //non-static method 내부의 inner 또한, Outer 클래스의 this, 즉 인스턴스를 field로 가지므로 Outer의 인스턴스에 종속적이다

    public void method1() {

        class LocalClass {
            int d;

            //inner 자체가 static 필드를 가지는 것은 전혀 문제 없다.
            //why? inner '인스턴스 자체'가 'Outer의 필드로 활용'될 때 외부 인스턴스에 대한 독립성의 이슈는 문제가 되지만(by 생성자),
            //inner 인스턴스 자체가 아닌 인스턴스 내부의 'static 필드'는 외부 인스턴스와는 독립적인 영역이다.
            static String p = "non-static method 내부 inner의 static 필드";

            void method2() {
                System.out.println("LocalClass Field d : " + d);
            }

            void method3() {
                System.out.println("LocalClass Field d using Outer field : " + OuterClass.this.a);
            }
        }

        LocalClass inner1 = new LocalClass(); //자동적으로 outer의 this를 생성자로 넘긴다
        inner1.d = 1004;
        inner1.method2();
        inner1.method3();
        System.out.println(inner1.p);
    }

    // Method 또한 Outer 클래스의 필드와 유사하다고 생각하자
    // static 필드는 Outer의 인스턴스가 필요하지 않다
    // 전제 - 'Outer의 필드를 사용하는' innerClass를 사용하기 위해서는 inner가 Outer의 인스턴스를 들고있어야 한다
    // 그러나, static method 내의 inner는 자동적으로 Outer의 인스턴스를 parameter로 받는 생성자가 아닌, 일반적인 생성자를 갖는다
    // -> static method 내의 inner는 Outer에 대한 인스턴스 정보가 없으므로, Outer의 필드를 사용할 수 없다

    // *** 필드로서의 inner가 지역 클래스로서의 inner와의 다른점
    // inner를 통해 생성하는 인스턴스가 사용되는 목적이 다르다
    // 필드로서의 inner - Outer의 필드, 즉 'Outer 인스턴스'의 '실질적인 데이터' 역할을 한다
    // LocalClass 로서의 inner - Outer의 'method' 내부에서 '독립적인 객체'로서의 역할 + 단지 Outer 인스턴스의 필드, 즉 '실질적인 데이터'를 사용할 수 있는 연결성.
    // 즉, 필드로서의 완결성 vs 지역변수로서의 독립성의 차이를 가진다
    // *** 그렇다면, static 클래스를 사용할 수 없는 이유는?
    // 1. static은 '클래스'의 '필드'에 사용하는 키워드이다. 즉, 필드의 '실질적인 데이터 생성'에 있어 '메모리 위치'의 차이를 분기한다.
    // -> 이는 GC의 대상이 될 것인지의 여부, 즉 일시적인 데이터 처리를 위한 목적성 vs 프로그램 종료 시점까지의 유지성의 차이를 의미
    // -> *** 즉, static이든 non-static이든 inner의 인스턴스가 사용되는 공간은 heap으로 한정된다(java8 이후) + static 키워드를 통해 인스턴스 유지성에 대한 옵션이 존재한다는 의미
    // 2. method는 '이미 완결된 필드'를 활용하는 관점이다.
    // -> 이미 nameAndType이 완결된 필드의 '실질적인 데이터'를 처리하는 과정이다.
    // -> LocalInner는 필드로 사용될 때의 분기인 static 키워드를 고민할 이유가 없이, method가 사용하는 stack 내에서 독립적인 operand를 위한 목적으로 사용된다.
    // -> *** 즉 inner의 인스턴스가 사용되는 공간은 stack으로 한정된다 + static 키워드를 통한 인스턴스 유지성에 대한 옵션이 필요없다(stack은 항상 소멸)

    // case 2.static method
    // static method에서 inner를 사용할 경우 -> Outer의 this 인스턴스를 받지 않는다!
    // -> method에서도/inner에서도 Outer의 필드에 접근 불가


    public static void staticMethod() {

        class LocalClass2 {
            int c;
            // 사용 불가 -
            //int e = OuterClass.this.a;

            // 사용 가능 - Outer의 intance가 필요하지 않기 때문에
            String h = OuterClass.staticField;
            static String p = "static method 내부 inner의 static 필드";
        }

        LocalClass2 innerFromStaticMethod = new LocalClass2();
        innerFromStaticMethod.c = 40;
        System.out.println(innerFromStaticMethod.c);
        System.out.println(innerFromStaticMethod.h);
        System.out.println(innerFromStaticMethod.p);
    }

}
