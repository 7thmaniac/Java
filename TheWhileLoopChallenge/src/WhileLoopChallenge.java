public class WhileLoopChallenge {
    public static void main(String[] args) {
        int i = 4;
        int evenCount = 0;
        int oddCount = 0;
        while(i<20) {
            i++;
            if (isEvenNumber(i)) {
                System.out.println(i + " is even number");
                evenCount++;
                if(evenCount == 5) {break;}
                continue;
            }
            oddCount++;
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
