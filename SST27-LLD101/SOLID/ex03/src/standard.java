public class standard extends Shipment{
    standard(double w){
        super(w);
    }

    double getCost() {
        return 50 + 5*this.getWeightKg();
    }
    
}
