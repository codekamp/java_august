package Game.States;

import Game.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 09/09/16.
 */
public class Stage1State extends State {


    private int blockXCord = 800;
    private int blockYCord = 300;

    @Override
    public void update() {

        blockXCord -= 5;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.blockImage, blockXCord, blockYCord, null);
    }

    @Override
    public void keyPressed(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            blockYCord = 200;
        }
    }
}
