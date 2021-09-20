package behavioral.state;

public class OrderedState implements PackageState {
	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	@Override
	public void prev(Package pkg) {

	}

	@Override
	public String getStatus() {
		return "Ordered";
	}
}
