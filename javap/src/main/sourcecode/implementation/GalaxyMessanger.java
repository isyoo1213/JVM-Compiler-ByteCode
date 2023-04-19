package main.sourcecode.implementation;

public class GalaxyMessanger implements Messanger, WorkFile{
    //from Messenger
    @Override
    public String getMessage() {
        return "Galaxy";
    }

    @Override
    public void setMessage(String msg) {
        System.out.println("Galaxy에서 메시지를 설정합니다 : " + msg);
    }

    public void changeKeyboard() {
        System.out.println("키보드 아이콘 터치 후 키보드를 변경합니다.");
    }

    //from WorkFile
    @Override
    public void fileUpload() {
        workingOn();
        System.out.println("file을 다운로드 합니다");
    }

    @Override
    public void fileDownload() {
        workingOn();
        System.out.println("file을 업로드 합니다");
    }
}
