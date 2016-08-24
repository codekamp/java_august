package Animation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 24/08/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        Dimension dimension = new Dimension();
        dimension.setSize(500, 650);
        panel.setPreferredSize(dimension);
        frame.add(panel);
        frame.pack();

        frame.setVisible(true);


        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Graphics graphics;

        int x = 0;
        int y = 0;
        int xVel = 10;
        int yVel = 10;

        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x = x + xVel;
            y = y + yVel;

            if(x >= 400) {
                x = 400;
                xVel = -10;
            }

            if (y >= 550) {
                y = 550;
                yVel = -10;
            }

            if (x <= 0) {
                x = 0;
                xVel = 10;
            }

            if (y <= 0) {
                y = 0;
                yVel = 10;
            }


            graphics = panel.getGraphics();
            graphics.clearRect(0,0,500,650);
            graphics.setColor(Color.green);
            graphics.fillOval(x, y, 100, 100);
            graphics.dispose();
        }


    }
}
