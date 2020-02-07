package structural.flyweight;

public final class Bullet {
    private final String bulletSize;
    private final String bulletWeight;

    public Bullet(String bulletSize, String bulletWeight) {
        this.bulletSize = bulletSize;
        this.bulletWeight = bulletWeight;
    }

    public String getBulletSize() {
        return bulletSize;
    }

    public String getBulletWeight() {
        return bulletWeight;
    }
}
