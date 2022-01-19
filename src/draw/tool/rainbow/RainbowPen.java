package draw.tool.rainbow;

import draw.tool.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;

public class RainbowPen implements DrawTool{

    private  final DrawTool basicPen;
    private int index;

    private static final Color[] rainbowColors = {
            new Color(255, 0, 0),
            new Color(255, 40, 0),
            new Color(255, 80, 0),
            new Color(255, 120, 0),
            new Color(255, 160, 0),
            new Color(255, 200, 0),
            new Color(255, 240, 0),
            new Color(215, 240, 0),
            new Color(150, 200, 0),
            new Color(100, 200, 0),
            new Color(50, 180, 0),
            new Color(0, 135, 0),
            new Color(0, 145, 80),
            new Color(0, 145, 120),
            new Color(0, 145, 200),
            new Color(0, 145, 255),
            new Color(0, 120, 220),
            new Color(0, 110, 190),
            new Color(70, 0, 160),
            new Color(140, 0, 130),

    };

    public RainbowPen(DrawTool basicPen){
        this.basicPen = basicPen;
    }

    public DrawTool init() {
        basicPen.init();
        index = 0;
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
        increment();
    }

    public void mouseMoved(MouseEvent e, Graphics graphics) {
        setColor(graphics);
        basicPen.mouseMoved(e, graphics);
    }

    private void setColor(Graphics graphics){
        graphics.setColor(rainbowColors[index]);
    }

    private void increment(){
        index++;
        if(index == rainbowColors.length){
            index = 0;
        }
    }
}
