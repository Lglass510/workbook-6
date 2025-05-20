import com.pluralsight.finance.Valuable;

public class House extends FixedAsset implements Valuable {
    String datePurchased;
    double sqft;
    double lotAcres;


    public House(String datePurchased, double sqft, double lotAcres){
        this.lotAcres = lotAcres;
        this.sqft = sqft;
        this.datePurchased = datePurchased;
    }

    public double getValue() {
        return value;
    }

    public void retrieveEquity(){
        System.out.println("Contact your bank to start the long hard process of equity liquidation.");
    }
}
