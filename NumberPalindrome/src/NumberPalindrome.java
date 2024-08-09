public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    public static boolean isPalindrome(int number) {
        int x = number;
        int reverse = 0;
        while(x/10 != 0){
            reverse += x % 10;
            x /= 10;
            reverse *= 10;

        }

        reverse += x % 10;

        return number == reverse;

    }
}
