package color;

import java.awt.*;

public class ColorSelectItem {

    private final String labelName;
    public final Color color;

    public ColorSelectItem(String labelName, Color color){
        this.labelName = labelName;
        this.color = color;
    }

    public String toString(){
        return labelName;
    }
}
