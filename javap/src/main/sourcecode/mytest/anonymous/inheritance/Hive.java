package main.sourcecode.mytest.anonymous.inheritance;

public class Hive {

    //1-1. Outer의 non-static 필드가 익명 클래스의 non-static 인스턴스를 가질 때
    Insect spider1 = new Insect(){

        String spiderName;

        //*** Outer의 인스턴스 필드로 활용되는 익명 클래스 내부의 static 필드는 외부에서 접근할 방법이 없다
        //why? 클래스를 지칭할 수 없고, inner의 인스턴스는 '부모 자료형'이므로 외부에서 바로 인스턴스로 접근하는 것은 불가능
        //*** 단, method를 통한 활용은 가능하다
        static int numberOfSpider;

        //*** 생성자를 직접 작성할 수 없으므로 초기화 블럭을 통해 super까지 접근 가능
        // but, this에 대한 초기화는 필드 할당으로도 바로 가능
        {
            this.name = "거미";
            this.spiderName = "무당";
            this.numberOfSpider = 5;
        }

        static {
            numberOfSpider = 10;
        }

        //inner 인스턴스만 가지고 있는 필드이므로 외부에서는 접근 불가능
        //그러나, inner가 부모 메서드를 override한 메서드 '내부'에서는 사용 가능
        void cobWeb() {
            System.out.println(spiderName + "-" + name + " : 알록달록 거미줄을 친다");
        }

        @Override
        public void attack() {
            cobWeb();
            System.out.println(spiderName + "-" + name + " : 독을 발사한다");
            System.out.println("익명클래스의 static field - numberOfSpider : " + numberOfSpider);
        }
    };

    //1-2. Outer의 static 필드가 익명 클래스의 static 인스턴스를 가질 때
    // *** 기존의 non-static inner와 같이, 생성자에서 Outer의 인스턴스를 필드로 가지는 로직이 아닌, 인스턴스에 독립적인 클래스로 생성 및 초기화 된다.
    static Insect spider2 = new Insect(){

        String spiderName;

        //*** Outer의 static 필드로 활요되는 익명 클래스 내부의 static 필드도 외부에서 접근할 수 없다.
        //why? 클래스를 지칭할 수 없고 + Outer의 클래스에 저장된 inner의 static-instance 는 inner형이 아닌 '부모 자료형'이다!!!!!
        // *** static instance를 지칭하는 것은 '클래스 단위'로 접근되어야 한다. in MethodArea(static area)
        //*** 단, inner를 통해 생성한 인스턴스 내부에서 method를 통한 활용은 가능하다 *** by overriding
        // ********* 부모 자료형으로 선언되었어도, **********
        // 자식 자료형으로 '생성'한 경우 + 부모 필드를 초기화하거나 (필드의 경우) 부모 메서드를 overriding한 경우 (메서드의 경우) 부모 자료형으로도 자식 인스턴스의 변수들에 접근 가능!
        // 단, 외부에서는 '직접적인 인스턴스 접근'은 불가능하다. 단지 인스턴스를 활용하는 부모 클래스의 필드와 메서드를 사용 가능할 뿐이다!
        static int numberOfSpider;

        {
            this.name = "거미";
            this.spiderName = "늑대";
            this.numberOfSpider = 10;
        }

        static {
            numberOfSpider = 10;
        }

        void cobWeb() {
            System.out.println(spiderName + "-" + name + " : 끈끈이 거미줄을 친다");
        }

        @Override
        public void attack() {
            cobWeb();
            System.out.println(spiderName + "-" + name + " : 발차기를 한다");
            System.out.println("익명클래스의 static field - numberOfSpider : " + numberOfSpider);
        }
    };

    //2. 메서드 내부의 지역 클래스로 익명 클래스를 사용하기
    // * 복습
    // 로컬 클래스는 메서드 내부에서만 사용되므로 static 키워드 불가능하다 (static은 필드에 사용되는 키워드)
    // * non-static 메서드 / static 메서드의 차이
    // -> 클래스의 인스턴스를 필요로 하느냐, 하지 않느냐의 차이
    // -> inner 입장에서는 non-static 메서드 내부에서 지역 클래스로 사용될 경우 Outer의 this를 가지고
    // -> static 메서드 내부에서 지역 클래스로 사용될 경우 Outer의 this를 가지지 않는 독립적인 클래스로 작동한다
    // * non-static 메서드 내의 inner도 필드로 static 필드를 가질 수 있다
    // why? inner가 Outer의 인스턴스를 필드로 가지는 것이 고려 사항이지, inner 내부의 static 여부는 독립적이고, 가능하다. (외부에서 접근하는 것의 문제는 익명 클래스일 때)



    public void method1(){
        Insect spider3 = new Insect(){
            public String spiderName;
            public static int numberOfSpider;
            {
                this.name = "거미"; //Insect 클래스의 필드
                this.spiderName = "점박이"; //익명 클래스의 필드
                this.numberOfSpider = 20;
            }

            void cobWeb() {
                System.out.println(spiderName + "-" + name + " : 점박이 거미줄을 친다");
            }

            @Override
            public void attack() {
                cobWeb();
                System.out.println(spiderName + "-" + name + " : 펀치를 날린다");
                System.out.println("지역 익명클래스의 static field - numberOfSpider : " + numberOfSpider);
            }
        };
        spider3.attack();
    }

    public static void method2(){
        Insect spider4 = new Insect(){
            public String spiderName;
            public static int numberOfSpider;
            {
                this.name = "거미"; //Insect 클래스의 필드
                this.spiderName = "호랑말코"; //익명 클래스의 필드
                this.numberOfSpider = 30;
            }

            void cobWeb() {
                System.out.println(spiderName + "-" + name + " : 춤을 추면서 거미줄을 친다");
            }

            @Override
            public void attack() {
                cobWeb();
                System.out.println(spiderName + "-" + name + " : 욕을 한다");
                System.out.println("지역 익명클래스의 static field - numberOfSpider : " + numberOfSpider);
            }
        };
        spider4.attack();
    }

    public void method3(Insect spider) {
        spider.attack();
    }

}
