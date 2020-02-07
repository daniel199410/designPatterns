package structural.flyweight;

import java.util.List;

public abstract class Gun {
    protected Bullet[] bullets;
    protected int capacity;
    private final BulletType bulletType;

    public Gun(int capacity, BulletType bulletType) {
        this.capacity = capacity;
        this.bulletType = bulletType;
        this.bullets = new Bullet[capacity];
    }

    public abstract List<String> shoot();

    public void loadBullets() {
        for(int i = 0; i < capacity; i++) {
            this.bullets[i] = BulletFactory.getBulletFromCache(this.bulletType);
        }
    }

    public void loadUnCachedBullets() {
        for(int i = 0; i < capacity; i++) {
            this.bullets[i] = BulletFactory.getBulletByType(this.bulletType);
        }
    }
}
