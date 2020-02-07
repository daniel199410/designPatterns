package structural.flyweight;

public enum BulletType {
    PISTOL_BULLET("MG 45 Bullet"),
    SHOTGUN_BULLET("Cooey 84 Bullet"),
    SNIPER_BULLET("M 14 Bullet")
    ;

    private String name;

    BulletType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
