public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){

        int lastDigit = 0;
        if(number < 0){
            return -1;
        }else if (number < 10){
            return number *2;
        }

        do{
            if(lastDigit == 0){
                lastDigit = number%10;
            }
            number /= 10;
        }while(number/10 != 0);

        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
