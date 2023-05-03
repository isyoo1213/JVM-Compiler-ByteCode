package main.sourcecode.mytest.anonymous.inheritance;

public class Hive {

    //1-1. Outer의 non-static 필드가 익명 클래스의 non-static 인스턴스를 가질 때
    Insect spider1 = new Insect(){

        String spiderName;

        //*** 익명 클래스 내부의 static 필드는 접근할 방법이 없다
        static int numberOfSpider;

        //*** 생성자를 직접 작성할 수 없으므로 초기화 블럭을 통해 super까지 접근 가능
        // but, this에 대한 초기화는 필드 할당으로도 바로 가능
        {
            this.name = "거미";
            this.spiderName = "무당";
            this.numberOfSpider = 5;
        }

        void cobWeb() {
            System.out.println("거미줄을 친다");
        }

        @Override
        public void attack() {
            System.out.println(spiderName + "-" + name + " : 독을 발사한다");
            System.out.println("익명클래스의 static field - numberOfSpider : " + numberOfSpider);
        }
    };

    //1-2. Outer의 static 필드가 익명 클래스의 인스턴스를 가질 때
    // *** 기존의 non-static inner와 같이, 생성자에서 Outer의 인스턴스를 필드로 가지는 로직이 아닌, 인스턴스에 독립적인 클래스로 생성 및 초기화 된다.
    static Insect spider2 = new Insect(){
        String spiderName;
        {
            this.name = "거미";
            this.spiderName = "늑대";
        }

        void cobWeb() {
            System.out.println("거미줄을 친다");
        }

        @Override
        public void attack() {
            System.out.println(spiderName + "-" + name + " : 독을 발사한다");
        }
    };

}
