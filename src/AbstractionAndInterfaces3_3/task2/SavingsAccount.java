package AbstractionAndInterfaces3_3.task2;

public class SavingsAccount extends Account {
    public SavingsAccount(int amount, String accountName) {
        super(amount, accountName);
    }

    @Override
    public boolean pay(int amount) {
        System.out.print("Со сберегательного счёта нельзя оплачивать!");
        return false;
    }
}
