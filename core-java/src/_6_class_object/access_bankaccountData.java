package _6_class_object;

public class access_bankaccountData {
    public static void main(String[] args) {
        System.out.println("**************public variable*************");
int age=20;
        System.out.println("age is " +age);


        System.out.println("**************instance variable*************");

        BankAccount ref=new BankAccount();
        System.out.println("customer id is " +ref.customerId);
        System.out.println("customer number is " +ref.accountNumber);
        System.out.println("balance is " +ref.balance);
        System.out.println("account type is " +ref.accountType);
        System.out.println("account holder is " +ref.accountHolderName);



        System.out.println("**************static variable*************");

        System.out.println("bank name is " +BankAccount.bankName);


    }
}
