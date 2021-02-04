package collections;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Rose ros1 = new Rose(36.5, Color.Red, 50, 20);
        Rose ros2 = new Rose(20, Color.Green, 40, 15);
        Violet vio1 = new Violet(55.56, Color.Yellow, 60, 55);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1).addFlower(ros2).addFlower(vio1);
        System.out.println(bouquet.toString());                         //получившийся букет
        System.out.println(bouquet.getPrice());                         //цена всего букета
        List<Flower> flowers = bouquet.getFlowers();
        Collections.sort(flowers, Flower.COMPARE_BY_FRESHNESS);
        bouquet.setFlowers(flowers);
        System.out.println("Отсортированный: " + bouquet.toString());   //отсортированный по свежести букет
        bouquet.findFlowerByStemLength(20);                   //нашли цветок по длине стебля
    }
}
