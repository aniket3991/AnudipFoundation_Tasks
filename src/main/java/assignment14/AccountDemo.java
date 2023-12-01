package assignment14;

class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account("123456789");
        account.deposit(500);

        try {
            System.out.println(account.withdraw(200));
            System.out.println(account.withdraw(300));
            System.out.println(account.withdraw(1));
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }

    }
}
