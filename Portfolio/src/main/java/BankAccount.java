

public class BankAccount extends FixedAsset implements Valuable {
    private int accountNumber;
    private String owner;
    private double balance;


    public BankAccount(int accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
