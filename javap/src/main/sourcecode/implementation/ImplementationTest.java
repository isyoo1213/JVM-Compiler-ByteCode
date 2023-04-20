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
        i1.draw_textBox();
        i1.draw_submitButton();

        g1.setLogin("login");
        g1.getMessage();
        g1.setMessage("heya");
        g1.changeKeyboard();
        g1.fileDownload();
        g1.fileUpload();

        Object i2 = new IPhoneMessanger();
        System.out.println(i2.toString());
        i2 = (IPhoneMessanger) i2;
        System.out.println(i2.toString());

        extracted(i2);
        extracted(g1);

    }

    private static void extracted(Object obj) {
        if(obj instanceof Object) {
            System.out.println("객체 타입은 Object 입니다");
        }
        if (obj instanceof Messanger) {
            System.out.println("객체 타입은 Messeanger 입니다");
        }
        if (obj instanceof WorkFile) {
            System.out.println("객체 타입은 WorkFile 입니다");
        }
        if (obj instanceof GraphicIOS) {
            System.out.println("객체 타입은 GraphicIOS 입니다");
        }
        if (obj instanceof IPhoneMessanger) {
            System.out.println("객체 타입은 IPhoneMessanger 입니다");
            IPhoneMessanger iobj = (IPhoneMessanger) obj;
            System.out.println(iobj.getMessage());
        }
        if (obj instanceof GalaxyMessanger) {
            System.out.println("객체 타입은 GalaxyMessanger 입니다");
            GalaxyMessanger gobj = (GalaxyMessanger) obj;
            System.out.println(gobj.getMessage());
        }
    }
}
