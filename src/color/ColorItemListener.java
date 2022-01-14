package color;

import menubar.ItemEvent;
import menubar.ItemListener;

import java.awt.*;

public class ColorItemListener implements ItemListener {

    private Color color;

    public ColorItemListener(){
        color = Color.black;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ColorSelectItem selectItem = (ColorSelectItem) e.getItem();
        this.color = selectItem.color;
    }
}
