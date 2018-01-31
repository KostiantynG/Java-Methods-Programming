package by.bsu.enums;

/**
 * # 20 # конструкторы и члены перечисления # TaxiStation.java # TaxiRunner.java
 * <p>
 * Каждый элемент enum может использовать методы:
 * static enumType[] values() — возвращает массив, содержащий все элементы
 * перечисления в порядке их объявления;
 * static <T extends Enum<T>> T valueOf(Class<T> enumType, String arg) —
 * создает элемент перечисления, соответствующий заданному типу и значению
 * передаваемой строки;
 * static enumType valueOf(String arg) — создает элемент перечисления,
 * соответствующий значению передаваемой строки;
 * int ordinal() — возвращает позицию элемента перечисления;
 * String name() — возвращает имя элемента;
 * int compareTo(T obj) — сравнивает элементы на больше-меньше либо равно.
 * А именно:
 * TaxiStation ts = TaxiStation.valueOf(TaxiStation.class,"Volvo".toUpperCase());
 * Класс перечисления может содержать методы, и, следовательно, экземпляры
 * перечисления могут к этим методам обращаться.
 */
public class TaxiRunner {
    public static void main(String[] args) {
        //TaxiStation ts = TaxiStation.valueOf(TaxiStation.class,"Volvo".toUpperCase());
        TaxiStation ts = TaxiStation.VOLVO;
        System.out.println(ts + " : ordinal -> " + ts.ordinal());
        ts.setFreeCabs(3);
        TaxiStation[] station = TaxiStation.values();
        for (TaxiStation element : station) {
            System.out.println(element);
        }
    }
}