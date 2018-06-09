package sprayclip.states;

import java.awt.Color;
import java.awt.Graphics;
import static java.awt.SystemColor.menu;
import sprayclip.gfx.GUI;
import sprayclip.gfx.UIObject;

public class MenuState extends State {

    GUI gui;
    UIObject title = new UIObject("Money Managment Software", handler.getWidth() / 2, handler.getHeight() / 10, true, Color.white, Color.white, GUI.font50);

    
    public MenuState(Handler handler) {
        super(handler);
        gui = new GUI(handler);
        GUI.currentGUI = gui;
        addText(gui, title);
    }

    @Override
    public void tick() {
        gui.tick();
    }

    @Override
    public void render(Graphics g) {
        gui.render(g);
    }

}
