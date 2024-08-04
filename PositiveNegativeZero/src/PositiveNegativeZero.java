public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumnber(-1);
        checkNumnber(0);
        checkNumnber(1);
    }

    public static void checkNumnber(int n) {
        if (n == 0) {
            System.out.println("zero");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
