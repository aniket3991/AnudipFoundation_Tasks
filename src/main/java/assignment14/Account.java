package assignment14;

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(int amount) {
        this.balance = amount + balance;
    }

    double withdraw(int amount) throws InsufficientFundsException {
        if (this.balance < amount)
            throw new InsufficientFundsException("You do not have sufficient balance to withdraw");

        return this.balance = this.balance - amount;
    }
}
