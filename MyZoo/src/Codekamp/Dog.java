package Codekamp;

/**
 * Created by cerebro on 12/08/16.
 */
public class Dog extends Animal {

    public void speak() {

        System.out.println(this.name + " saying wuff wuff!");
    }

    public void walk() {
        System.out.println("dog dog");
    }

    public void chaseTail() {

        System.out.println(this.name + " is chaising the tail");
    }

    public void talk() {
        System.out.println("talking dog");
    }
}
