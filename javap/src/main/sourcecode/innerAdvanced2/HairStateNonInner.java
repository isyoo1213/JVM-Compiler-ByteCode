package main.sourcecode.innerAdvanced2;

public class HairStateNonInner {

    public String hairColor = "black";
    public int hairAmount;

    public HairStateNonInner(HeadNonInner head) {
        if (head.hair == true) {
            this.hairAmount = this.hairAmount + 50;
        }
        if (head.weight >= 20) {
            this.hairAmount = this.hairAmount + 200;
        }
    }

}
