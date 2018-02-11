package by.bsu.nested;

/**
 * # 7 # вложенный класс # Ship.java # RunnerShip.java
 */
public class Ship {
    private int id;
    // abstract, final, private, protected - допустимы
    public static class LifeBoat {
        private int boatId;

        public static void down() {
            System.out.println("шлюпки на воду!");
        }

        public void swim() {
            System.out.println("отплытие шлюпки");
        }
    }
}