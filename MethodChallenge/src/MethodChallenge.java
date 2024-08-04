public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println(calculateHighScore(true,1500, 8,100));
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScore(true,1000, 5,50));
        System.out.println(calculateHighScorePosition(1000));
        System.out.println(calculateHighScore(true,500, 8,100));
        System.out.println(calculateHighScorePosition(500));
        System.out.println(calculateHighScore(true,100, 8,100));
        System.out.println(calculateHighScorePosition(100));
        System.out.println(calculateHighScore(true,25, 8,100));
        System.out.println(calculateHighScorePosition(15));
    }

    public static int calculateHighScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }

        return finalScore;
    }

    public static int calculateHighScorePosition(int score){
        int position;
        if(score >= 1000){
            position = 1;
        } else if(score >= 500 && score < 1000){
            position = 2;
        } else if (score >= 100 && score < 500) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
