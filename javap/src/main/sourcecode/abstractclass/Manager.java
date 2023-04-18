package main.sourcecode.abstractclass;

public abstract class Manager extends Employee{

    private static Long SEQUENCE_MANGERID = 200L;
    protected static final int basicIncentiveRate = 500;
    protected Long managerId;
    private int bonusRate;

    public Manager() {
        this(0);
    }

    public Manager(int bonusRate) {
        this(null, bonusRate);
    }

    //Employee 일 경우
    public Manager(Employee employee, int bonusRate) {
        this(null, employee, bonusRate);
    }

    //Manager 일 경우 - Director에서 호출하는 생성자
    public Manager(Manager manager, int bonusRate) {
        this(manager, manager, bonusRate);
    }

    public Manager(Manager manager, Employee employee, int bonusRate) {
        super(employee);
        if (manager == null) {
            this.managerId = ++SEQUENCE_MANGERID;
        }
        this.bonusRate = bonusRate;
    }

    protected Long getMamagaerId() {
        return this.managerId;
    }

    @Override
    public int calcSalary() {
        System.out.println(this.managerId + "매니저의 샐러리 계산 = " + (basicSalary + basicIncentiveRate + this.bonusRate));
        return basicSalary + basicIncentiveRate + this.bonusRate;
    }

    public abstract int calcIncentive();

}
