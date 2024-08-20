public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(double annualSalary,boolean isRetired) {
        super(0, "0000-00-00");
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate("2026-12-31");
        isRetired = true;
    }

    @Override
    public double collectPay(){
        double payCheck = annualSalary / 26;
        return (isRetired) ? 0.9 * payCheck : payCheck;

    }
}
