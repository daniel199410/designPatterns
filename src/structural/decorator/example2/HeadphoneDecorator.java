package structural.decorator.example2;

public class HeadphoneDecorator extends FlightSeatDecorator {
    public HeadphoneDecorator(FlightSeat decoratedFlightSeat) {
        super(decoratedFlightSeat);
    }

    @Override
    public int getCost() {
        return 15 + super.getCost();
    }
}
