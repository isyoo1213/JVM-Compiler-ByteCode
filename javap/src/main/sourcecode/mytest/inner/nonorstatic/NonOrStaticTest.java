package main.sourcecode.mytest.inner.nonorstatic;

public class NonOrStaticTest {

    static HeadWithStaticInner.StaticHairState staticHairStateByMain;

    public static HeadWithStaticInner.StaticHairState setStaticHiarState() {
        staticHairStateByMain = new HeadWithStaticInner.StaticHairState();
        staticHairStateByMain.hairColor = "brown";
        System.out.println("Main에서 생성한 static 인스턴스의 위치");
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
        //   1-1. 인스턴스 필드에 사용하기
        // 2. 'static 인스턴스'
        //   2-1. static 필드에 사용하기

        //case.1 일반 인스턴스

        // 외부, 즉 Main 클래스에서 일반 인스턴스 생성
        HeadWithStaticInner.StaticHairState nonStaticHairState = new HeadWithStaticInner.StaticHairState();
        nonStaticHairState.hairColor = "pink";

        // 1-1. 외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 '인스턴스 필드'에 할당
        head1.hairstate = nonStaticHairState;
        //HeadWithStaticInner.staticHairState = nonStaticHairState;

        System.out.println("1-1. Outer의 일반 인스턴스/static 인스턴스로서의 검증");
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

        // 1-2. 외부에서 만든 static inner의 '일반 인스턴스'를 outer 인스턴스의 'static 필드'에 할당
        HeadWithStaticInner.StaticHairState nonStaticHairState2 = new HeadWithStaticInner.StaticHairState();
        nonStaticHairState2.hairColor = "red";

        HeadWithStaticInner.staticHairState = nonStaticHairState2;
        System.out.println("1-2. Outer의 일반 인스턴스/static 인스턴스로서의 검증");
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

        // 그렇다면 접근성은?

        // 외부에서 만든 static inner의 'static 인스턴스'를 outer 인스턴스의 필드(1. 인스턴스 필드 2. static 필드)에 할당

        //1. 할당에 앞서
        //Outer에서 생성한 static 인스턴스로서의 static 클래스는 Main에서 생성한 static 인스턴스로서의 static 클래스와 서로 다른 주소를 가진다

        //Main{}에서 정의한 HeadWithStaticInner.staticHairState의 'static 인스턴스'
        HeadWithStaticInner.StaticHairState staticHairStateByMain = setStaticHiarState();

        System.out.println("static 인스턴스 검증");
        System.out.println(NonOrStaticTest.staticHairStateByMain.toString());
        System.out.println(HeadWithStaticInner.staticHairState.toString());
        System.out.println(head1.hairstate.toString());

        //2. static 인스턴스를 static에 할당한다면?
        // Outer에서 생성한 static 인스턴스로서의 static 클래스는 Main에서 생성한 static 인스턴스로서의 static 클래스와 서로 다른 주소를 가진다

        //그렇다면

        System.out.println(NonOrStaticTest.staticHairStateByMain.hairColor);
        System.out.println(head1.hairstate.hairColor);
        System.out.println(HeadWithStaticInner.staticHairState.hairColor);

    }
}
