package GUIDemo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/08/16.
 */
public class Demo implements ActionListener {

    public static JTextField usernameField;
    public static JTextField passwordField;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400,400);


        JPanel panel = new JPanel();
        frame.add(panel);



        Demo.usernameField = new JTextField();
        Demo.usernameField.setText("username here");
        panel.add(Demo.usernameField);

        Demo.passwordField = new JTextField();
        Demo.passwordField.setText("password here");
        panel.add(Demo.passwordField);

        JButton button = new JButton();
        button.setText("Login");
        button.setForeground(Color.red);

        Demo demo = new Demo();
        button.addActionListener(demo);

        panel.add(button);


        frame.setVisible(true);
    }

    public static void buttonClicked() {
        System.out.println("login button clicked");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String username = Demo.usernameField.getText();
        String password = Demo.passwordField.getText();
        System.out.println("username: " + username + ", password: " + password);
    }
}
