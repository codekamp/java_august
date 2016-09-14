package Game.Entities;

import Game.GamePanel;
import Game.Resources;

import java.awt.*;

/**
 * Created by cerebro on 14/09/16.
 */
public class Player extends Entity {

    private static final int GROUND_Y_CORD = 315;

    public Player() {
        super(400, GROUND_Y_CORD);
    }

    @Override
    public Image getImage() {
        return Resources.playerImage;
    }

    @Override
    public void update() {
        super.update();

        if(this.y >= GROUND_Y_CORD) {
            this.y = GROUND_Y_CORD;
            this.yVel = 0;
            this.yAcc = 0;
        }

        if(this.x < -10) {
//            GamePanel.currentState = new GameOverState();
        }
    }

    @Override
    public int getWidth() {
        return 72;
    }

    @Override
    public int getHeight() {
        return 90;
    }

    public void jump() {
        if(this.y == GROUND_Y_CORD) {
            this.yVel = -20;
            this.yAcc = 1;
        }
    }
}
