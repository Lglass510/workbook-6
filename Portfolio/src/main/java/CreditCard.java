
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
}

