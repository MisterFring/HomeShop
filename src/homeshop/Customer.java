package homeshop;

public class Customer {
    String billAdress;
    String name;

    public Customer(String billAdress, String name) {
        this.billAdress = billAdress;
        this.name = name;
    }

    public String getBillAdress() {
        return billAdress;
    }

    public String getName() {
        return name;
    }
}
