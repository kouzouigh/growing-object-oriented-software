package test.endtoend.auctionsniper;

import auctionsniper.Main;
import auctionsniper.ui.MainWindow;

/**
 * Hide all the messy code for manipulating Swing
 */
public class ApplicationRunner {

    public static final String XMPP_HOSTNAME = "localhost";
    public static final String SNIPER_ID = "sniper";
    public static final String SNIPER_PASSWORD = "sniper";
    private static final String STATUS_LOST = "Lost";
    private AuctionSniperDriver driver;

    public void startBiddingIn(FakeAuctionServer auction) {
        Thread thread = new Thread("Test Application") {
            @Override
            public void run() {
                try {
                    Main.main(XMPP_HOSTNAME, SNIPER_ID, SNIPER_PASSWORD, auction.getItemId());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        thread.setDaemon(true);
        thread.start();
        driver = new AuctionSniperDriver(1000);
        driver.showsSniperStatus(MainWindow.STATUS_JOINIG);
    }

    public void showSniperHasLostAuction() {
        driver.showsSniperStatus(STATUS_LOST);
    }

    public void stop() {
        if (driver != null) {
            driver.dispose();
        }
    }

}
