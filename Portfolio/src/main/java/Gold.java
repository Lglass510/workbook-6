

public class Gold extends FixedAsset implements Valuable {
    double weight;
    double karat;


    public Gold(double weight, double karat){
        this.weight = weight;
        this.karat = karat;
    }

    public double getValue(){
        return weight * karat;
    }

}
