public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "05/07/1994";
        int startingIndex = birthDate.indexOf("1994");
        System.out.println("Birth Year: " + birthDate.substring(startingIndex));
        System.out.println("Birth Month: " + birthDate.substring(0,2));

        String newDate = String.join("/", "05", "07", "1994");
        System.out.println(newDate);
    }
}
