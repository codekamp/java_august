package Codekamp;

import java.util.Random;

/**
 * Created by cerebro on 12/08/16.
 */
public class Demo implements Educated {

    public static Animal someAnimal;

    public static void main(String[] args) {



        Dog dog1 = new Dog();

        Demo.someAnimal = dog1;

        Demo.interview(dog1);



    }

    public static boolean interview(Educated candidate) {

        candidate.write();
        Demo.someAnimal.write();

        return false;
    }

    public void read() {
        System.out.println("demo read");
    }

    public void write() {
        System.out.println("demo write");
    }
}
