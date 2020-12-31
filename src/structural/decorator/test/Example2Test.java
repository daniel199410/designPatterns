package structural.decorator.test;

import org.junit.Test;
import structural.decorator.example2.MainCabinSeat;
import structural.decorator.example2.FlightSeat;
import structural.decorator.example2.WiFiDecorator;
import structural.decorator.example2.HeadphoneDecorator;

import static org.junit.Assert.assertEquals;

public class Example2Test {
    @Test
    public void shouldGetCostForMainCabinSeatWitWifiAndHeadphones() {
        FlightSeat flightSeat = new WiFiDecorator(new HeadphoneDecorator(new MainCabinSeat()));
        assertEquals(75, flightSeat.getCost());
    }

    @Test
    public void shouldGetCostForMainCabinSeatWitWifi() {
        FlightSeat flightSeat = new WiFiDecorator((new MainCabinSeat()));
        assertEquals(60, flightSeat.getCost());
    }

    @Test
    public void shouldGetCostForMainCabin() {
        FlightSeat flightSeat = new MainCabinSeat();
        assertEquals(50, flightSeat.getCost());
    }
}
