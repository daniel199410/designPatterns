package behavioral.state;

public class ReceivedState implements PackageState {
	@Override
	public void next(Package pkg) {

	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	@Override
	public String getStatus() {
		return "Received";
	}
}
