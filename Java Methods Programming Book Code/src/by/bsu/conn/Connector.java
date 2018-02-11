package by.bsu.conn;

/**
 * # 3 # генерация исключений # Connector.java # Runner.java # SameResource.java
 */
public class Connector {
    public static void loadResource(SameResource f) {
        if (f == null || !f.exists() || !f.isCreate()) {
            throw new IllegalArgumentException(); /* генерация исключения */
            // или собственное, н-р, throw new IllegalResourceException();
        }
        // more code
    }
}