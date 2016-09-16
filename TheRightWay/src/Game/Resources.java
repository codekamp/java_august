package Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 09/09/16.
 */
public class Resources {

    private Resources() {}

    public static Image grassImage;
    public static Image blockImage;
    public static Image player1Image;
    public static Image player2Image;
    public static Image player3Image;
    public static Image player4Image;
    public static Image player5Image;
    public static Image playerJumpImage;
    public static Image welcomeImage;
    public static Image selectorImage;
    public static Color backgroundColor;
    public static AudioClip jump;
    public static AudioClip hit;

    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getResource("images/grass.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getResource("images/block.png"));
            Resources.player1Image = ImageIO.read(Resources.class.getResource("images/run_anim1.png"));
            Resources.player2Image = ImageIO.read(Resources.class.getResource("images/run_anim2.png"));
            Resources.player3Image = ImageIO.read(Resources.class.getResource("images/run_anim3.png"));
            Resources.player4Image = ImageIO.read(Resources.class.getResource("images/run_anim4.png"));
            Resources.player5Image = ImageIO.read(Resources.class.getResource("images/run_anim5.png"));
            Resources.playerJumpImage = ImageIO.read(Resources.class.getResource("images/jump.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getResource("images/welcome.png"));
            Resources.selectorImage = ImageIO.read(Resources.class.getResource("images/selector.png"));
            Resources.backgroundColor = new Color(82, 167, 255);

            Resources.jump = Applet.newAudioClip(Resources.class.getResource("audios/onjump.wav"));
            Resources.hit = Applet.newAudioClip(Resources.class.getResource("audios/hit.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void unload() {
        Resources.grassImage = null;
        Resources.blockImage = null;

        System.gc();
    }
}
