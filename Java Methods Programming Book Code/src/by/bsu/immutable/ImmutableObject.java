package by.bsu.immutable;

/**
 * # 21 # класс для создания неизменяемых объектов # ImmutableObject.java
 */
public class ImmutableObject {
    private String name;
    private int id;

    public ImmutableObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}