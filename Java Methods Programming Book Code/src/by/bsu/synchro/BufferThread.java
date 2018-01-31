package by.bsu.synchro;

/**
 * # 14 # потокобезопасность класса StringBuffer # BufferThread.java
 */
public class BufferThread {
    private static final StringBuffer buffer = new StringBuffer(); // заменить на StringBuilder и посмотреть, что будет
    private static int counter = 0;

    public static void main(String args[]) throws InterruptedException {
        new Thread(() -> {
            synchronized (buffer) {
                while (BufferThread.counter++ < 3) {
                    buffer.append("A");
                    System.out.print("> " + counter + " ");
                    System.out.println(buffer);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.err.print(e);
                    }
                }
            } // конец synchronized-блока
        }).start();
        Thread.sleep(100);
        while (BufferThread.counter++ < 6) {
            System.out.print("< " + counter + " ");
            // в этом месте поток main будет ждать освобождения блокировки объекта buffer
            buffer.append("B");
            System.out.println(buffer);
        }
    }
}