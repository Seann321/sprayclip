package sprayclip;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Sprayclip {

    static Display display;
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static int width = (int) screenSize.getWidth();
    static int height = (int) screenSize.getHeight();

    public static void main(String[] args) {
        if (width >= 1800 && height >= 1000) {
            display = new Display("Stuff", 1600, 900);
        } else if (width < 1600 && height < 900) {
            display = new Display("Stuff", 1024, 576);
        } else {
            display = new Display("Stuff", 1280, 720);
        }
    }
    
}
