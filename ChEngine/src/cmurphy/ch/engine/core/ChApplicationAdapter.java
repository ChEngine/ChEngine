package cmurphy.ch.engine.core;

import java.awt.Graphics;
import java.awt.event.WindowEvent;

import cmurphy.ch.engine.util.ChGraphics;

public class ChApplicationAdapter extends ChApplication {
    
    protected ChApplicationAdapter() {
        super();
    }

    private static final long serialVersionUID = 1L;
    
    @Override
    /**
     * ChApplication.init() is called immediately after ChApplication.start() and may be
     * used to set ChApplication.Flag.visible to true (the field is false by default) or
     * load resources. The main application thread is started after this method returns.
     */
    protected void init() {}

    @Override
    protected void update() {}

    @Override
    /**
     * Note: Can make direct use of ChGraphics.pixels, type int[], which will
     * be used to create the next BufferedImage after this method returns.
     */
    protected void render(ChGraphics g) {}

    @Override
    protected void draw(Graphics g) {}

    // WindowListener
    public void windowClosed(WindowEvent e) {
    }
    public void windowClosing(WindowEvent e) {
    }
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
