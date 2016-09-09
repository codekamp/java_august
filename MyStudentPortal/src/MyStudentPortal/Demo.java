package MyStudentPortal;

/**
 * Created by cerebro on 04/09/16.
 */
public class Demo {
    public static void main(String[] abcd) {
        System.out.println("hello world!");



        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student a = new Student();
        Student b = new Student();

        Student.profession = "Avara gardi";

        student1.name = "Suresh";
        student1.age = 21;
        student1.phoneNumber = "+911111111111";
        student1.email = "suresh@gmail.com";

        student2.name = "Ramesh";
        student2.age = 24;
        student2.phoneNumber = "+918888888888";
        student2.email = "ramesh@gmail.com";

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(Student.profession);
        System.out.println(Student.profession);


        abcd = "Hello";
        abcd = "World!";

        System.out.println(abcd);
        System.out.println(abcd);
    }
}
