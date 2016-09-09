package Game.States;

import Game.GamePanel;
import Game.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 09/09/16.
 */
public class MenuState extends State {


    private int currentSelection = 0;
    private int selectorYCord;

    @Override
    public void update() {
        if (currentSelection == 0) {
            selectorYCord = 241;
        } else {
            selectorYCord = 291;
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.welcomeImage, 0, 0, null);
        g.drawImage(Resources.selectorImage, 335, selectorYCord, null);
    }

    @Override
    public void keyPressed(int keyCode) {
        if(keyCode == KeyEvent.VK_UP) {
            currentSelection = 0;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            currentSelection = 1;
        } else if (keyCode == KeyEvent.VK_ENTER) {

            if(currentSelection == 0) {
                GamePanel.currentState = new Stage1State();
            }

        }
    }
}
