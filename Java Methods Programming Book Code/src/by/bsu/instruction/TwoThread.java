package by.bsu.instruction;

/**
 * # 13 # блокировка объекта потоком # TwoThread.java
 */
public class TwoThread {
    public static int counter = 0;

    public static void main(String args[]) {
        final StringBuilder stringBuilder = new StringBuilder();
        new Thread() {
            public void run() {
                synchronized (stringBuilder) {
                    do {
                        stringBuilder.append("A");
                        System.out.println(stringBuilder);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            System.err.print(e);
                        }
                    } while (TwoThread.counter++ < 2);
                } // конец synchronized
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized (stringBuilder) {
                    while (TwoThread.counter++ < 6) {
                        stringBuilder.append("B");
                        System.out.println(stringBuilder);
                    }
                } // конец synchronized
            }
        }.start();
    }
}