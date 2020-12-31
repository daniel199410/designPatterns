package structural.decorator.example2;

public class WiFiDecorator extends FlightSeatDecorator {
    public WiFiDecorator(FlightSeat decoratedFlightSeat) {
        super(decoratedFlightSeat);
    }

    @Override
    public int getCost() {
        return 10 + super.getCost();
    }
}
