package by.bsu.future;

import java.util.ArrayDeque;

/**
 * # 40 # список обрабатываемых объектов # ProductList.java
 */
public class ProductList {
    private static ArrayDeque<String> arr = new ArrayDeque<String>() {
        {
            this.add("Product 1");
            this.add("Product 2");
            this.add("Product 3");
            this.add("Product 4");
            this.add("Product 5");
        }
    };

    public static String getProduct() {
        return arr.poll();
    }
}