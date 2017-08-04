package by.bsu.future;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * # 38 # поток с возвращением результата # CalcCallable.java
 *
 * Интерфейс Callable представляет поток, возвращающий значение вызывающему потоку.
 * Определяет один метод V call() throws Exception, в код реализации
 * которого и следует поместить решаемую задачу. Результат выполнения метода
 * call() может быть получен через экземпляр класса Future, методами V get() или
 * V get(long timeout, TimeUnit unit), как и продемонстрировано в предыдущем
 * примере. Перед извлечением результатов работы потока Callable можно проверить,
 * завершилась ли задача успешно, методами isDone() и isCancelled() соответственно.
 */
public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        Number res = new Random().nextGaussian(); // имитация вычислений
        return res;
    }
}