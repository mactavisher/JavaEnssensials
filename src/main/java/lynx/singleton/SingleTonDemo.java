package lynx.singleton;

/**
 * singleton test dome
 *
 * @author lynx
 */
public class SingleTonDemo {
  public static void main(String[] args) {

    /*********************************
     * Test Singleton hungry mode    *
     *********************************/
    SingleTonHungry hungryInstance1 = SingleTonHungry.GetInstance();
    SingleTonHungry hungryInstance2 = SingleTonHungry.GetInstance();
    hungryInstance1.doSomething();
    hungryInstance2.doSomething();
    System.out.println(hungryInstance1 == hungryInstance2);

    /*********************************
     * Test Singleton full mode      *
     *********************************/
    SingletonFull fullInstance1 = SingletonFull.getInstance();
    SingletonFull fullInstance2 = SingletonFull.getInstance();
    fullInstance1.doSomething();
    fullInstance2.doSomething();
    System.out.println(fullInstance1 == fullInstance2);
  }
}

/**
 * hungry singleton
 * Not Thread safe
 * @author lynx
 */
class SingleTonHungry {

  private SingleTonHungry() {
  } // //suppress default constructor so we can't create any instance from other class by calling new().

  private static final SingleTonHungry instance = new SingleTonHungry(); //create instance immediately after Initialize.

  public static SingleTonHungry GetInstance() {
    return instance;
  }

  //Test method
  public void doSomething() {
    System.out.println(" get instance from hungry mode");
  }
}

/**
 * full singleton
 * Not Thread safe
 * @author lynx
 */
class SingletonFull {

  private SingletonFull() {} //suppress default constructor

  private static SingletonFull instance = null;

  public static SingletonFull getInstance() {
    if (instance == null) {
      instance = new SingletonFull();
    }
    return instance;
  }

  //Test method
  public void doSomething() {
    System.out.println("get instance from full mode");
  }
}
