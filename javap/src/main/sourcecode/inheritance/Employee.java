package main.sourcecode.inheritance;

public class Employee extends Person {
    private Long empId;

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }
}
