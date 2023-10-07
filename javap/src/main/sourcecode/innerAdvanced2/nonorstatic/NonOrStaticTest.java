package main.sourcecode.mytest.inner.nonorstatic;

public class NonOrStaticTest {

    static HeadWithStaticInner.StaticHairState staticHairStateByMain = new HeadWithStaticInner.StaticHairState();

    public static HeadWithStaticInner.StaticHairState setStaticHiarState() {
        staticHairStateByMain = new HeadWithStaticInner.StaticHairState();
        staticHairStateByMain.hairColor = "brown";
        System.out.println("Main에서 '새롭게' 생성한 static 인스턴스의 위치");
        System.out.println(staticHairStateByMain.toString());
        return staticHairStateByMain;
    }

    public static void main(String[] args) {

        String hairName = HeadWithStaticInner.StaticHairState.STYLE_NAME;
        HeadWithStaticInner head1 = new HeadWithStaticInner();
        HeadWithStaticInner head2 = new HeadWithStaticInner();

        // static inner가 outer의 '인스턴스 필드'로 사용될 경우 -> outer의 인스턴스를 통해 접근 가능
        System.out.println(head1.hairstate.hairAmount);
        System.out.println(head1.hairstate.hairColor);

        // static inner가 outer의 'static 필드'로 사용될 경우 -> outer 인스턴스 없이도 접근 가능
        System.out.println(HeadWithStaticInner.staticHairState.hairAmount);
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);

        // --- 그렇다면, static inner의 인스턴스를 외부에서 생성하면 어떤 성격을 가질까?
        // 1. '일반 인스턴스'
        //   1-1. outer의 인스턴스 필드에 사용하기
        //   1-2. outer의 static 필드에 사용하기
        // 2. 'static 인스턴스'
        //   2-0. 외부에서 생성한 inner의 'static 인스턴스'의 주소
        //   2-1. outer의 인스턴스 필드에 사용하기
        //   2-1. outer의 static 필드에 사용하기

        //case.1 일반 인스턴스
        System.out.println("case.1 일반 인스턴스");
        System.out.println("1-1. outer의 인스턴스 필드에 사용하기");
        System.out.println("외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 필드(1. 인스턴스 필드 )에 할당");

        // 외부, 즉 Main 클래스에서 '일반 인스턴스' 생성
        HeadWithStaticInner.StaticHairState nonStaticHairState = new HeadWithStaticInner.StaticHairState();
        nonStaticHairState.hairColor = "pink";

        // 1-1. 외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 '인스턴스 필드'에 할당
        head1.hairstate = nonStaticHairState;
        //HeadWithStaticInner.staticHairState = nonStaticHairState;

        System.out.println("인스턴스 필드 검증");
        System.out.println(head1.hairstate.toString());
        System.out.println(head2.hairstate.toString());
        System.out.println(head1.staticHairState.toString());
        System.out.println(head2.staticHairState.toString());
        System.out.println(HeadWithStaticInner.staticHairState.toString());

        System.out.println(head1.hairstate.hairColor);
        System.out.println(head2.hairstate.hairColor);
        System.out.println(head1.staticHairState.hairColor);
        System.out.println(head2.staticHairState.hairColor);
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);


        System.out.println("1-2. outer의 static 필드에 사용하기");
        System.out.println("외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 필드(2. static 필드 )에 할당");

        // 1-2. 외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 'static 필드'에 할당
        HeadWithStaticInner.StaticHairState nonStaticHairState2 = new HeadWithStaticInner.StaticHairState();
        nonStaticHairState2.hairColor = "red";

        HeadWithStaticInner.staticHairState = nonStaticHairState2;

        System.out.println("인스턴스/static 필드 검증");

        //outer의 서로 다른 인스턴스 내에서, '일반 필드'로 사용되는 inner의 인스턴스는 서로 다른 주소를 가진다
        System.out.println(head1.hairstate.toString());
        System.out.println(head2.hairstate.toString());

        System.out.println(head1.hairstate.hairColor);
        System.out.println(head2.hairstate.hairColor);

        //outer의 서로 다른 인스턴스 내에서, 'static 필드'로 사용되는 inner 인스턴스는 서로 '같은 주소'를 가진다
        System.out.println(head1.staticHairState.toString());
        System.out.println(head2.staticHairState.toString());
        System.out.println(HeadWithStaticInner.staticHairState.toString());

        System.out.println(head1.staticHairState.hairColor);
        System.out.println(head2.staticHairState.hairColor);
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);


        //case.2 static 인스턴스
        //   2-0. 외부에서 생성한 inner의 static 인스턴스의 주소
        //   2-1. outer의 인스턴스 필드에 사용하기
        //   2-2. outer의 static 필드에 사용하기

        System.out.println("case.2 static 인스턴스");
        System.out.println("2-0. 외부에서 생성한 inner의 static 인스턴스의 주소");

        //외부, 즉 Main 클래스에서 'static 인스턴스'를 생성하기
        System.out.println("새로운 static 인스턴스를 생성하기 전, Main 클래스의 static 인스턴스");
        System.out.println(NonOrStaticTest.staticHairStateByMain.toString());
        System.out.println(NonOrStaticTest.staticHairStateByMain.hairColor);

        System.out.println("기존의 Head 클래스의 static 필드로서의 static 인스턴스");
        System.out.println(HeadWithStaticInner.staticHairState.toString());
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);


        //외부, 즉 Main 클래스에서 'static 인스턴스'를 '새롭게' 생성하기

        System.out.println("새로운 static 인스턴스 생성");
        HeadWithStaticInner.StaticHairState staticHairStateMain = setStaticHiarState();

        System.out.println(staticHairStateMain.toString());
        System.out.println(NonOrStaticTest.staticHairStateByMain.toString());

        System.out.println("static 인스턴스 검증");
        System.out.println(NonOrStaticTest.staticHairStateByMain.toString()); //Main의 static 필드
        System.out.println(HeadWithStaticInner.staticHairState.toString()); //Head의 static 필드 - *** 외부에서 inner 자료형의 새로운 static 인스턴스를 생성하더라도, 별개로 유지됨
        System.out.println(head1.hairstate.toString()); //Head의 인스턴스 필드

        // Outer에서 생성한 static 인스턴스로서의 static 클래스는 Main에서 생성한 static 인스턴스로서의 static 클래스와 서로 다른 주소를 가진다
        //즉, 여기까지 알 수 있는 것은, 같은 class 자료형을 서로다른 class에서 static 필드로 가지고 있더라도, static 필드로서 생성된 static 인스턴스는 해당 class에 종속적이다
        //즉, static 인스턴스를 소유하는 주체는 'class'임을 명확하게 짚고 넘어가야 함


        //   2-1. outer의 인스턴스 필드에 사용하기
        // 외부에서 만든 static inner의 'static 인스턴스'를 outer 인스턴스의 필드(1. 인스턴스 필드 )에 할당
        System.out.println("2-1. outer의 인스턴스 필드에 사용하기");
        System.out.println("외부에서 만든 static inner의 'static 인스턴스'를 outer 인스턴스의 필드(1. 인스턴스 필드 )에 할당");

        head1.hairstate = staticHairStateMain; //외부에서 새롭게 생성한 inner의 'static 인스턴스'를 할당

        System.out.println("인스턴스 필드 검증");
        System.out.println(head1.hairstate.toString());
        System.out.println(head2.hairstate.toString());

        System.out.println(head1.hairstate.hairColor);
        System.out.println(head2.hairstate.hairColor);


        //   2-2. outer의 static 필드에 사용하기
        // 외부에서 만든 static inner의 'static 인스턴스'를 outer 인스턴스의 필드(2. static 필드 )에 할당
        System.out.println("2-2. outer의 static 필드에 사용하기");
        System.out.println("외부에서 만든 static inner의 'static 인스턴스'를 outer 인스턴스의 필드(2. static 필드 )에 할당");


        //할당에 앞서, 새로운 outer 인스턴스를 생성하면, static 필드는 어떤 인스턴스를 가리킬까?
        System.out.println("새로운 outer 인스턴스 생성");
        HeadWithStaticInner head3 = new HeadWithStaticInner();


        System.out.println("static 필드 검증");
        System.out.println(head1.staticHairState.toString());
        System.out.println(head2.staticHairState.toString());
        System.out.println(head3.staticHairState.toString());

        System.out.println(head1.staticHairState.hairColor);
        System.out.println(head2.staticHairState.hairColor);
        System.out.println(head3.staticHairState.hairColor);

        //head2의 'static 필드'에만 외부에서 생성한 static 인스턴스를 할당
        head2.staticHairState = staticHairStateMain;

        System.out.println("static 인스턴스를 새롭게 할당 후 static 필드 검증");
        System.out.println(head1.staticHairState.toString());
        System.out.println(head2.staticHairState.toString());
        System.out.println(head3.staticHairState.toString());

        System.out.println(head1.staticHairState.hairColor);
        System.out.println(head2.staticHairState.hairColor);
        System.out.println(head3.staticHairState.hairColor);
        System.out.println(NonOrStaticTest.staticHairStateByMain.hairColor);
        System.out.println(staticHairStateMain.hairColor);
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);
        //여기까지 알 수 있는 것은, outer의 인스턴스에 상관 없이 static 필드에 할당된 static instance는 모두 공유됨

        System.out.println(HeadWithInnerStatic.HairState.STYLE_NAME);
    }
}
