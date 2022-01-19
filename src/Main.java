import color.ColorItemListener;
import color.ColorSelectItem;
import draw.PaintPanelListener;
import draw.tool.PenItemListener;
import draw.tool.PenSelectItem;
import draw.tool.basic.BasicPen;
import draw.tool.eraser.Eraser;
import draw.tool.straightline.StraightLinePen;
import draw.tool.triangle.TrianglePen;
import menubar.MenuTab;
import thickness.ThicknessItemListener;
import thickness.ThicknessSelectItem;

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

        // 描画パレット
        JPanel paintPanel = new JPanel();
        paintPanel.setBounds(0,menuHeight, frameLength,frameLength - menuHeight);

        //色の選択ボタン
        ColorSelectItem[] colors = {
                new ColorSelectItem("Black", Color.BLACK),
                new ColorSelectItem("Red", Color.RED),
                new ColorSelectItem("Orange", Color.ORANGE),
                new ColorSelectItem("Yellow", Color.YELLOW),
                new ColorSelectItem("Lime", Color.GREEN),
                new ColorSelectItem("Green", new Color(0, 128,0)),
                new ColorSelectItem("aqua", new Color(0,255,255)),
                new ColorSelectItem("Blue", Color.BLUE),
                new ColorSelectItem("Purple", new Color(128,0,128)),
                new ColorSelectItem("Pink", Color.PINK),
                new ColorSelectItem("White", Color.WHITE),
        };
        ColorItemListener colorItemListener = new ColorItemListener();

        JMenuBar menuBar = new JMenuBar();

        MenuTab<ColorSelectItem> menuTab = new MenuTab<>(colors, "Color");
        menuTab.addItemListener(colorItemListener);
        menuTab.setMenuBar(menuBar);

        menuPanel.add(menuBar);

        // ペンの選択ボタン
        PenSelectItem[] pens = {
                new PenSelectItem("Basic Pen", new BasicPen()),
                new PenSelectItem("Straight Line Pen", new StraightLinePen()),
                new PenSelectItem("Triangle Pen", new TrianglePen()),
                new PenSelectItem("Eraser",
                        new Eraser(
                                paintPanel.getBackground(),
                                new BasicPen()
                        )
                ),
        };

        JComboBox<PenSelectItem> penMenuButton = new JComboBox<>(pens);
        PenItemListener penItemListener = new PenItemListener();
        penMenuButton.addItemListener(penItemListener);
        menuPanel.add(penMenuButton);


        frame.add(menuPanel);

        // 太さの選択ボタン
        ThicknessSelectItem[] thicknesses = {
                new ThicknessSelectItem("Light", 1),
                new ThicknessSelectItem("Normal", 3),
                new ThicknessSelectItem("Bold", 10),
        };

        MenuTab<ThicknessSelectItem> thicknessMenuButton = new MenuTab<>(thicknesses, "Thickness");
        ThicknessItemListener thicknessItemListener = new ThicknessItemListener();
        thicknessMenuButton.addItemListener(thicknessItemListener);
        thicknessMenuButton.setMenuBar(menuBar);

        // 描画リスナー
        PaintPanelListener paintPanelListener = new PaintPanelListener(paintPanel, colorItemListener, penItemListener, thicknessItemListener);
        paintPanel.addMouseListener(paintPanelListener);
        paintPanel.addMouseMotionListener(paintPanelListener);

        frame.add(paintPanel);


        frame.setVisible(true);//表示
    }
}
