package collections;

import java.util.Comparator;

public class Flower {
    private final double price;
    private final String name;
    private final Color color;
    private final int freshness;
    private final int stemLength;


    protected Flower(double price, String name, Color color, int freshness, int stemLength) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.price = price;
        if (name == null) {
            throw new NullPointerException("Argument name can not be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of flower can not be empty.");
        }
        this.name = name;
        if (color == null) {
            throw new NullPointerException("Argument color can not be null.");
        }
        this.color = color;
        if (freshness < 0 || freshness > 100) {
            throw new IllegalArgumentException("Freshness can not be less then zero or more than 100.");
        }
        this.freshness = freshness;
        if (stemLength < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.stemLength = stemLength;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public static final Comparator<Flower> COMPARE_BY_FRESHNESS = Comparator.comparingInt(Flower::getFreshness);

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                '}';
    }
}








