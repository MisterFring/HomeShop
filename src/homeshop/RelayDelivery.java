package homeshop;

public class RelayDelivery implements Delivery {
    private int relayNumber;

    public RelayDelivery(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
