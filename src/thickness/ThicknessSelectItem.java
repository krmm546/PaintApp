package thickness;

public class ThicknessSelectItem {

    private final String labelName;
    public final float thickness;

    public ThicknessSelectItem(String labelName, float thickness){
        this.labelName = labelName;
        this.thickness = thickness;
    }

    public String toString(){
        return labelName;
    }
}
