public class Account {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(48000001);
        account.setCustomerName("Sasank");
        account.setAccountBalance(500);
        account.setEmail("varanasidbzt@gmail.com");
        account.setPhoneNumber("+16179061433");

        account.deposit(500);

        System.out.println(account.getAccountBalance());

        account.withdraw(500);
        System.out.println(account.getAccountBalance());

        account.withdraw(501);
        System.out.println(account.getAccountBalance());
    }
}
