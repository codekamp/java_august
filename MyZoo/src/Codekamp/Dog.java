package Codekamp;

/**
 * Created by cerebro on 12/08/16.
 */
public class Dog extends Animal {

    public void speak() {
        System.out.println(this.name + " saying wuff wuff!");
    }

    public void chaseTail() {
        System.out.println(this.name + " is chaising the tail");
    }
}
