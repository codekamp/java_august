package Game.Entities;

import Game.Resources;
import Game.Util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 12/09/16.
 */
public class Block extends Entity {

    public static final int GROUND_Y_CORD = 355;
    public static final int UP_Y_CORD = 275;

    public Block(int x) {
        super(x, 0);
        this.xVel = -10;

        this.setYPosition();
    }


    @Override
    public void update() {
        super.update();

        if(this.x <= -20) {
            this.x = 980;

            this.setYPosition();
            this.isHidden = false;
        }
    }

    @Override
    public Image getImage() {

        return Resources.blockImage;
    }

    @Override
    public int getWidth() {
        return 20;
    }

    @Override
    public int getHeight() {
        return 50;
    }

    private void setYPosition() {
        if(Util.randomInt(2) == 0) {
            this.y = GROUND_Y_CORD;
        } else {
            this.y = UP_Y_CORD;
        }
    }


}
