package auctionsniper;

import auctionsniper.ui.MainWindow;

import javax.swing.*;

public class Main {

    public static final String SNIPER_STATUS_NAME = "Sniper status name";
    private MainWindow ui;

    public Main() throws Exception {
        startUserInterface();
    }

    public static void main(String... args) throws Exception {
        Main main = new Main();
    }

    private void startUserInterface() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                ui = new MainWindow();
            }
        });

    }

}
