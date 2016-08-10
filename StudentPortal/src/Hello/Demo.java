package Hello;

/**
 * Created by cerebro on 10/08/16.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student1;

        Student student2;



        student1 = new Student(); // flat #1
        student2 = new Student(); // flat #2

        student1.name = "Ramesh";
        student1.age = 19;
        student1.email = "suresh@gmail.com";
        student1.branch = "CS";


        student2.name = "Suresh";
        student2.age = 21;
        student2.email = "suresh@gmail.com";
        student2.branch = "EC";

        Student student3 = student1;

        Student student4 = student3;



        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);



        student3.name = "Rahul Gandhi";


        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);


        student3 = new Student(); // flat #3
        student2 = new Student(); // flat #4

        student3.name = "Adolf Hitler";

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student3.name);

    }
}
