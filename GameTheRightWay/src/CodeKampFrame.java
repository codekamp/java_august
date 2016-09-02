import javax.swing.*;

/**
 * Created by cerebro on 02/09/16.
 */
public class CodeKampFrame extends JFrame {

    public CodeKampFrame(String title) {
        this(title, 450);
    }

    public CodeKampFrame(String title, int height) {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(800, height);
    }
}
