package thickness;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ThicknessItemListener implements ItemListener {

    private float thickness;

    public ThicknessItemListener(){
        this.thickness = 1;
    }

    public void changeThickness(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        graphics2D.setStroke(new BasicStroke(thickness));
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ThicknessSelectItem selectItem = (ThicknessSelectItem) e.getItem();
        thickness = selectItem.thickness;
    }


}
