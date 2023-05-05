package main.sourcecode.mytest.anonymous.implementation;

public class ButtonHandler {

    //Button 인스턴스들은 생성했지만, listener 필드는 null로 비어있는 상태
    // 즉, 외부 클래스인 Handler에서 Button 클래스의 필드의 인스턴스를 주입해주는 방식
    // Button 클래스는 '초기화'에 신경쓰지 않고, 단순히 필드의 자료형에만 의존을 가지기만 하면 된다 -> OCP 원칙
    Button startButton = new Button();
    Button endButton = new Button();

    // 1. 필드로 사용되는 경우
    // *** 즉, 필드의 자료형으로서의 인터페이스를 구현하는 익명 클래스로 인스턴스 필드를 생성
    // + *** 명시적 초기화는 생성자 초기화보다 먼저 일어난다
    OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("프로그램을 시작합니다.");
        }
    };

    ButtonHandler() {
        startButton.listener = listener;

        //2. 메서드의 'parameter'에서 사용되는 경우
        // *** 우선 생성자 자체는 메서드의 논외로 간주하자
        // + Button 인스턴스의 필드에 직접적으로 접근하지 않고, 이를 초기화하는 메서드를 통해서 접근하고 있다.
        // why? Button 인스턴스의 필드가 private일 경우, 이를 접근할 수 있는 메서드를(getter/setter 성격) 주로 제공하기 때문에. 현재는 private은 아님.
        endButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("프로그램을 종료합니다.");
            }
        });
    }

    public void showListenerInfo() {
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Handler에 등록될 Listener의 기본적인 정보입니다");
            }

        };

        listener.onClick();
        listener.info("기본 정보 확인용");
    }
}
