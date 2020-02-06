package structural.adapter;

public class EnemyTank implements EnemyAttacker {

	@Override
	public String fireWeapon() {
		return "tank shoots";
	}

	@Override
	public String driveForward() {
		return "tank forward";
	}

	@Override
	public String assignDriver(String driverName) {
		return driverName;
	}

}
