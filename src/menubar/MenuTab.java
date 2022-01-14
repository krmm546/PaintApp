package menubar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuTab<T> {
    private final JMenu menu;

    private final ArrayList<ItemListener> itemListeners = new ArrayList<>();

    public MenuTab(T[] items, String title) {
        menu = new JMenu(title);
        for (T item: items) {
            JMenuItem menuItem = new JMenuItem(item.toString());
            menuItem.addActionListener(new PushedListener(item));
            menu.add(menuItem);
        }
    }

    public void addItemListener(ItemListener added) {
        itemListeners.add(added);
    }

    public void setMenuBar(JMenuBar bar) {
        bar.add(menu);
    }

    private class PushedListener implements ActionListener {

        private final T item;

        PushedListener(T item) {
            this.item = item;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (ItemListener listener: itemListeners) {
                listener.itemStateChanged(new ItemEvent(item));
            }
        }
    }
}

