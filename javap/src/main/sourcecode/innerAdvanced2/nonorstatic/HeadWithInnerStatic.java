package main.sourcecode.innerAdvanced2.nonorstatic;

public class HeadWithInnerStatic {
    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    public HairState hairState = new HairState();
    //public static HairState hairstate = new HairState();
    // *** 오류 이유 - innerClass는 무조건 outerClass의 instance를 물고 있도록 설계되었다.
    // 즉, outerClass에서 innerClass를 static 필드로 가지기 위해서는 꼭 innerClass를 static으로 설계해야한다
    // *** 만약, innerClass가 아닌, 외부 클래스를 static 필드로 가진다면 굳이 innerClass처럼 static 클래스로 만들지 않아도 된다


    public class HairState {
        public String hairColor = "black";
        public int hairAmount;
        //이 경우 inner도 인스턴스 클래스 + inner가 outer의 인스턴스 필드로 사용되므로 outer의 다른 인스턴스 필드에 접근할 수 있다
        public int weight = HeadWithInnerStatic.this.weight - 20;

        // *** static은 static이 붙은 '자료형'의 '생성자'에 관여한다.
        // *** inner가 인스턴스 클래스일 때, static 필드로 사용되지 못하는 것은 inner 자료형(클래스)의 '생성자'가 outer의 '인스턴스'를 필요로하기 때문이다
        // 따라서, inner를 static 필드로 사용하기 위해서는 강제되는 생성자를 풀어주는 static 키워드를 통해 static 클래스로 만들어줘야 한다

        //그러나 inner가 인스턴스 클래스일 때, inner 자체의 필드로 static을 가질 수 있다.(클래스 레벨에서만 접근하므로)
        public static String STYLE_NAME = "plain";

        public HairState() {
            if (HeadWithInnerStatic.hair == true) {
                this.hairAmount = hairAmount + 200;
            }

            if (HeadWithInnerStatic.this.weight >= 20) {
                this.hairAmount = hairAmount + 50;
            }
        }
    }
}
//결국 innerclass의 장점
//1. 정보 보기 편하다
//2. innerClass의 생성자를 구성할 때, 굳이 parameter로 outerClass의 인스턴스를 받는 코드 양을 줄일 수 있다.
//3. 물론 private을 활용하면 캡슐화를 통해 정보를 은닉할 수도 있다.
