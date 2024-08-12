public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack (-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0 || (bigCount * 5 + smallCount) < goal ) {
            return false;
        }

        if(bigCount != 0 && smallCount != 0) {
            for(int i = 1; i<=bigCount; i++){
                if(goal==(i*5)){
                    return true;
                }
            }
            int remainingCount = goal%5;
            return smallCount >= remainingCount;
        }else if(bigCount != 0 && goal >= bigCount * 5){
            for(int i = 1; i<=bigCount; i++){
                if(goal==(i*5)){
                    return true;
                }
            }
        }else return smallCount != 0 && goal <= smallCount;
        return false;
    }
}
