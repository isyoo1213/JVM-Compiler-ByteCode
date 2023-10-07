package main.sourcecode.innerAdvanced2.localclass;

public class ClassStaticMethod {

    //case 1. instance method
    //1.1 - normal inner
    //1.2 - static inner
    //case 2. static method
    //2.1 - normal inner
    //2.2 - static inner

    //case 1-1. instance method + normal inner
    public void method1() {
        class NormalInner {

        }
    }

    //case 1-2. instance method + static inner
    public void method2() {
        //static class StaticInner {

        //}
    }

    //case 2-1. static method + normal inner
    public static void method3() {



        class NormalInner2 {

        }
    }

    //case 2-2. static method + static inner
    public static void method4() {
        //static class StaticInner2{

        //}
    }
}
