package main.sourcecode.staticPractice;

public class MyTest {
    public static void main(String[] args) {
        FieldNonConstructor o1 = new FieldNonConstructor();
        FieldWIthConstructor o2 = new FieldWIthConstructor();
        FieldWIthConstructor o3 = new FieldWIthConstructor();

        //non-static field test
        o2.useStaticField(); //OK
        //FieldWIthConstructor.nonStaticVar.print(); //error


        //static field test
        o2.useStaticField(); //OK
        FieldWIthConstructor.staticVar.print(); //OK
        //즉, static은 class 외부에서의 접근에 대한 차별 - class 명세, 즉 인스턴스가 아닌 타입만으로 접근할 수 있는지의 여부

        ForStaticVar staticVar1 = o2.staticVar = new ForStaticVar();
        System.out.println(staticVar1);
        ForStaticVar staticVar2 = FieldWIthConstructor.staticVar;
        System.out.println(staticVar2);
        System.out.println(o3.staticVar);

        System.out.println();

        ForStaticVar staticVar3= FieldWIthConstructor.staticVar = new ForStaticVar();
        System.out.println(staticVar3);
        System.out.println(o2.staticVar);
        System.out.println(o3.staticVar);
        System.out.println(staticVar1);
        System.out.println(staticVar2);

        System.out.println();

        ForStaticVar staticVar4 = o2.staticVar = new ForStaticVar();
        System.out.println(staticVar4);
        System.out.println(o2.staticVar);
        System.out.println(staticVar1);
        System.out.println(staticVar2);
        System.out.println(staticVar3);

        System.out.println();

        System.out.println(FieldWIthConstructor.staticVar);
        System.out.println(o2.staticVar);

        ForStaticVar staticVar = FieldWIthConstructor.staticVar;
        staticVar = new ForStaticVar();
        staticVar.print();



    }
}
