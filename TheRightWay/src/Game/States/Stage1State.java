package Game.States;

import Game.Entities.Block;
import Game.Entities.Entity;
import Game.Entities.Player;
import Game.GamePanel;
import Game.Resources;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Created by cerebro on 09/09/16.
 */
public class Stage1State extends State {

    private int score;

    List<Block> blocks;
    List<Entity> entities;
    Player player;

    public Stage1State() {
        this.entities = new ArrayList<>();
        this.blocks = new ArrayList<>();

        this.blocks.add(new Block(850));
        this.blocks.add(new Block(1050));
        this.blocks.add(new Block(1250));
        this.blocks.add(new Block(1450));
        this.blocks.add(new Block(1650));
        this.player = new Player();
        this.score = 0;

        this.entities.addAll(this.blocks);
        this.entities.add(this.player);

    }


    @Override
    public void update() {
        for (int i = 0; i < this.entities.size(); i++) {
            this.entities.get(i).update();
        }

        //checking player collision with blocks
        for (int i = 0; i < this.blocks.size(); i++) {
            Block block = this.blocks.get(i);
            if (player.isColliding(block)) {
                block.isHidden = true;
                Resources.hit.play();
                player.x -= 10;
            }
        }



    }

    @Override
    public void render(Graphics g) {

        g.setColor(Resources.backgroundColor);
        g.fillRect(0, 0, GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT);
        g.drawImage(Resources.grassImage, 0, 405, null);

        for (int i = 0; i < this.entities.size(); i++) {
            Entity entity = this.entities.get(i);
            if (!entity.isHidden) {
                g.drawImage(entity.getImage(), entity.x, entity.y, null);
            }
        }
    }

    @Override
    public void keyPressed(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            this.player.jump();
        }
    }
}
