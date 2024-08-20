public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    private static double hoursWorked;

    public HourlyEmployee(double hourlyPayRate) {
        super(0,"0000-00-00");
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40*hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }
}
