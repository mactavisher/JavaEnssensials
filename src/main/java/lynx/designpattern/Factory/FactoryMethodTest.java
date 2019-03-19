package lynx.designpattern.Factory;


/**
 * runs a simple test
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        WeaponFactoryInterface M4A1Factory = new M4A1Factory();
        WeaponFactoryInterface AK47Factory = new AK47Factory();
        SimpleWeapon M4A1 = M4A1Factory.getWeapon();
        SimpleWeapon AK47 = AK47Factory.getWeapon();
        M4A1.openFire();
        AK47.openFire();
    }
}

/**
 * weapon factory interface, define the duty of this interface is to create weapon,
 * each class implemented this interface has it's own specific type of weapon to create
 */
interface WeaponFactoryInterface {

    public void createWeapon();

    public SimpleWeapon getWeapon();
}

/**
 * factory to create M4A1
 */
class M4A1Factory implements WeaponFactoryInterface {

    private SimpleWeapon M4A1;

    public void createWeapon() {
        M4A1 = new M4A1();
    }

    public SimpleWeapon getWeapon() {
        createWeapon();
        return M4A1;
    }

}

/**
 * factory to create AK47
 */
class AK47Factory implements WeaponFactoryInterface {

    private SimpleWeapon AK47;

    public void createWeapon() {
        AK47 = new AK47();
    }

    public SimpleWeapon getWeapon() {
        createWeapon();
        return AK47;
    }
}