public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }

        int min = (a < b) ? a : b;
        int gcd = 0;

        for ( int i = 1; i <= min; i++){
            if ( a%i == 0 && b%i == 0){
                 gcd = i;
            }
        }
        return gcd;
    }
}
