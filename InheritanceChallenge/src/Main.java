import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        Worker sasank = new Worker("Sasank","1994-05-07","2021-07-17");
        System.out.println(sasank.getAge());
    }
}
