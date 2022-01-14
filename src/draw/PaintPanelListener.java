package draw;

import color.ColorItemListener;
import draw.tool.DrawTool;
import draw.tool.basic.BasicPen;
import draw.tool.straightline.StraightLinePen;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintPanelListener implements MouseInputListener {

    private final JPanel paintPanel;
    private final ColorItemListener colorItemListener;

    public PaintPanelListener(JPanel paintPanel, ColorItemListener colorItemListener){
        this.paintPanel = paintPanel;
        this.colorItemListener = colorItemListener;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        drawTool().mouseClicked(e, graphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        drawTool().mousePressed(e, graphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        drawTool().mouseReleased(e, graphics());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        drawTool().mouseEntered(e, graphics());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        drawTool().mouseExited(e, graphics());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        drawTool().mouseDragged(e, graphics());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        drawTool().mouseMoved(e, graphics());
    }

    private Graphics graphics(){
        Graphics graphics = paintPanel.getGraphics();
        graphics.setColor(colorItemListener.getColor());
        return graphics;
    }

    private DrawTool drawTool() {
        return pen;
    }

    // 削除予定
    private StraightLinePen pen = new StraightLinePen();
}
