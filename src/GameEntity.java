public class GameEntity {
    private int health, damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String printInfo() {
        return "Health: " + this.health + " Damage: " + this.damage;
    }
}
