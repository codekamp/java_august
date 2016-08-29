package FirstGame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

/**
 * Created by cerebro on 29/08/16.
 */
public class Demo implements KeyListener {

    private static int playerYCord = 315;
    private static int playerYVel = 0;
    private static int playerYAcc = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        panel.setFocusable(true);
        frame.add(panel);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);


        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }


        panel.requestFocus();
        panel.addKeyListener(new Demo());

        Image grassImage = null;
        Image pi1 = null;
        Image pi2 = null;
        Image pi3 = null;
        Image pi4 = null;
        Image pi5 = null;
        Image blockImage = null;
        try {
            grassImage = ImageIO.read(Demo.class.getResource("images/grass.png"));
            pi1 = ImageIO.read(Demo.class.getResource("images/run_anim1.png"));
            pi2 = ImageIO.read(Demo.class.getResource("images/run_anim2.png"));
            pi3 = ImageIO.read(Demo.class.getResource("images/run_anim3.png"));
            pi4 = ImageIO.read(Demo.class.getResource("images/run_anim4.png"));
            pi5 = ImageIO.read(Demo.class.getResource("images/run_anim5.png"));
            blockImage = ImageIO.read(Demo.class.getResource("images/block.png"));
        } catch (IOException e) {
            //show user a error popup and exit the game.
            return;
        }


        Image[] playerImages = {pi1, pi2, pi3, pi4, pi5, pi4, pi3, pi2};

        int i = 0;
        int blockXCord = 700;
        int blockYCord = 355;
        Random random = new Random();

        while (true) {

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
            i = i % 8;

            blockXCord -= 5;
            if(blockXCord <= -20) {
                blockXCord = 820;

                int position = random.nextInt(2);

                if(position == 0) {
                    blockYCord = 355;
                } else {
                    blockYCord = 275;
                }
            }

            Demo.playerYVel += Demo.playerYAcc;
            Demo.playerYCord += Demo.playerYVel;

            if(Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }

            Graphics graphics = panel.getGraphics();
            graphics.clearRect(0,0,800,450);

            graphics.setColor(new Color(208, 244, 247));
            graphics.fillRect(0, 0, 800, 450);

            graphics.drawImage(grassImage, 0, 405, null);
            graphics.drawImage(playerImages[i], 400, Demo.playerYCord, null);
            graphics.drawImage(blockImage, blockXCord, blockYCord, null);

            graphics.dispose();
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -20;
            Demo.playerYAcc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Do nothing
    }
}
