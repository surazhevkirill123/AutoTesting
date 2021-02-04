package collections;

public class Violet extends Flower {
    private final static String name = "Фиалка";

    public Violet(double price, Color color, int freshness, int stemLength) {
        super(price, name, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
