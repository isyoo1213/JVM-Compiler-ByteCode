package main.sourcecode.innerAdvanced;

public class OuterClass {

    private static String name = "insung";

    public class InstanceClass {

        public int a;
        public static String b = "InstaceClass 필드 b";

        public void method1() {
            System.out.println("Instance Class Field variable : " + a);
        }

        public static void method2() {
            System.out.println("static method 호출 : InstanceClass static 필드 b : " + b);
        }

        public void method3() {
            System.out.println(name);
        }
    }

    public static class StaticClass {

        public int a;
        public static String b = "StaticClass 필드 b";

        public void method1() {
            System.out.println("Static Class Field variable : " + a);
        }

        public static void method2() {
            System.out.println("Static method 호출 : StaticClass static 필드 b : " + b);
        }
    }
}
