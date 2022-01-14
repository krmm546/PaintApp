package draw.tool.basic;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;

public class BasicPen implements DrawTool {

    private int x;
    private int y;



    public BasicPen(){
        initializePosition();
    }

    public DrawTool init(){
        initializePosition();
        return this;
    }

    private static final int initialPosition = -1;

    private boolean isFirst(){
        return x == initialPosition || y == initialPosition;
    }

    private void initializePosition(){
        setPosition(initialPosition, initialPosition);
    }

    private void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void mouseClicked(MouseEvent e, Graphics graphics) {}

    public void mousePressed(MouseEvent e, Graphics graphics) {}

    public void mouseReleased(MouseEvent e, Graphics graphics) {
        initializePosition();
    }

    public void mouseEntered(MouseEvent e, Graphics graphics) {}

    public void mouseExited(MouseEvent e, Graphics graphics) {}

    public void mouseDragged(MouseEvent e, Graphics graphics) {
        if(isFirst()){
            setPosition(e.getX(),e.getY());
            return;
        }
        graphics.drawLine(x,y, e.getX(), e.getY());
        initializePosition();
        setPosition(e.getX(), e.getY());
    }

    public void mouseMoved(MouseEvent e, Graphics graphics) {}
}
