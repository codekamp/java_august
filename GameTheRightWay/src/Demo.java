import com.sun.org.apache.bcel.internal.classfile.Code;

import javax.swing.*;

/**
 * Created by cerebro on 02/09/16.
 */
public class Demo {
    public static void main(String[] args) {
        CodeKampFrame frame = new CodeKampFrame();
        frame.setVisible(true);

        CodeKampFrame frame1 = new CodeKampFrame("The Game Window 2");
        frame1.setVisible(true);


    }
}
