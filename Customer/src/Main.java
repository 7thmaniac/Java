public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sasank Varanasi", 1000,"varanasidbzt@gmail.com");
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println(customer.getName());

        Customer customer1 = new Customer();
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getName());

    }
}
