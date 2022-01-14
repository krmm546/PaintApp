package draw;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintPanelListener implements MouseInputListener {

    private final JPanel paintPanel;

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
        graphics.fillOval(e.getX(), e.getY(),5,5);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
