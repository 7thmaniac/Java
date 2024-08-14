import java.io.Console;

public class SumOfFiveValidNumbers {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        boolean countLimit = true;
        Console console = System.console();

        while(countLimit) {
            int number;
            try{
               number = Integer.parseInt(console.readLine("Enter number #" + count+": "));
            } catch(NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            }

            sum += number;
            count++;
            if(count > 5) countLimit = false;

        }

        System.out.println(sum);
    }
}
