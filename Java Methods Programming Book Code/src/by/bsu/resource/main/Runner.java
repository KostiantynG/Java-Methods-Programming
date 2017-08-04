package by.bsu.resource.main;

import java.util.LinkedList;

import by.bsu.resource.pool.AudioChannel;
import by.bsu.resource.pool.ChannelPool;
import by.bsu.resource.pool.Client;

/**
 * # 22 # запуск и использование пула # Runner.java
 * <p>
 * Для демонстрации работы семафора предлагается задача о пуле ресурсов
 * с ограниченным числом, в данном случае аудиоканалов, и значительно бо́льшим
 * числом клиентов, желающих воспользоваться одним из каналов. Каждый клиент
 * получает доступ к каналу, причем пользоваться можно только одним каналом.
 * Если все каналы заняты, то клиент ждет в течение заданного интервала времени.
 * Если лимит ожидания превышен, генерируется исключение и клиен уходит,
 * так и не воспользовавшись услугами пула.
 * <p>
 * Класс Runner демонстрирует работу пула ресурсов аудиоканалов. При за-
 * полнении очереди каналов в данном решении необходимо следить, чтобы число
 * каналов, передаваемых списком в конструктор класса ChannelPool, совпадало
 * со значением константы POOL_SIZE этого же класса. Константа используется
 * для инициализации семафора и при большем или меньшем размерах передаваемого
 * списка возникают коллизии, которые, кстати, есть смысл спровоцировать
 * и разобраться в причинах и следствиях.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>() {
            {
                this.add(new AudioChannel(771));
                this.add(new AudioChannel(883));
                this.add(new AudioChannel(550));
                this.add(new AudioChannel(337));
                this.add(new AudioChannel(442));
            }
        };
        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}