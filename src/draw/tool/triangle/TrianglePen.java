package draw.tool.triangle;

import draw.tool.DrawTool;
import draw.tool.basic.BasicPen;

import java.awt.*;
import java.awt.event.MouseEvent;

public class TrianglePen implements DrawTool {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public TrianglePen init() {
        initializePosition();
        return this;
    }

    public TrianglePen(){
        initializePosition();
    }

    private static final int initialPosition = -1;

    private boolean isFirst(){
        return x1 == initialPosition || y1 == initialPosition;
    }

    private boolean isSecond(){
        return x2 == initialPosition || y2 == initialPosition;
    }

    private void initializePosition() {
        setFirstPosition(initialPosition, initialPosition);
        setSecondPosition(initialPosition, initialPosition);
    }

    private void setFirstPosition(int x, int y){
        x1 = x;
        y1 = y;
    }

    private void setSecondPosition(int x, int y){
        x2 = x;
        y2 = y;
    }

    public void mouseClicked(MouseEvent e, Graphics graphics) {}

    public void mousePressed(MouseEvent e, Graphics graphics) {}

    public void mouseReleased(MouseEvent e, Graphics graphics) {
        if(isFirst()){
            setFirstPosition(e.getX(), e.getY());
            return;
        }

        if(isSecond()){
            setSecondPosition(e.getX(), e.getY());
            graphics.drawLine(x1,y1, x2, y2);
            return;
        }

        graphics.drawLine(x1,y1, e.getX(), e.getY());
        graphics.drawLine(x2,y2, e.getX(), e.getY());
        initializePosition();
    }

    public void mouseEntered(MouseEvent e, Graphics graphics) {}

    public void mouseExited(MouseEvent e, Graphics graphics) {}

    public void mouseDragged(MouseEvent e, Graphics graphics) {}

    public void mouseMoved(MouseEvent e, Graphics graphics) {}

}
