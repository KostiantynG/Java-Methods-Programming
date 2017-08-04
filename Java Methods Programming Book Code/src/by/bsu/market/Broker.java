package by.bsu.market;

/**
 * # 10 # получатель значения атомарного поля # Broker.java
 */
public class Broker extends Thread {
    private static final int PAUSE = 500; // in millis
    private Market market;

    public Broker(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(getName() + " Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}