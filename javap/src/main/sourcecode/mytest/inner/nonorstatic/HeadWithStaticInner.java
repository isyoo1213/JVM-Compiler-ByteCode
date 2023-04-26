package main.sourcecode.mytest.inner.nonorstatic;

public class HeadWithStaticInner {

    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    public StaticHairState Hairstate = new StaticHairState();
    public static StaticHairState staticHairState = new StaticHairState();

    public static class StaticHairState {
        public String hairColor = "black";
        public int hairAmount;

        public StaticHairState() {
            if (HeadWithStaticInner.hair == true) {
                this.hairAmount = hairAmount + 200;
            }
        /* static 인스턴스에서는 인스턴스 변수에 접근 불가
            if (HeadWithStaticInner.this.weight >= 20) {
                this.hairAmount = hairAmount + 50;
            }
        */
        }
    }

}
