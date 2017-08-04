package by.bsu.threads;

/**
 * # 1 # расширение класса Thread # TalkThread.java
 */
public class TalkThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7); // остановка на 7 миллисекунд
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}