import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        LocalDate birthDate = LocalDate.parse(this.birthDate);
        LocalDate today = LocalDate.now();
        int age;

        if(birthDate.getDayOfYear() > today.getDayOfYear()  || birthDate.getMonthValue() > today.getMonthValue()){
            age = today.getYear() - birthDate.getYear() - 1;
        }else{
            age = today.getYear() - birthDate.getYear();
        }
        return age;
    }

    public double collectPay(){
        double pay = 0.0;
        return pay;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
