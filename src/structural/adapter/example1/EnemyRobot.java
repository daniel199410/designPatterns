package structural.adapter.example1;

public class EnemyRobot {
	public String handAttack() {
		return "Robot attacks";
	}
	
	public String walkForward() {
		return "Robot walks forward";
	}
	
	public String reactToHuman(String human) {
		return String.format("Robot reacts to {}", human);
	}
}
