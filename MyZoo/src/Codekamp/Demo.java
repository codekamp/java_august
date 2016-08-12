package Codekamp;

import java.util.Random;

/**
 * Created by cerebro on 12/08/16.
 */
public class Demo {
    public static void main(String[] args) {


        Cat myCat = new Cat();
        myCat.name = "Hilary";


        myCat.speak();
        myCat.walk();

        Dog myDog = new Dog();
        myDog.name = "Donald";

        myDog.speak();
        myDog.walk();
        myDog.chaseTail();

        Animal animal1;

        Random random = new Random();
        int i = random.nextInt(3);


        if(i == 0) {
            animal1 = new Dog();
        } else if (i == 1) {
            animal1 = new Cat();
        } else {
            animal1 = new Elephant();
        }

        animal1.name = "Mahisasur";

        animal1.walk();
    }
}
