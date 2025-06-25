package _7_methods;

public class Demo4 {
    public static void main(String[] args) {
        class BankAccount {
            int accountNo;
            String name;
            double balance;

            void deposit(double amount) {
                balance = balance + amount;
            }

            void withdraw(double amount) {
                if (checkBalance() > 0) {
                    balance = balance - amount;
                }
            }

            double checkBalance() {
                System.out.println("Balance: " + balance);
                return balance;
            }
        }

        BankAccount bc = new BankAccount();
        bc.deposit(1000);
        bc.withdraw(500);
        bc.checkBalance(); // optional: shows final balance
    }
}
