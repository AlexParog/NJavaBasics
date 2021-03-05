package AbstractionAndInterfaces3_3.task2;

public class CheckingAccount extends Account {
    public CheckingAccount(int amount, String accountName) {
        super(amount, accountName);
    }

    @Override
    public boolean pay(int amount) {
        if (this.amount < amount) {
            System.out.println("Недостаточно средств на счету!");
            return false;
        }
        return super.pay(amount);
    }
}
