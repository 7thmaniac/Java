public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (-1));
    }

    public static int getLargestPrime(int n) {
        if(n < 2) {
            return -1;
        }

        int largestPrime = 0;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                for(int j = 2; j <= i; j++) {
                    if(i % j == 0 && j< i) {
                        break;
                    }else if(i % j == 0 && i==j){
                        largestPrime = i;
                    }
                }
            }
        }
        if(largestPrime == 0) {
            largestPrime = n;
        }
        return largestPrime;
    }
}
