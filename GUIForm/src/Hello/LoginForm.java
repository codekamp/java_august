package Hello;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 19/09/16.
 */
public class LoginForm implements ActionListener {

    public LoginForm() {

        this.loginButton.addActionListener(this);
    }

    private JButton loginButton;
    public JPanel mainPanel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("username: " + this.usernameTextField.getText());
        System.out.println("password: " + this.passwordTextField.getText());
    }
}
