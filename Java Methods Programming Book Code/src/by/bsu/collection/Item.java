package by.bsu.collection;

/* # 11 # класс-сущность с внутренними классами-компараторами # Item.java # */

import java.util.Comparator;

public class Item {
    private int itemId;
    private float price;
    private String name;

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Item(int itemId, float price, String name) {
        super();
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

    public static class IdComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return one.getItemId() - two.getItemId();
        }
    }

    public static class PriceComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return Double.compare(two.getPrice(), one.getPrice());
        }
    }
}/* # 11 # класс-сущность с внутренними классами-компараторами # Item.java # */
//package by.bsu.collection;
//
///* # 4 # класс используется здесь и далее для наполнения коллекций # Item.java */
//
//public class Item {
//    private int itemId;
//    private float price;
//    private String name;
//
//    public Item(int itemId, float price, String name) {
//        this.itemId = itemId;
//        this.price = price;
//        this.name = name;
//    }
//
//    public int getItemId() {
//        return itemId;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Item [itemId =" + itemId + ", price=" + price + ", name=" + name + "]\n";
//    }
//}