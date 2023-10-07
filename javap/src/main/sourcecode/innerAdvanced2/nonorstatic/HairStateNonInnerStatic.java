package main.sourcecode.innerAdvanced2.nonorstatic;

public class HairStateNonInnerStatic {

    public String hairColor = "black";
    public int hairAmount;

    /* 1.케이스에 해당하는 생성자
    public HairStateNonInnerStatic(HeadNonInnerStaticJavap head) {
        if (head.hair == true) {
            this.hairAmount = this.hairAmount + 50;
        }
    }
    */

    /* 2.케이스에 해당하는 생성자
    public HairStateNonInnerStatic(boolean hair) {
        if (hair == true) {
            this.hairAmount = this.hairAmount + 50;
        }
    }
    */


    /* 3.케이스에 해당하는 생성자
    public HairStateNonInnerStatic() {
        if (HeadNonInnerStaticJavap.hair == true) {
            this.hairAmount = this.hairAmount + 50;
        }
    *//* 외부에서 static 필드로 활용되고 있으므로 인스턴스 변수에 접근 불가
        if (HeadNonInnerStaticJavap.weight >= 20) {
            this.hairAmount = this.hairAmount + 200;
        }
    *//*
    }
    */

}
