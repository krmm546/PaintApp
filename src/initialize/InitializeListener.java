package initialize;

import color.ColorItemListener;
import color.ColorSelectItem;
import menubar.ItemEvent;
import menubar.ItemListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitializeListener implements ActionListener {

    private final Container background;
    private InitializeListener.ColorItemListener colorItemListener;

    public InitializeListener(Container background){
        this.background = background;
        colorItemListener = new InitializeListener.ColorItemListener(background.getBackground());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        background.setBackground(colorItemListener.color);
        background.setVisible(false);
        background.setVisible(true);
    }

    public ItemListener getColorItemListener() {
        return colorItemListener;
    }

    public static class ColorItemListener implements ItemListener {
        Color color;
        ColorItemListener(Color color) {
            this.color = color;
        }
        @Override
        public void itemStateChanged(ItemEvent e) {
            ColorSelectItem colorItem = (ColorSelectItem)e.getItem();
            this.color = colorItem.color;
        }
    }
}
