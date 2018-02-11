package by.bsu.gc;

/**
 * # 16 # класс Manager с поддержкой finalization # Manager.java # FinalizeDemo.java
 */
public class Manager {
    private int id;
    public Manager(int value) {
        id = value;
    }
    protected void finalize() throws Throwable {
        try {
            // код освобождения ресурсов
            System.out.println("объект будет удален, id=" + id);
        } finally {
            super.finalize();
        }
    }
}