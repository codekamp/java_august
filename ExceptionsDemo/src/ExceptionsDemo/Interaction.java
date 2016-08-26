package ExceptionsDemo;

/**
 * Created by cerebro on 26/08/16.
 */
public class Interaction {

    private static boolean numberValid = false;
    private static boolean enoughBalance = false;

    public static void sendSms(String mobileNum, String message) throws Exception {

        //check if mobileNum is valid
        if(!numberValid) {
            InvalidNumberExcection exc = new InvalidNumberExcection();
            throw exc;
        }


        //check if enough balance in phone
        if(!enoughBalance) {
            LowBalanceException exception = new LowBalanceException();
            throw exception;
        }


        System.out.println("SMS sent: " + message);
    }
}
