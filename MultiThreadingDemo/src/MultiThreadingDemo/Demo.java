package MultiThreadingDemo;

/**
 * Created by cerebro on 07/09/16.
 */
public class Demo implements Runnable {

    public static int abcd = 10;

    public static void main(String[] args) {

        Demo demo = new Demo();
        Thread thread2 = new Thread(demo);
        thread2.setName("naya majdoor");
        thread2.start();

        Demo.countPakistanis();
    }

    synchronized public static void countIndians() {
        System.out.println(Demo.abcd);

        for (int i = 1; i <= 200; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Indian " + i + " " + Thread.currentThread().getName());
        }
    }

    public static void countPakistanis() {
        Demo.abcd++;
        System.out.println("Incremented");

        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pakistani " + i + " " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Demo.countIndians();
    }
}
