package by.bsu.auction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CyclicBarrier;

/**
 * # 23 # определение барьера и действия по его окончании # Auction.java
 * <p>
 * Процесс проведения аукциона подразумевает корректное использование класса CyclicBarrier.
 * <p>
 * Класс Auction определяет список конкурирующих предложений от клиентов и размер барьера.
 * Чтобы приложение работало корректно, необходимо,
 * чтобы размер списка совпадал со значением константы BIDS_NUMBER.
 * Барьер инициализируется потоком определения победителя торгов, который
 * запустится после того, как все предложения будут объявлены. Если потоков
 * будет запущено больше чем размер барьера, то «лишние» предложения могут
 * быть не учтены при вычислении победителя, если же потоков будет меньше,
 * то приложение окажется в состоянии deadlock. Для предотвращения подобных
 * ситуаций следует использовать метод await() с параметрами.
 */
public class Auction {
    public final int BIDS_NUMBER = 5;
    private ArrayList<Bid> bids;
    private CyclicBarrier barrier;

    public Auction() {
        this.bids = new ArrayList<>();
        this.barrier = new CyclicBarrier(this.BIDS_NUMBER, () -> { //() -> new Runnable() and @Override run
            Bid winner = Auction.this.defineWinner();
            System.out.println("Bid #" + winner.getBidId() + ", price:" + winner.getPrice() + " win!");
        });
    }

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public boolean add(Bid e) {
        return bids.add(e);
    }

    public Bid defineWinner() {
        return Collections.max(bids, (ob1, ob2) -> ob1.getPrice() - ob2.getPrice()); // new Comparator<Bid>() and @Override int compare(Bid ob1, Bid ob2)
    }
}