package structural.decorator.example2;

public class MainCabinSeat implements FlightSeat {

    @Override
    public int getCost() {
        return 50;
    }
}
