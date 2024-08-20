public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t     \n");

        String word = "Hello World";
        System.out.printf("Index of r: %d\n", word.indexOf('r'));
        System.out.printf("Index of world: %d\n", word.indexOf("World"));
        System.out.printf("Index of l: %d\n", word.indexOf("l"));
        System.out.printf("Last Index of l: %d\n", word.lastIndexOf("l"));
        System.out.printf("Second Index of l: %d\n", word.indexOf("l", 3));
        System.out.printf("Second Last Index of l: %d\n", word.lastIndexOf("l", 8));

        String helloworldlower = "hello world";

        if(word.equals(helloworldlower)) {
            System.out.println("Values match exactly");
        }

        if(helloworldlower.equalsIgnoreCase(helloworldlower)) {
            System.out.println("Values match ignoring case");
        }

        if(word.startsWith("Hello")){
            System.out.println("Word starts with 'Hello'");
        }

        if(word.endsWith("World")) {
            System.out.println("Word ends with 'World'");
        }

        if(word.contains("World")) {
            System.out.println("Word contains 'World'");
        }

        if(word.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length of string: %d\n", length);
        if(string.isEmpty()){
            System.out.printf("Length of string is %d\n",length);
            return;
        }
        if(string.isBlank()){
            System.out.printf("Sting is blank and length of string is %d\n",length);
        }
        System.out.printf("First character: %c\n", string.charAt(0));
        System.out.printf("Last character: %c\n", string.charAt(length - 1));;
    }
}
