package ExceptionsDemo;

import java.util.Random;

/**
 * Created by cerebro on 26/08/16.
 */
public class Demo {


    public static void main(String[] args) {
        Demo.transferMoney(99911, 10000);
        try {
            Demo.moneyReceived(99911, "prashant");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Random random = new Random();
    int i = random.nextInt(10);

    public static void transferMoney(int acccountNum, int amount) throws Exception {
        //check if user has enough money
        //check if sender accountNum is valid
        // generate OTP

        try {
            Interaction.sendSms("+919988112233", "Your OTP is 123456");
        } catch (InvalidNumberExcection e) {
            System.out.println("Bhaiya ji please check your number");
            throw e;
        } catch (LowBalanceException e) {

        } catch (Exception e) {

        } finally {

        }

        System.out.println("hhgfjrjyd");
    }

    public static void moneyReceived(int amount, String sender) throws Exception {
//        credit the amount into user's account.

        Interaction.sendSms("+918888888888", "You just received " + amount + " from " + sender);
    }
}
