public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(6);
        printSquareStar(7);
    }

    public static void printSquareStar(int n) {
        if (n < 5){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++){
                if(i == 1 || j==1 || i == n || j == n || i == j || j == n - (i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
