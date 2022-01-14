package draw.tool.basic;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;

public class BasicPen implements DrawTool {
    
    private static final int OVAL_SIZE = 5;

    public void mouseClicked(MouseEvent e, Graphics graphics) {}

    public void mousePressed(MouseEvent e, Graphics graphics) {}

    public void mouseReleased(MouseEvent e, Graphics graphics) {}

    public void mouseEntered(MouseEvent e, Graphics graphics) {}

    public void mouseExited(MouseEvent e, Graphics graphics) {}

    public void mouseDragged(MouseEvent e, Graphics graphics) {
        graphics.fillOval(e.getX(), e.getY(),OVAL_SIZE,OVAL_SIZE);
    }

    public void mouseMoved(MouseEvent e, Graphics graphics) {}
}
