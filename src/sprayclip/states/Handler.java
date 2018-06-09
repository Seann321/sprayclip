package sprayclip.states;

import java.awt.image.BufferStrategy;
import sprayclip.Main;
import sprayclip.gfx.GUI;

public class Handler {

    private Main main;

    public Handler(Main main) {
        this.main = main;
    }

    public GUI getCurrentGUI() {
        return GUI.currentGUI;
    }

    public State getCurrentState() {
        return State.currentState;
    }

    public int getHeight() {
        return main.getHeight();
    }

    public int getWidth() {
        return main.getWidth();
    }

    public void setHeight(int x) {
        main.setHeight(x);
    }

    public void setWidth(int x) {
        main.setWidth(x);
    }

    public BufferStrategy getBS() {
        return main.getBs();
    }

    public void setBS(BufferStrategy bs) {
        main.setBs(bs);
    }

}
