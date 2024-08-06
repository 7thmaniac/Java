public class ForLoopChallenge {
    public static void main(String[] args) {
        System.out.println(noOfPrimes(1000));
    }

    public static boolean isPrime(int n){
        if(n%2 == 0 && n!=2 || n<2){
            return false;
        }
        for(int i=3; i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;

    }

    public static int noOfPrimes(int n){
        int count = 0;
        if(n>1000){
            return -1;
        }
        for(int i = 1; i<=n ;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;

    }
}
