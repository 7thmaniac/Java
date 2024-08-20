public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(long employeeId, String hireDate) {
        super("Default name","0000-00-00", "0000-00-00");
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
}
