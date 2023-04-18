package main.sourcecode.abstractclass;

public class Director extends Manager{
    private static Long SEQUENCE_DIRECTOR = 300L;
    private Long directorId;
    private int incentiveRate;

    public Director() {
        this(0);
    }

    public Director(int incentiveRate) {
        this(0, incentiveRate);
    }

    //Manager/Employee가 아닌 경우
    public Director(int bonusRate, int incentiveRate) {
        this(null, null, bonusRate, incentiveRate);
    }

    //Employee인 경우
    public Director(Employee employee, int bonusRate, int incentiveRate) {
        this(null, employee, bonusRate, incentiveRate);
    }

    //Manager인 경우
    public Director(Manager manager, int bonusRate, int incentiveRate) {
        this(manager, manager, bonusRate, incentiveRate);
    }

    public Director(Manager manager, Employee employee, int bonusRate, int incentiveRate) {
        super(manager, employee, bonusRate);
        directorId = ++SEQUENCE_DIRECTOR;
        this.incentiveRate = incentiveRate;
    }



    public int calcSalary() {
        System.out.println(this.directorId + "디렉터의 샐러리 계산");
        return super.calcSalary() + incentiveRate;
    }

    @Override
    public int calcIncentive() {
        System.out.println(this.directorId + "디렉터의 인센티브 계산");
        return basicIncentiveRate + incentiveRate;
    }
}
