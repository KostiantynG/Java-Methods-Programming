package by.bsu.resource.pool;

/**
 * # 19 # канал — ресурс: обычный класс с некоторой информацией # AudioChannel.java
 * <p>
 * Класс AudioChannel предлагает простейшее описание канала и его использования.
 */
public class AudioChannel {
    private int сhannellId;

    public AudioChannel(int id) {
        this.сhannellId = id;
    }

    public int getСhannellId() {
        return сhannellId;
    }

    public void setСhannellId(int id) {
        this.сhannellId = id;
    }

    public void using() {
        try {
            // использование канала
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}