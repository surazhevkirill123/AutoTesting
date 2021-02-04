package collections;

public class Rose extends Flower {
    private final static String name = "Роза";

    public Rose(double price, Color color, int freshness, int stemLength) {
        super(price, name, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
