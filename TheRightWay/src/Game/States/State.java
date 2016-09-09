package Game.States;

import Game.GamePanel;

import java.awt.*;

/**
 * Created by cerebro on 09/09/16.
 */
abstract public class State {

    public abstract void update();
    public abstract void render(Graphics g);
    public abstract void keyPressed(int keyCode);
}
