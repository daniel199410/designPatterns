package structural.adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRobotTest {
	
	private EnemyRobotAdapter enemyRobotAdapter;
	
	@Before
	public void setUp() {
		enemyRobotAdapter = new EnemyRobotAdapter(new EnemyRobot());
    }
	
	@Test
	public void robot_fires() {
		assertEquals("Robot attacks", enemyRobotAdapter.fireWeapon());
	}
	
	@Test
	public void robot_walks() {
		assertEquals("Robot walks forward", enemyRobotAdapter.driveForward());
	}
}
