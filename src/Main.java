public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.PHYSICAL, "Sword");

        Weapon bow = new Weapon(WeaponType.PHYSICAL, "Bow");

        Boss boss = new Boss();
        createBoss(boss, sword, 800, 50);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        createSkeleton(skeleton1, bow, 800, 50, 100);
        Skeleton skeleton2 = new Skeleton();
        createSkeleton(skeleton2, bow, 900, 40, 80);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }

    private static void createSkeleton(Skeleton skeleton, Weapon weapon, int health, int damage, int quantityArrows) {
        skeleton.setHealth(health);
        skeleton.setDamage(damage);
        skeleton.setWeapon(weapon);
        skeleton.setQuantityArrows(quantityArrows);
    }

    public static void createBoss(Boss boss, Weapon weapon, int health, int damage){
        boss.setWeapon(weapon);
        boss.setHealth(health);
        boss.setDamage(damage);
    }
}