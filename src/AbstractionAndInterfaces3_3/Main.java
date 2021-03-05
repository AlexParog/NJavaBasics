package AbstractionAndInterfaces3_3;

import AbstractionAndInterfaces3_3.task1.UsAdministrator;
import AbstractionAndInterfaces3_3.task1.UsLibrarian;
import AbstractionAndInterfaces3_3.task1.UsSupplier;
import AbstractionAndInterfaces3_3.task2.Account;
import AbstractionAndInterfaces3_3.task2.CheckingAccount;
import AbstractionAndInterfaces3_3.task2.CreditAccount;
import AbstractionAndInterfaces3_3.task2.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        // Задание 1
//        UsAdministrator usAdministrator = new UsAdministrator("Григорий");
//        UsLibrarian usLibrarian = new UsLibrarian("Евгения");
//        UsSupplier usSupplier = new UsSupplier("Анатолий");
//
//        usAdministrator.overdueNotification(usLibrarian);
//        usLibrarian.returnBook(usAdministrator);
//        usSupplier.bringBook(usLibrarian);

        // Задание 2
        Account savingAcc = new SavingsAccount(1_000_000, "Сберегательный счёт");
        Account checkingAcc = new CheckingAccount(100_000,"Расчетный счёт");
        Account credAcc = new CreditAccount(10000, "Кредитка");

        savingAcc.transfer(checkingAcc, 10000);
        credAcc.pay(5000);
        checkingAcc.pay(2000);
        savingAcc.pay(20000);

        System.out.println();
        System.out.println(savingAcc.accountName + ": " + savingAcc.getAmount());
        System.out.println(checkingAcc.accountName + ": " + checkingAcc.getAmount());
        System.out.println(credAcc.accountName + ": " + credAcc.getAmount());
    }
}
