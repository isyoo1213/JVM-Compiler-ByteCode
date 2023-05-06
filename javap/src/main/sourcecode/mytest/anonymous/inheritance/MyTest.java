package main.sourcecode.mytest.anonymous.inheritance;

public class MyTest {
    public static void main(String[] args) {

        Spider spider = new Spider();
        System.out.println(spider.spiderName + spider.name);

        Hive hive = new Hive();
        hive.spider1.attack();
        hive.spider2.attack();
        hive.method1();
        hive.method2();

        hive.method3(new Insect(){
            public String spiderName;
            public static int numberOfSpider;
            {
                this.name = "거미"; //Insect 클래스의 필드
                this.spiderName = "안드로이드"; //익명 클래스의 필드
                this.numberOfSpider = 50;
            }

            void cobWeb() {
                System.out.println(spiderName + "-" + name + " : 탄소나노튜브 거미줄을 친다");
            }

            @Override
            public void attack() {
                cobWeb();
                System.out.println(spiderName + "-" + name + " : 미사일을 발사한다 한다");
                System.out.println("지역 익명클래스의 static field - numberOfSpider : " + numberOfSpider);
            }
        });

    }
}
