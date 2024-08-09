public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(985));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(90003500));
        System.out.println(sumDigits(-125));
    }

    public static int sumDigits(int number){

        int sumOfDigits = 0;
        if(number <0){
            return -1;
        }else if(number < 10){
            return number;
        }

        while( number >= 10){
            sumOfDigits += (number%10);
            number/= 10;
        }

        return sumOfDigits+number;
    }
}
