package AbstractionAndInterfaces3_3.task2;

public class CreditAccount extends Account {
    public CreditAccount(int amount, String accountName) {
        super(amount, accountName);
    }


    @Override
    public boolean addMoney(int amount) {
        this.amount += amount;
        System.out.println("На счёт: " + accountName + " внесено - " + amount + " руб.");
        return true;
    }
}
