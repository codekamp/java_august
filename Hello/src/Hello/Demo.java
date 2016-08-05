package Hello;

/**
 * Created by cerebro on 05/08/16.
 */


public class Demo {

    public static void main(String[] args) {
        System.out.println("welcome to CodeKamp");

        Demo.speak();
        Cat.speak();

        System.out.println(Cat.averageAge);
    }

    public static void speak() {
        System.out.println("Demo Demo");

        Demo var1;
    }

    public static int averageAge = 30;
}