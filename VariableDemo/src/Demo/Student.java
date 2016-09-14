package Demo;

/**
 * Created by cerebro on 10/09/16.
 */
public class Student {
    public String name;
    public int age;

    public static String profession;

    public void sendEmail() {
        System.out.println("sending mail to parent's of " + this.name);
    }

    public void introduceYourself() {
        System.out.println("My name is " + this.name + " and my age is " + this.age);
    }

    public static void describeProfession() {
        System.out.println("My job is to Study");
    }
}
