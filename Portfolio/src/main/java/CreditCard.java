
public class CreditCard extends FixedAsset implements Valuable{
    int cardNumber;
    int accountNumber;
    double creditLimit;

    public CreditCard(int cardNumber, int accountNumber, double creditLimit){
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void charge(){
        System.out.println("Complete purchase here.");
    }

    public void payBill(){
        System.out.println("Submit payment to clear balance.");
    }
}

