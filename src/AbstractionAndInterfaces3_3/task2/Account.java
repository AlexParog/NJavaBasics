package AbstractionAndInterfaces3_3.task2;

public class Account {
    protected int amount;
    public String accountName;

    public Account(int amount, String accountName) {
        this.amount = amount;
        this.accountName = accountName;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return accountName;
    }

    public boolean pay(int amount) {
        this.amount -= amount;
        System.out.println("Оплата с: " + accountName + " на " + amount + " руб.");
        return true;
    }

    public boolean transfer(Account account, int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств для совершения перевода!");
            return false;
        }
        if (!account.addMoney(amount)) {
            System.out.println("Перевод с: " + accountName + " на " + account + " не удался!");
            return false;
        }

        this.amount -= amount;
        System.out.println("Перевод одобрен с: " + accountName + " на " + account + " - " + account + " руб.");
        return true;
    }

    public boolean addMoney(int amount) {
        this.amount += amount;
        System.out.println("На счёт: " + accountName + " внесено - " + amount + " руб.");
        return true;
    }
}
