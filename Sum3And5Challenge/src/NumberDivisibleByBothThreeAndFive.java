public class NumberDivisibleByBothThreeAndFive {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if(divisibleByThreeAndFive(i)){
                sum += i;
                count += 1;
                System.out.println(i + " is divisible by three and five");
            }

            if (count == 5) break;
        }
        System.out.println("The sum of first five numbers that are divisible by both three and five is " + sum);
    }

    public static boolean divisibleByThreeAndFive(int a){
        return a % 3 == 0 && a % 5 == 0;
    }
}
