package main.sourcecode.mytest.inner;

public class HeadNonInner {
    public int amount = 1;
    public int weight = 20;
    public int size = 30;
    public static boolean hair = true;
    public HairStateNonInner hairState = new HairStateNonInner(this);

}
