package Main;

/**
 * Created by cerebro on 09/09/16.
 */
public class Student {

    public String name;
    public String email;
    public int age;
    public String hometown;

    public static String profession;
    public static int averageAge;

    public void introduceYourself() {
        System.out.println("name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
