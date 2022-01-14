package draw.tool;

import javax.swing.*;

public class PenSelectItem {
    private final String labelName;
    private final DrawTool drawTool;

    public PenSelectItem(String labelName, DrawTool drawTool){
        this.labelName = labelName;
        this.drawTool = drawTool;
    }

    public String toString(){
        return labelName;
    }

    public DrawTool getDrawTool() {
        return drawTool.init();
    }
}
