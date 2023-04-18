package main.sourcecode.abstractclass;

abstract class Employee {
    protected static Long SEQUENCE_IMPID = 100L;
    protected static final int basicSalary = 10000;
    protected Long empId;

    public Employee() {
        SEQUENCE_IMPID++;
        this.empId = SEQUENCE_IMPID;
    }

    public Employee(Employee employee) {
        if (employee == null) {
            SEQUENCE_IMPID++;
            this.empId = SEQUENCE_IMPID;
        }
    }

    public abstract int calcSalary();
}
