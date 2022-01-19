package draw.tool.stamp;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.lang.annotation.Annotation;

public class CircleStamp implements DrawTool{

    public DrawTool init(){
        return this;
    }

    public void mouseClicked(MouseEvent e, Graphics graphics) {}

    public void mousePressed(MouseEvent e, Graphics graphics) {}

    public void mouseReleased(MouseEvent e, Graphics graphics) {
       graphics.fillOval(e.getX()-25,e.getY()-25,50,50);
    }

    public void mouseEntered(MouseEvent e, Graphics graphics) {}

    public void mouseExited(MouseEvent e, Graphics graphics) {}

    public void mouseDragged(MouseEvent e, Graphics graphics) {}

    public void mouseMoved(MouseEvent e, Graphics graphics) {}
}
