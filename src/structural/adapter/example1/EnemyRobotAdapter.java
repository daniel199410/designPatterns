package structural.adapter.example1;

public class EnemyRobotAdapter implements EnemyAttacker {
	
	private EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}

	@Override
	public String fireWeapon() {
		return this.enemyRobot.handAttack();
	}

	@Override
	public String driveForward() {
		return this.enemyRobot.walkForward();
	}

	@Override
	public String assignDriver(String driverName) {
		return this.enemyRobot.reactToHuman(driverName);
	}

}
