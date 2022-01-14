package draw;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintPanelListener implements MouseInputListener {

    private final JPanel paintPanel;

    private static final int OVAL_SIZE = 5;

    public PaintPanelListener(JPanel paintPanel){
        this.paintPanel = paintPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics graphics = paintPanel.getGraphics();
        graphics.fillOval(e.getX(), e.getY(),OVAL_SIZE,OVAL_SIZE);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
