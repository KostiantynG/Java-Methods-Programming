package by.bsu.future;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * # 42 # запуск пула потоков и извлечение результатов их работы # RunExecutor.java
 */
public class RunExecutor {
    public static void main(String[] args) throws Exception {
        ArrayList<Future<String>> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 7; i++) {
            list.add(executorService.submit(new BaseCallable()));
        }
        executorService.shutdown();
        for (Future<String> future : list) {
            System.out.println(future.get() + " result fixed");
        }
    }
}