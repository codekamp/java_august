package Multiwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/08/16.
 */
public class Demo implements ActionListener {
    public static JLabel label;
    public static JButton button1;
    public static JButton button2;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400,400);


        JPanel panel = new JPanel();
        frame.add(panel);


        Demo.label = new JLabel();
        label.setText("Hello world!");
        panel.add(Demo.label);



        Demo.button1 = new JButton();
        Demo.button1.setText("change color");

        Demo.button2 = new JButton();
        Demo.button2.setText("new window");

        Demo demo = new Demo();
        Demo.button1.addActionListener(demo);
        Demo.button2.addActionListener(demo);

        panel.add(Demo.button1);
        panel.add(Demo.button2);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.button1) {
            Demo.label.setForeground(Color.red);
        } else {
            System.out.println("new window button clicked");
        }
    }
}
