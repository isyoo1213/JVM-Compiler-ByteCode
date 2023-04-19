package main.sourcecode.implementation;

public interface WorkFile {
    public static final double VERSION = 1.0;
    String VERSION_NAME = "blue";

    public abstract void fileUpload();

    public abstract void fileDownload();

    default void workingOn() {
        String versionInfo = log();
        System.out.println("workingOn() with " + versionInfo);
    }

    private String log() {
        System.out.println("WorkFile 로깅 시작");
        return "version : " + VERSION_NAME;
    }
}
