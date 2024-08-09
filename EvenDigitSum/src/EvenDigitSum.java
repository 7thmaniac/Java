public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(22));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(23));
        System.out.println(getEvenDigitSum(-123456789));
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            return -1;
        }
        do{
            int digit = number%10;
            number /= 10;
            if(digit % 2 == 0){
                sum += digit;
            }
        }while(number/10 != 0);
        if(number % 2 == 0){
            sum += number;
        }
        return sum;
    }
}
