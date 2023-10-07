package main.sourcecode.mytest.inner;

public class Head {
    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    public HairState hairstate = new HairState();

    public class HairState {
        public String hairColor = "black";
        public int hairAmount;

        public HairState() {
            if (Head.this.hair == true) {
                this.hairAmount = hairAmount + 200;
            }
            if (Head.this.weight >= 20) {
                this.hairAmount = hairAmount + 50;
            }
        }
    }
}
//결국 innerclass의 장점
//1. 정보 보기 편하다
//2. innerClass의 생성자를 구성할 때, 굳이 parameter로 outerClass의 인스턴스를 받는 코드 양을 줄일 수 있다.
//3. 물론 private을 활용하면 캡슐화를 통해 정보를 은닉할 수도 있다.
