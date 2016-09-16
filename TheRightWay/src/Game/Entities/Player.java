package Game.Entities;

import Game.GamePanel;
import Game.Resources;

import java.awt.*;

/**
 * Created by cerebro on 14/09/16.
 */
public class Player extends Entity {

    private static Image[] images = {
            Resources.player1Image,
            Resources.player2Image,
            Resources.player3Image,
            Resources.player4Image,
            Resources.player5Image,
            Resources.player4Image,
            Resources.player3Image,
            Resources.player2Image};

    private int imageIndex;

    private static final int GROUND_Y_CORD = 315;

    public Player() {
        super(400, GROUND_Y_CORD);
    }

    @Override
    public Image getImage() {
        if(this.y < GROUND_Y_CORD) {
            return Resources.playerJumpImage;
        }
        return Player.images[this.imageIndex];
    }

    @Override
    public void update() {
        super.update();

        this.imageIndex++;
        this.imageIndex = this.imageIndex % 8;

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
            this.yAcc = 2;
        }
    }
}
