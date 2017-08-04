package by.bsu.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * # 39 # запуск потока и извлечение результата его выполнения # CalcRunner.java
 * <p>
 * В альтернативной системе управления потоками разработан механизм исполнителей,
 * функции которого заключаются в запуске отдельных потоков и их групп,
 * а также в управлении ими: принудительной остановке, контроле числа работающих
 * потоков и планирования их запуска.
 * <p>
 * Класс ExecutorService методом execute(Runnable thread) запускает традиционные потоки,
 * метод же submit(Callable<T> task) запускает потоки с возвращаемым значением.
 * Метод shutdown() останавливает все запущенные им ранее потоки и
 * прекращает действие самого исполнителя.
 * Статические методы newSingleThreadExecutor() и newFixedThreadPool(int numThreads)
 * класса Executors определяют правила, по которым работает ExecutorService,
 * а именно первый позволяет исполнителю запускать только один поток, второй —
 * не более чем указано в параметре numThreads, ставя другие потоки в очередь
 * ожидания окончания уже запущенных потоков.
 */
public class CalcRunner {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Number> future = es.submit(new CalcCallable());
        es.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}