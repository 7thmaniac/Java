public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(100));
        System.out.println(reverse(234));
        numberToWords(234);
        System.out.println();
        System.out.println(getDigitCount(1010));
        System.out.println(reverse(1010));
        numberToWords(1010);
        System.out.println();
        System.out.println(getDigitCount(1000));
        System.out.println(reverse(1000));
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        while(reversedNumber/10 != 0){
            int lastDigit = reversedNumber % 10;
            switch(lastDigit){
                case 0 -> {
                    System.out.print("Zero ");
                    break;
                }
                case 1 -> {
                    System.out.print("One ");
                    break;
                }
                case 2 -> {
                    System.out.print("Two ");
                    break;
                }
                case 3 -> {
                    System.out.print("Three ");
                    break;
                }
                case 4 -> {
                    System.out.print("Four ");
                    break;
                }
                case 5 -> {
                    System.out.print("Five ");
                    break;
                }
                case 6 -> {
                    System.out.print("Six ");
                    break;
                }
                case 7 -> {
                    System.out.print("Seven ");
                    break;
                }
                case 8 -> {
                    System.out.print("Eight ");
                    break;
                }
                case 9 -> {
                    System.out.print("Nine ");
                    break;
                }
                default -> {
                    System.out.print("Invalid Value");
                    return;
                }
            }
            reversedNumber /=10;
        }

        switch(reversedNumber){
            case 0: {
                System.out.print("Zero");
                break;
            }
            case 1: {
                System.out.print("One");
                break;
            }
            case 2: {
                System.out.print("Two");
                break;
            }
            case 3: {
                System.out.print("Three");
                break;
            }
            case 4: {
                System.out.print("Four");
                break;
            }
            case 5: {
                System.out.print("Five");
                break;
            }
            case 6: {
                System.out.print("Six");
                break;
            }
            case 7: {
                System.out.print("Seven");
                break;
            }
            case 8: {
                System.out.print("Eight");
                break;
            }
            case 9: {
                System.out.print("Nine");
                break;
            }
            default: {
                System.out.print("Invalid Value");
                return;
            }
        }

        if(getDigitCount(number)!=getDigitCount(reverse(number))){
            int count = getDigitCount(number)-getDigitCount(reverse(number));
            while (count!=0){
                System.out.print(" Zero");
                count--;
            }
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean negative = false;
        if(number<0){
            number*=-1;
            negative = true;
        }
        while(number/10 != 0){
            reverse += number % 10;
            number /= 10;
            if (number >= 10){
                reverse *= 10;
            }
        }
        reverse = reverse * 10 + number;
        if(negative){
            return reverse * -1;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int digitCount = 0;

        while(number/10 != 0){
            digitCount++;
            number/=10;
        }

        return digitCount+1;
    }
}
