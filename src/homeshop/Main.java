package homeshop;

public class Main {
    public static void main(String[] args){
        Product cafetiere = new Product("Senseo", "cafetière senseo", 99.99);
        Television tv = new Television("samsung", "tv samsung", (double) 599, 49, "LED");
        Fridge fridge = new Fridge("beko", "beau frigo", 200.00, 12, true);

        Customer custo = new Customer("2 rue des lilas", "Antho P");

        Bill bill = new Bill(custo);
        bill.addProduct(cafetiere, 1);
        bill.addProduct(tv, 1);

    }
}
