public class InchesToCentimeters {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
        System.out.println(convertToCentimeters(5,8));
        System.out.println(convertToCentimeters(80));
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int totalHeightInInches = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(totalHeightInInches);
    }
}
