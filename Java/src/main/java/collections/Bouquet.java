package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bouquet {
    private double price;
    private List<Flower> flowers = new ArrayList<Flower>();

    public double getPrice() {
        return price;
    }

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "price=" + price +
                ", flowers=" + flowers +
                '}';
    }

    public void findFlowerByStemLength(int parameter) {
        for (Flower fl : flowers) {
            if (fl.getStemLength() == parameter)
                System.out.println(fl);
        }
    }
}
