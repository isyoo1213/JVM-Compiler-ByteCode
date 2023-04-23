package main.sourcecode.innerAdvanced;

public class OuterClass2 {
    private int num = 1;
    private static int staticNum = 2;

    public OuterClass2() {
        // Outer 생성자에서 Inner 생성자 호출
        inner = new Inner();
        staticInner = new StaticInner();
    }

    private Inner inner;
    private StaticInner staticInner;

    public Inner getInner() {
        return this.inner;
    }

    public StaticInner getStaticInner() {
        return this.staticInner;
    }

    //  인스턴스 내부 클래스는 캡슐화를 지키기 위해 웬만하면 private로!
    private class Inner {
        private int inum = 3;
        //*** 외부에서 static 목적으로 사용 불가!, 외부 클래스가 생성되어야 내부 클래스가 생성될 수 있기 때문?
        // -> *** Inner 자체가 private이므로 outerClass에서 getter를 통해 inner 인스턴스를 반환하더라도, Inner 타입으로 받을 수가 없음(Import 자체가 불가)
        // -> inner 인스턴스 자체는 받을 수 있으나, *** 타입으로 사용할 수 없으므로, inner 인스턴스를 통해 static 인스턴스를 반환하는 getter 또한 접근 불가
        private static int staticiNum = 4;
        private static final int STATIC_FINAL = 4845214;
        private static final String STATIC_FINAL_STRING = "koala";

        public void innerTest() {
            System.out.println(num); // 외부 인스턴스 변수 출력
            System.out.println(staticNum); // 외부 static 변수 출력
            System.out.println(inum); // 내부 인스턴스 변수 출력
            System.out.println(staticiNum); // 내부 static 변수 출력
            System.out.println(STATIC_FINAL); // 내부 상수 출력
            System.out.println(STATIC_FINAL_STRING);
        }

        //사용 불가 - by private class Inner{}
        public int getStaticFromInner() {
            return staticiNum;
        }

        public Inner() {
        }
    }

    private static class StaticInner {
        private int inum = 3;
        //*** 외부에서 static 목적으로 접근 가능?
        private static int staticiNum = 4;
        private static final int STATIC_FINAL = 5;

        public void staticInnerTest() {
            //System.out.println(num); // 외부 인스턴스 변수 출력 X
            System.out.println(staticNum); // 외부 static 변수 출력
            System.out.println(inum); // 내부 인스턴스 변수 출력
            System.out.println(staticiNum); // 내부 static 변수 출력 불가
            System.out.println(STATIC_FINAL); // 내부 상수 출력
        }

        public int getStaticFromStaticInner() {
            return staticiNum;
        }

        public StaticInner() {
        }
    }

    public void outerTest() {
        inner.innerTest();
        staticInner.staticInnerTest();
    }
}

