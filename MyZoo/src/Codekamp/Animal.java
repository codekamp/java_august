package Codekamp;

/**
 * Created by cerebro on 12/08/16.
 */
public class Animal implements Educated {

    public String name;

    public void walk() {

        System.out.println("animal animal");
    }

    public void talk() {
        System.out.println("talking animal");
    }

    public void read() {
        System.out.println("read read read");
    }

    @Override
    public void write() {
        System.out.println("write write write");
    }

}
