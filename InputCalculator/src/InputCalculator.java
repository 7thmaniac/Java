import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        int count = 0;
        double avg = 0;
        do{

            try{
                int d = Integer.parseInt(num);
                sum += d;
                count++;
                avg = (double) sum/count;
            }catch (NumberFormatException nfe){
                break;
            }

            num = scanner.nextLine();
        }while (true);

        System.out.println("SUM = " + (sum) + " AVG = " + (int) Math.round(avg));
    }
}
