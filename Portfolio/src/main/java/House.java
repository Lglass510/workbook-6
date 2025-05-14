

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
}
