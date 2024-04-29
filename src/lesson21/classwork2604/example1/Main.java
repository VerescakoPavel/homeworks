package lesson21.classwork2604.example1;

import java.lang.reflect.WildcardType;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Illia Tkachov", "DE0032432423423423",
                AccountType.CREDIT);
        account.deposit(500);
        System.out.println("Deposited 500, amount: " + account.getAmount());

        account.withdraw(400);

        System.out.println("Withdraw 400, amount: " + account.getAmount());

        account.withdraw(200);
        System.out.println("Withdrawn 200, amount: " + account.getAmount());
        System.out.println("In dept: " + account.hasDebt());
    }
}
