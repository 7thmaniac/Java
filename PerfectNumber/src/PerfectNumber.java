public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int i = 1;
        if(num < 1){
            return false;
        }
        while(i < num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }
}
