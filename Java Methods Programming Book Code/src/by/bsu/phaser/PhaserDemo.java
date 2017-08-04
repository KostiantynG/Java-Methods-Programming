package by.bsu.phaser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

/**
 * # 45 # склад-коллекция # Storage.java
 * <p>
 * Более сложное поведение этого синхронизатора Phaser напоминает поведение CyclicBarrier,
 * однако число участников синхронизации может меняться.
 * Участвующие стороны сначала должны зарегистрироваться phaser-объектом.
 * Регистрация осуществляется с помощью методов register(), bulkRegister(int parties)
 * или подходящего конструктора. Выход из синхронизации phaser-объектом производит
 * метод arriveAndDeregister(), причем выход из числа синхронизируемых
 * сторон может быть и в случае, когда поток завершил выполнение, и в случае,
 * когда поток все еще выполняется. Основным назначением класса Phaser
 * является синхронизация потоков, выполнение которых требуется разбить на
 * отдельные этапы (фазы), а эти фазы, в свою очередь, необходимо синхронизовать.
 * Phaser может как задержать поток, пока другие потоки не достигнут конца
 * текущей фазы методом arriveAndAwaitAdvance(), так и пропустить поток,
 * отметив лишь окончание какой-либо фазы методом arrive().
 */
public class PhaserDemo {
    public static void main(String[] args) {
        // создание коллекцию товаров
        Item[] goods = new Item[20];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = new Item(i + 1);
        }
        List<Item> listGood = Arrays.asList(goods);
        // создание склада, из которого забирают товары
        Storage storageA = Storage.createStorage(listGood.size(), listGood);
        // создание склада, куда перевозят товары
        Storage storageB = Storage.createStorage(listGood.size());
        // создание фазера для синхронизации движения колонны грузовиков
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        // создание колонны грузовиков
        Thread tr1 = new Thread(new Truck(phaser, "tr1", 5, storageA, storageB));
        Thread tr2 = new Thread(new Truck(phaser, "tr2", 6, storageA, storageB));
        Thread tr3 = new Thread(new Truck(phaser, "tr3", 7, storageA, storageB));
        printGoodsToConsole("Товары на складе A", storageA);
        printGoodsToConsole("Товары на складе B", storageB);
        // запуск колонны грузовиков на загрузку на одном складе + поездку +
        // разгрузку на другом складе
        tr1.start();
        tr2.start();
        tr3.start();
        // синхронизация загрузки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка колонны завершена. Фаза " + currentPhase
                + " завершена.");
        // синхронизация поездки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Поездка колонны завершена. Фаза " + currentPhase
                + " завершена.");
        // синхронизация разгрузки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Разгрузка колонны завершена. Фаза " + currentPhase
                + " завершена.");
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Фазы синхронизированы и завершены.");
        }
        printGoodsToConsole("Товары на складе A", storageA);
        printGoodsToConsole("Товары на складе B", storageB);
    }

    public static void printGoodsToConsole(String title, Storage storage) {
        System.out.println(title);
        Iterator<Item> goodIterator = storage.iterator();
        while (goodIterator.hasNext()) {
            System.out.print(goodIterator.next().getRegistrationNumber() + " ");
        }
        System.out.println();
    }
}