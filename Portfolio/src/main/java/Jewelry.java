import com.pluralsight.finance.Valuable;

public class Jewelry extends FixedAsset implements Valuable {
    String name;
    String description;
    double karat;
    double cost;

    public Jewelry(String name, String description, double karat, double cost){
        this.name = name;
        this.description = description;
        this.karat = karat;
        this.cost = cost;
    }

    @Override
    public double getValue() {
        return value;
    }
}
