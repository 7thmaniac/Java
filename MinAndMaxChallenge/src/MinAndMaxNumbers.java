import java.io.Console;
import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        consoleMethod();
        scannerMethod();
    }

    public static void consoleMethod(){
        double minNum = 0;
        double maxNum = 0;
        boolean isValid = true;
        Console console = System.console();
        do{
            try{
                double numOrChar = Double.parseDouble(console.readLine());
                if(numOrChar > maxNum){
                    maxNum = numOrChar;
                }else if(numOrChar < minNum){
                    minNum = numOrChar;
                }
            } catch(NumberFormatException e){
                isValid = false;
            }
        }while(isValid);

        System.out.println("Minimum number is: " + minNum + " Maximum number is: " + maxNum);
    }

    public static void scannerMethod(){
        double minNum = 0;
        double maxNum = 0;
        boolean isValid = true;
        Scanner scanner = new Scanner(System.in);
        do{
            try{
                double numOrChar = Double.parseDouble(scanner.nextLine());
                if(numOrChar > maxNum){
                    maxNum = numOrChar;
                }else if(numOrChar < minNum){
                    minNum = numOrChar;
                }
            } catch(NumberFormatException e){
                isValid = false;
            }
        }while(isValid);

        System.out.println("Minimum number is: " + minNum + " Maximum number is: " + maxNum);

    }

}
