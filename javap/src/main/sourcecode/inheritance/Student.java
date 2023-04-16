package main.sourcecode.inheritance;

public class Student extends Person{
    private String major;

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
