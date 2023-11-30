package JavaAdvanceCoding;
/* Create a class imitating a weapon magazine. The class should be able to define the size of the magazine
using the constructor. Implement the methods:
loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges
than the capacity of the magazine
isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and
prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
magazine" in the console */
public class Exercise7 {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(10);
        System.out.println(weapon.isLoaded());
        weapon.loadBullet("3");
        System.out.println(weapon.isLoaded());
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
    }
}

class Weapon {
    private int size;
    private int bulletAmount = 0;
    boolean loaded = false;

    public Weapon (int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (size < Integer.parseInt(bullet)) {
            System.out.println("Cannot load");
        } else {
            bulletAmount += Integer.parseInt(bullet);
        }
    }

    public boolean isLoaded() {
        System.out.println(bulletAmount);
        if (bulletAmount > 0) {
            return true;
        }
        return false;
    }

    public void shot() {
        if (bulletAmount == 0) {
            System.out.println("magazine is empty");
        } else {
            bulletAmount -= 1;
            System.out.println("bang");
        }
    }

}

