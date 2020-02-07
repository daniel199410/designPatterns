package structural.flyweight;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlyweightTest {
    @Test
    public void shouldBeSameObjects() {
        Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadBullets();
        List<String> shoots = shotGun.shoot();
        assertEquals(1, shoots.stream().distinct().count());
    }

    @Test
    public void shouldBeDifferentObjects() {
        Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadUnCachedBullets();
        List<String> shoots = shotGun.shoot();
        assertEquals(8, shoots.stream().distinct().count());
    }
}
