package test2;

/**
 * Created by KPS on 03.04.2015.
 */
public class Account {
    private int balance;

    public Account() {
    }

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
