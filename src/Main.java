import color.ColorItemListener;
import color.ColorSelectItem;
import draw.PaintPanelListener;
import draw.tool.PenItemListener;
import draw.tool.PenSelectItem;
import draw.tool.basic.BasicPen;
import draw.tool.straightline.StraightLinePen;
import draw.tool.triangle.TrianglePen;

import java.awt.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int frameLength = 500;

        // フレーム
        JFrame frame = new JFrame("paint");
        frame.setSize(frameLength, frameLength);//windowのサイズ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//×を押した時の動作設定
        frame.setLayout(null);
        frame.setResizable(false);

        int menuHeight = (int)(frameLength * 0.12);

        // メニュー
        JPanel menuPanel = new JPanel();
        menuPanel.setBounds(0, 0, frameLength, menuHeight);
        menuPanel.setBackground(Color.gray);

        //色の選択ボタン
        ColorSelectItem[] colors = {
                new ColorSelectItem("Black", Color.BLACK),
                new ColorSelectItem("Red", Color.RED)
        };

        JComboBox<ColorSelectItem> colorMenuButton = new JComboBox<>(colors);
        ColorItemListener colorItemListener = new ColorItemListener();
        colorMenuButton.addItemListener(colorItemListener);
        menuPanel.add(colorMenuButton);

        // ペンの選択ボタン
        PenSelectItem[] pens = {
                new PenSelectItem("Basic Pen", new BasicPen()),
                new PenSelectItem("Straight Line Pen", new StraightLinePen()),
                new PenSelectItem("Triangle Pen", new TrianglePen())
        };

        JComboBox<PenSelectItem> penMenuButton = new JComboBox<>(pens);
        PenItemListener penItemListener = new PenItemListener();
        penMenuButton.addItemListener(penItemListener);
        menuPanel.add(penMenuButton);


        frame.add(menuPanel);

        // 描画パレット
        JPanel paintPanel = new JPanel();
        paintPanel.setBounds(0,menuHeight, frameLength,frameLength - menuHeight);

        // 描画リスナー
        PaintPanelListener paintPanelListener = new PaintPanelListener(paintPanel, colorItemListener, penItemListener);
        paintPanel.addMouseListener(paintPanelListener);
        paintPanel.addMouseMotionListener(paintPanelListener);

        frame.add(paintPanel);


        frame.setVisible(true);//表示
    }
}
