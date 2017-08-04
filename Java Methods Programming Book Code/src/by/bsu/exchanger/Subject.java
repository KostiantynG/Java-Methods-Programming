package by.bsu.exchanger;

import java.util.concurrent.Exchanger;

/**
 * # 30 # содержит Exchanger и представляет основу для производителя и потребителя # Subject.java
 */
public class Subject {
    protected static Exchanger<Item> exchanger = new Exchanger<>();
    protected Item item;
    private String name;

    public Subject(String name, Item item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}