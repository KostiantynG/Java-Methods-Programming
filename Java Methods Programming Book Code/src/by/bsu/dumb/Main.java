package by.bsu.dumb;

/**
 * # 2 # вызов полиморфного метода из конструктора # Dumb.java # Dumber.java
 */
public class Main {
    public static void main(String[] args) {
        Dumb objA = new Dumber();
        System.out.println("\n" + "Dumb.id = " + (objA.id));
        System.out.println("\n" + "Dumber.id = " + ((Dumber) objA).id);
    }
}