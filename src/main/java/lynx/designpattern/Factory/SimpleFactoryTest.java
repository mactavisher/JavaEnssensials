package lynx.designpattern.Factory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleWeapon weapon1 = WeaponFactory.getWeapon("AK47");
        weapon1.openFire();
        SimpleWeapon weapon2 = WeaponFactory.getWeapon("M4A1");
        weapon2.openFire();
    }
}


/**
 * test abstract simple weapon class
 */
abstract class SimpleWeapon {

    protected String weaponName;

    protected String AmmoType;

    public String getWeaponName() {
        return this.weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getAmmoType() {
        return AmmoType;
    }

    public void setAmmoType(String ammoType) {
        AmmoType = ammoType;
    }

    public void openFire() {
        System.out.println("Weapon Firing!");
    }
}


/**
 * test M4A1 inherited from simple weapon class
 */
class M4A1 extends SimpleWeapon {

    @Override
    public void setWeaponName(String weaponName) {
        super.setWeaponName("M4A1");
    }

    @Override
    public void setAmmoType(String ammoType) {
        super.setAmmoType("5.56mm");
    }

    @Override
    public void openFire() {
        super.openFire();
        System.out.println("M4A1 dadada");
    }
}

/**
 * test M4A1 inherited from simple weapon class
 */
class AK47 extends SimpleWeapon {

    @Override
    public void setWeaponName(String weaponName) {
        super.setWeaponName("AK47");
    }

    @Override
    public void setAmmoType(String ammoType) {
        super.setAmmoType("7.56mm");
    }

    @Override
    public void openFire() {
        super.openFire();
        System.out.println("AK47 peng peng peng");
    }
}

/**
 * test weapon factory to produce all kinds of weapons,
 * this factory simply just produce all kinds of weapon by passing weapon
 * names
 */
class WeaponFactory {

    private static SimpleWeapon weapon = null;

    public static void createWeapon(String weaponName) {
        if ("M4A1".equals(weaponName)) {
            weapon = new M4A1();
        }
        if ("AK47".equals(weaponName)) {
            weapon = new AK47();
        }
    }

    public static SimpleWeapon getWeapon(String weaponName) {
        createWeapon(weaponName);
        return weapon;
    }
}
