package test2;

/**
 * Created by KPS on 03.04.2015.
 */
public class Operations {
    public static void main(String[] args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        static void transfer (Account acc1, Account acc2, int amount) throws InsufficientFundsException () {

            if (acc1.getBalance < amount)
                throw new InsufficientFundsException();

            synchronized (acc1) {
                synchronized (acc2) {

                    acc1.withdraw(amount);
                    acc2.deposit(amount);
                }
            }
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                transfer (a, b, 500);
            }
        }).start();

        transfer(b, a, 300);
    }
}
