package Game.Entities;

import java.awt.*;

/**
 * Created by cerebro on 12/09/16.
 */
abstract public class Entity {
    public int x;
    public int y;
    public int xVel = 0;
    public int yVel = 0;
    public int xAcc = 0;
    public int yAcc = 0;
    private Rectangle rect;
    public boolean isHidden;

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;

        this.rect = new Rectangle();
        this.isHidden = false;
    }

    public void update() {
        this.xVel += this.xAcc;
        this.yVel += this.yAcc;
        this.x += this.xVel;
        this.y += this.yVel;
    }

    public boolean isColliding(Entity otherEntity) {
        if(this.isHidden || otherEntity.isHidden) {
            return false;
        }
        this.refreshRectPosition();
        otherEntity.refreshRectPosition();

        return this.rect.intersects(otherEntity.rect);
    }

    private void refreshRectPosition() {
        this.rect.setBounds(this.x, this.y, this.getWidth(), this.getHeight());
    }

    abstract public Image getImage();
    abstract public int getWidth();
    abstract public int getHeight();
}
