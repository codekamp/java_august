package Game;

import Game.States.MenuState;
import Game.States.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created by cerebro on 09/09/16.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable {

    public static State currentState;

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 450;

    public GamePanel() {
        super();

        this.setFocusable(true);
        this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        this.requestFocus();
        Resources.load();

        GamePanel.currentState = new MenuState();

        Thread gameThread = new Thread(this);
        gameThread.setName("Game Thread");
        gameThread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentState.keyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        Image mainImage = new BufferedImage(GAME_WIDTH, GAME_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics imageGraphics;
        Graphics panelGraphics;

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            GamePanel.currentState.update();

            imageGraphics = mainImage.getGraphics();
            imageGraphics.clearRect(0,0,GAME_WIDTH,GAME_HEIGHT);

            GamePanel.currentState.render(imageGraphics);

            imageGraphics.dispose();

            panelGraphics = this.getGraphics();
            panelGraphics.drawImage(mainImage, 0, 0, null);
            panelGraphics.dispose();
        }
    }
}
