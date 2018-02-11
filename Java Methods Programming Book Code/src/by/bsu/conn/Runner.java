package by.bsu.conn;

/**
 * # 3 # генерация исключений # Connector.java # Runner.java # SameResource.java
 */
public class Runner {
    public static void main(String[] args) {
        SameResource f = new SameResource(); // SameResource f = null;
        try {// необязателен только при гарантированной корректности значения параметра
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.print("обработка unchecked-исключения вне метода: " + e);
        }
    }
}