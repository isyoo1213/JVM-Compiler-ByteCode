package main.sourcecode.innerAdvanced2.nonorstatic;

public class HeadWithStaticInner {

    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    public StaticHairState hairstate = new StaticHairState();
    public static StaticHairState staticHairState = new StaticHairState();

    public static class StaticHairState {
        public String hairColor = "black";
        public int hairAmount;
        public static String STYLE_NAME = "plain";

        public StaticHairState() {
            if (HeadWithStaticInner.hair == true) {
                this.hairAmount = hairAmount + 200;
            }
        // static inner를 outer의 인스턴스 필드로 사용하더라도 outer의 다른 인스턴스 변수에 접근 불가 by 생성자에서 인스턴스가 맞물리지 않음
        //    if (HeadWithStaticInner.this.weight >= 20) {
        //        this.hairAmount = hairAmount + 50;
        //    }

        }
    }

}
