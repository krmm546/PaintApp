package initialize;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitializeListener implements ActionListener {

    private final Container background;

    public InitializeListener(Container background){
        this.background = background;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        background.setVisible(false);
        background.setVisible(true);
    }
}
