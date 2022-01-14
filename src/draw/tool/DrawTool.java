package draw.tool;

import java.awt.*;
import java.awt.event.MouseEvent;

public interface DrawTool {

    DrawTool init();

    void mouseClicked(MouseEvent e, Graphics graphics);

    void mousePressed(MouseEvent e, Graphics graphics);

    void mouseReleased(MouseEvent e, Graphics graphics);

    void mouseEntered(MouseEvent e, Graphics graphics);

    void mouseExited(MouseEvent e, Graphics graphics);

    void mouseDragged(MouseEvent e, Graphics graphics);

    void mouseMoved(MouseEvent e, Graphics graphics);
}
