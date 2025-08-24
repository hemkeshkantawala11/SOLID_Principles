public class express extends Shipment {
    express(double w) {
        super(w);
    }

    double getCost() {
        return 80 + 8 * this.getWeightKg();
    }
}
