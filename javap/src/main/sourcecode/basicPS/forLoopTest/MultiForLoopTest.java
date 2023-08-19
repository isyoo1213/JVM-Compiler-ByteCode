package main.sourcecode.basicPS.forLoopTest;

public class MultiForLoopTest {

    public static long run1() {
        final long start = System.nanoTime();
        long count = 0;

        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 100; j++) {
                count++;
            }
        }

        final long end = System.nanoTime();
        final long resultTime = end - start;

        System.out.println("run1 : " + resultTime * 1e-9 + " sec");
        return resultTime;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            long test1 = run1();
        }
    }
}
