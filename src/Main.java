import draw.PaintPanelListener;

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
        String[] colors = {"Black", "Red"};
        JComboBox<String> colorMenuButton = new JComboBox<>(colors);
        menuPanel.add(colorMenuButton);

        frame.add(menuPanel);

        // 描画パレット
        JPanel paintPanel = new JPanel();
        paintPanel.setBounds(0,menuHeight, frameLength,frameLength - menuHeight);

        // 描画リスナー
        PaintPanelListener paintPanelListener = new PaintPanelListener(paintPanel);
        paintPanel.addMouseListener(paintPanelListener);
        paintPanel.addMouseMotionListener(paintPanelListener);

        frame.add(paintPanel);


        frame.setVisible(true);//表示
    }
}
