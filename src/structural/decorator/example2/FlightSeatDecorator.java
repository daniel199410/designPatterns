package structural.decorator.example2;

public abstract class FlightSeatDecorator implements FlightSeat {

    protected FlightSeat decoratedFlightSeat;

    public FlightSeatDecorator(FlightSeat decoratedFlightSeat) {
        this.decoratedFlightSeat = decoratedFlightSeat;
    }

    @Override
    public int getCost() {
        return decoratedFlightSeat.getCost();
    }
}
