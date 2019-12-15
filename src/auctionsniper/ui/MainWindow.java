package auctionsniper.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MainWindow extends JFrame {

    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
    private static final String STATUS_JOINIG = "Joining";
    private static final String SNIPER_STATUS_NAME = "sniper status";
    private final JLabel sniperStatus = createLabel(STATUS_JOINIG);

    public MainWindow() {
        super("Auction Sniper");
        setName(MAIN_WINDOW_NAME);
        add(sniperStatus);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private static JLabel createLabel(String initialText) {
        JLabel result = new JLabel(initialText);
        result.setName(SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }
}
