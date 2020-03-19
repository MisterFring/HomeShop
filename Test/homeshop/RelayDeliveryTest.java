package homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {
    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0(){
        Delivery delivery = new RelayDelivery(5);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_LowRelay_WhenGettingDeliveryPrice_ThenGet0(){
        Delivery delivery = new RelayDelivery(27);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_HighRelay_WhenGettingDeliveryPrice_ThenGet0(){
        Delivery delivery = new RelayDelivery(50);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }

}