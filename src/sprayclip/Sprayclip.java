package sprayclip;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Sprayclip {

    static Main main;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static int width = (int) screenSize.getWidth();
    static int height = (int) screenSize.getHeight();

    public static void main(String[] args) {
        if (width >= 1800 && height >= 1000) {
            main = new Main("Stuff", 1600, 900);
            main.start();
        } else if (width < 1600 && height < 900) {
            main = new Main("Stuff", 1024, 576);
            main.start();
        } else {
            main = new Main("Stuff", 1280, 720);
            main.start();
        }
    }

}
