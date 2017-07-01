package by.bsu.collection;

/* # 4 # класс используется здесь и далее для наполнения коллекций # Item.java */

public class Item {
    private int itemId;
    private float price;
    private String name;

    public Item(int itemId, float price, String name) {
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item [itemId =" + itemId + ", price=" + price + ", name=" + name + "]\n";
    }
}