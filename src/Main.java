import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("BottleOfWater1", 1.0d, 1000));
        products.add(new BottleOfWater("BottleOfWater2", 0.5d, 500));
        products.add(new BottleOfWater("BottleOfWater3", 2.0d, 2000));

        BottleOfWaterVendingMachine apparat = new BottleOfWaterVendingMachine(products);

        //System.out.println(apparat.getProducts());
        for(Product p : apparat.getProducts()){
            System.out.println(p);
        }
        System.out.println();
        System.out.println(apparat.getProduct("BottleOfWater1"));
        System.out.println(apparat.getProduct("BottleOfWater3", 2000));

        System.out.println();
        System.out.println();

        List<Product> products2 = new ArrayList<>();
        products2.add(new HotDrink("HotDrink1", 100.0d, 50));
        products2.add(new HotDrink("HotDrink2", 150.0d, 75));
        products2.add(new HotDrink("HotDrink3", 200.0d, 99));

        HotDrinkVendingMachine apparat2 = new HotDrinkVendingMachine(products2);
        for(Product p : apparat2.getProducts()){
            System.out.println(p);
        }
        System.out.println();
        System.out.println(apparat2.getProduct("HotDrink1"));
        System.out.println(apparat2.getProduct("HotDrink3", 99));

    }
}
