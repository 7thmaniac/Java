public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(1913));
    }

    public static boolean isPrime(int n){
        if(n%2==0 && n != 2 || n < 2){
            return false;
        }
        for(int i = 3; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
