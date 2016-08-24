package Multiwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/08/16.
 */
public class Demo implements ActionListener {
    public JLabel label;
    public JButton changeColorButton;
    public JButton newWindowButton;
    public Demo[] childWindows = new Demo[20];

    public static void main(String[] args) {

        Demo.createNewWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.newWindowButton) {
            Demo.createNewWindow();
        } else {
            this.label.setForeground(Color.red);
        }
    }

    public static void createNewWindow() {
        JFrame frame = new JFrame();
        frame.setSize(600,400);


        JPanel panel = new JPanel();
        frame.add(panel);
        Demo demo1 = new Demo();

        demo1.label = new JLabel();
        demo1.label.setText("Hello world!");
        panel.add(demo1.label);


        demo1.changeColorButton = new JButton();
        demo1.changeColorButton.setText("change color");

        demo1.newWindowButton = new JButton();
        demo1.newWindowButton.setText("new window");


        demo1.changeColorButton.addActionListener(demo1);
        demo1.newWindowButton.addActionListener(demo1);

        panel.add(demo1.changeColorButton);
        panel.add(demo1.newWindowButton);


        frame.setVisible(true);
    }
}
