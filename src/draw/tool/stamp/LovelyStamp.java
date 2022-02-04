package draw.tool.stamp;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.lang.annotation.Annotation;

public class LovelyStamp implements DrawTool{

    public DrawTool init(){
        return this;
    }

    public void mouseClicked(MouseEvent e, Graphics graphics) {}

    public void mousePressed(MouseEvent e, Graphics graphics) {}

    public void mouseReleased(MouseEvent e, Graphics graphics) {
        graphics.fillPolygon(new int[] {e.getX()-47,e.getX()+47,e.getX()}, new int[] {e.getY()+13,e.getY()+13,e.getY()+70}, 3);
        graphics.fillOval(e.getX()-50,e.getY()-25,50,50);
        graphics.fillOval(e.getX(),e.getY()-25,50,50);
        graphics.fillOval(e.getX()-25,e.getY(),50,50);
    }

    public void mouseEntered(MouseEvent e, Graphics graphics) {}

    public void mouseExited(MouseEvent e, Graphics graphics) {}

    public void mouseDragged(MouseEvent e, Graphics graphics) {}

    public void mouseMoved(MouseEvent e, Graphics graphics) {}
}
