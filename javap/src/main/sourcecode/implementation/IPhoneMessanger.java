package main.sourcecode.implementation;

public class IPhoneMessanger extends GraphicIOS implements Messanger{
    @Override
    public String getMessage() {
        return "Iphone";
    }

    @Override
    public void setMessage(String msg) {
        System.out.println("IPhone에서 메시지를 설정합니다 : " + msg);
    }

    public void clearMessage() {
        System.out.println("좌우로 흔들어 문자열을 지웁니다");
    }
}
