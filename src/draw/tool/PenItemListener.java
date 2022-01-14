package draw.tool;

import draw.tool.basic.BasicPen;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PenItemListener implements ItemListener {

    private DrawTool pen;

    public PenItemListener(){
        pen = new BasicPen();
    }

    public DrawTool getPen() {
        return pen;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        PenSelectItem selectItem = (PenSelectItem) e.getItem();
        this.pen = selectItem.getDrawTool();
    }
}
