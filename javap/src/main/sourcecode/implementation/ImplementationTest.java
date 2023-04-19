package main.sourcecode.implementation;

public class ImplementationTest {

    public static void main(String[] args) {
        IPhoneMessanger i1 = new IPhoneMessanger();
        GalaxyMessanger g1 = new GalaxyMessanger();

        System.out.println("메신저 최소 문자 크기 : " + Messanger.MIN_SIZE);
        System.out.println("메신저 최대 문자 크기 : " + Messanger.MAX_SIZE);

        i1.setLogin("login");
        i1.getMessage();
        i1.setMessage("hello");
        i1.clearMessage();

        g1.setLogin("login");
        g1.getMessage();
        g1.setMessage("heya");
        g1.changeKeyboard();
        g1.fileDownload();
        g1.fileUpload();
    }
}
