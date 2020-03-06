package homeshop;

public class Fridge extends Product {
    private int filter;
    private boolean freezer;

    public Fridge(String name, String description, Double price, int filter, boolean freezer) {
        super(name, description, price);
        this.filter = filter;
        this.freezer = freezer;
    }

    public int getFilter() {
        return filter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}