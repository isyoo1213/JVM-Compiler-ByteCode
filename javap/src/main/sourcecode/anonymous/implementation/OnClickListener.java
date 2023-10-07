package main.sourcecode.anonymous.implementation;

public interface OnClickListener {

    public static final String NAME = "defuault";

    public static Double VERSION = 1.0;

    public default void info(String purpose) {
        String modelname = setModelName();
        System.out.println(purpose + " 용도의 " + modelname);
        System.out.println("Listener Version : " + VERSION);
    }

    private String setModelName() {
        return NAME + "-" + "Listener";
    }

    void onClick();
}
