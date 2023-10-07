package main.sourcecode.implementation;

public interface Messanger {

    public static final int MIN_SIZE = 1;
    public static final int MAX_SIZE = 1000;
    public static final String MESSANGER_NAME = "default";

    public abstract String getMessage();

    void setMessage(String msg);

    public default void setLogin(String login){
        log();
        if (login != null) {
            System.out.println("로그인 처리");
        } else {
            System.out.println("로그아웃 처리");
        }
    }

    private void log(){
        System.out.println("로그 처리");
    }

    public static void getConnection() {
        System.out.println("커넥션 획득 처리");
        getDBAddress();
    }

    private static String getDBAddress() {
        return "123.123.12";
    }
}
