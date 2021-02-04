package collections;

public class Tulip extends Flower {
    private final static String name = "Тюльпан";

    public Tulip(double price, Color color, int freshness, int stemLength) {
        super(price, name, color, freshness, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
