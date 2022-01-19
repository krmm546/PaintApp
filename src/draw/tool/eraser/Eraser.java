package draw.tool.eraser;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Eraser implements DrawTool {

    private final Color backgroundColor;
    private  final DrawTool basicPen;

    public Eraser(Color backgroundColor, DrawTool basicPen){
        this.backgroundColor = backgroundColor;
        this.basicPen = basicPen;
    }

    public DrawTool init() {
        basicPen.init();
        return this;
    }

    public void mouseClicked(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseClicked(e, graphics);
    }

    public void mousePressed(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mousePressed(e, graphics);
    }

    public void mouseReleased(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseReleased(e, graphics);
    }

    public void mouseEntered(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseEntered(e, graphics);
    }

    public void mouseExited(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseExited(e, graphics);
    }

    public void mouseDragged(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseDragged(e, graphics);
    }

    public void mouseMoved(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseMoved(e, graphics);
    }

    private void setColor(Graphics graphics){
        graphics.setColor(backgroundColor);
    }

}
