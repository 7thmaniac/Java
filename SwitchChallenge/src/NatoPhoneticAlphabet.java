public class NatoPhoneticAlphabet {
    public static void main(String[] args) {
        System.out.println(natoPhoneticAlphabet('A'));
        System.out.println(natoPhoneticAlphabet('B'));
        System.out.println(natoPhoneticAlphabet('C'));
        System.out.println(natoPhoneticAlphabet('D'));
        System.out.println(natoPhoneticAlphabet('E'));
        System.out.println(natoPhoneticAlphabet('F'));
    }

    public static String natoPhoneticAlphabet(Character a) {

        String output = a + " is ";
        switch (a) {
            case 'A':
                output += "Able";
                break;
            case 'B':
                output += "Baker";
                break;
            case 'C':
                output += "Charlie";
                break;
            case 'D':
                output += "Dog";
                break;
            case 'E':
                output += "Easy";
                break;
            default:
                output = "Invalid Character";
                break;
        }
        return output;
    }
}
