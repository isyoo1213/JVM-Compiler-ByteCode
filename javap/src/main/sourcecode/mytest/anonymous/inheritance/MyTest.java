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

    }
}
