package homeshop;

public class Product {
    private String name;
    private String description;
    private Double price;

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display the description of the product
     */
    public void look(){
        System.out.println("This is a : " + name + " : " + description);
    }

    /**
     * Add a product to the bill
     * @param bill refers to concerned bill
     * @param quantity the quantity to add
     */
    public void Buy(Bill bill, Integer quantity){
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
