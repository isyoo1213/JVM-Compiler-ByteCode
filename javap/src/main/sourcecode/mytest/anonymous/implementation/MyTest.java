package main.sourcecode.mytest.anonymous.implementation;

public class MyTest {
    public static void main(String[] args) {
        ButtonHandler buttonHandler = new ButtonHandler();
        buttonHandler.startButton.touch();
        buttonHandler.endButton.touch();
        buttonHandler.showListenerInfo();
    }
}
