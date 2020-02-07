package structural.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShotGun extends Gun {
    public ShotGun(int capacity, BulletType bulletType) {
        super(capacity, bulletType);
    }

    @Override
    public List<String> shoot() {
        return Arrays.stream(this.bullets).map(Object::toString).collect(Collectors.toList());
    }
}
