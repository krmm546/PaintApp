import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("paint");
        frame.setSize(500, 500);//windowのサイズ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//×を押した時の動作設定
        frame.setLayout(null);
        frame.setResizable(false);

        frame.setVisible(true);//表示
    }
}
