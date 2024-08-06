public class CalculateInterest {
    public static void main(String[] args) {
        for(double rate = 7.5; rate <= 10; rate += 0.25){
            double interest = calculateInterest(100, rate);
            System.out.println("100 at " + rate + "% interest is $" + interest);
        }
    }

    public static double calculateInterest(double principal, double rate) {
        return (principal * rate )/ 100;
    }
}
