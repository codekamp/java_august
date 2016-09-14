package Demo;


import java.util.Random;

/**
 * Created by cerebro on 10/09/16.
 */
public class Demo {

    public static void main(String[] args) {

    // In a variable of XYZ class we can store objects of XYZ class and it's subclasses

    // Whether the function call is allowed or not is decided by type of varialbe, not by type of object.
    // But at the runtime fuction is searched in Object class
        Animal animal1;

        Random random = new Random();

        int randomInt = random.nextInt(4);

        if(randomInt == 0) {
            animal1 = new Dog();
        } else if (randomInt == 1) {
            animal1 = new Cat();
        } else {
            animal1 = new Elephant();
        }





        animal1.jump();
        animal1.talk();


    }
}
