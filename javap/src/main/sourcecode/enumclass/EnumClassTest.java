package main.sourcecode.enumclass;

public class EnumClassTest {
    public static void main(String[] args) {

        int work = 0;
        EnumClass workEnum = null;
        int n;

        for (int i = 1; i < 5; i++) {
            n = i;

            switch (n) {
                case 1:
                    work = Status.READY;
                    workEnum = EnumClass.READY;
                    break;
                case 2:
                    work = Status.SEND;
                    workEnum = EnumClass.SEND;
                    break;
                case 3:
                    work = Status .COMPLETE;
                    workEnum = EnumClass.COMPLETE;
                    break;
                case 4:
                    work = Status.CLOSE;
                    workEnum = EnumClass.CLOSE;
                    break;
            }
            System.out.println("현재 작업 상태 by static Field : " + work);
            System.out.println("현재 작업 상태 by enum const : " + workEnum);
        }

    }
}
