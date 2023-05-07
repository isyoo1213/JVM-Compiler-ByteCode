package main.sourcecode.enumclass;


/**
 * 변수의 이름은 의미가 있지만, 값 자체는 척도 구분용으로만 사용되고 의미와 연결되지 않음
 * -> 이 경우 enum 클래스를 통해 코드를 짧고 + 의미를 강화해 가독성을 향상시킬 수 있음
 */
public class Status {
    public static final int READY = 1;
    public static final int SEND = 2;
    public static final int COMPLETE = 3;
    public static final int CLOSE = 4;

}


