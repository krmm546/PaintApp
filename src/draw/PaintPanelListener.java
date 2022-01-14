package draw;

import color.ColorItemListener;
import draw.tool.DrawTool;
import draw.tool.PenItemListener;
import thickness.ThicknessItemListener;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintPanelListener implements MouseInputListener {

    private final JPanel paintPanel;
    private final ColorItemListener colorItemListener;
    private final PenItemListener penItemListener;
    private final ThicknessItemListener thicknessItemListener;

    public PaintPanelListener(
            JPanel paintPanel,
            ColorItemListener colorItemListener,
            PenItemListener penItemListener,
            ThicknessItemListener thicknessItemListener
    ) {
        this.paintPanel = paintPanel;
        this.colorItemListener = colorItemListener;
        this.penItemListener = penItemListener;
        this.thicknessItemListener = thicknessItemListener;
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
        thicknessItemListener.changeThickness(graphics);
        graphics.setColor(colorItemListener.getColor());
        return graphics;
    }

    private DrawTool drawTool() {
        return penItemListener.getPen();
    }
}
