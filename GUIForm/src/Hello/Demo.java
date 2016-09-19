package Hello;

import javax.swing.*;

/**
 * Created by cerebro on 19/09/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();

        //create JPanel and add it to JFrame and then add elements to JPanel.

        LoginForm form = new LoginForm();
        frame.add(form.mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
}
