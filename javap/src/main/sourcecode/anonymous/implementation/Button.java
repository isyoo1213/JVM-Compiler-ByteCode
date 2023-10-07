package main.sourcecode.anonymous.implementation;

public class Button {
    OnClickListener listener;

    //외부에서 인스턴스를 통한 메서드 실행 시, parameter에서 인터페이스를 구현하는 익명 클래스로 인스턴스 생성
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.info("프로그램 제어");
        listener.onClick();
    }
}
