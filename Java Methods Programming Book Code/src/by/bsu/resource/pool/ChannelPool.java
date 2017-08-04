package by.bsu.resource.pool;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;

import by.bsu.resource.exception.ResourсeException;

/**
 * # 18 # пул ресурсов # ChannelPool.java
 * <p>
 * Класс ChannelPool объявляет семафор и очередь из каналов. В методе
 * getResource() производится запрос к семафору, и в случае успешного его прохождения
 * метод извлекает из очереди канал и выдает его в качестве возвращаемого
 * значения метода. Метод returnResource() добавляет экземпляр-канал
 * к очереди на выдачу и освобождает семафор.
 * <p>
 * Реализация принципов пула предоставляет возможность повторного ис-
 * пользования объектов в ситуациях, когда создание нового объекта — дорогостоящая
 * процедура с точки зрения задействованных для этого ресурсов виртуальной машины.
 * Поэтому при возможности следует объект после использования
 * не уничтожать, а возвратить его в так называемый «пул объектов» для повторного
 * использования. Данная стратегия широко используется при организации пула
 * соединений с базой данных. Реализаций организации пулов существует
 * достаточно много с различающимися способами извлечения и возврата объектов,
 * а также способа контроля за объектами и за заполняемостью пула.
 * Поэтому выбрать какое-либо решение как абсолютно лучшее для всех случаев невозможно.
 */
public class ChannelPool<T> {
    private final static int POOL_SIZE = 5; // размер пула
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<T> resources = new LinkedList<T>();

    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }

    public T getResource(long maxWaitMillis) throws ResourсeException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = resources.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourсeException(e);
        }
        throw new ResourсeException(":превышено время ожидания");
    }

    public void returnResource(T res) {
        resources.add(res); // возвращение экземпляра в пул
        semaphore.release();
    }
}