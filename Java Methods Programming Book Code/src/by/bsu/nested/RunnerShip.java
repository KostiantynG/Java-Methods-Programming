package by.bsu.nested;

/**
 * # 7 # вложенный класс # Ship.java # RunnerShip.java
 */
public class RunnerShip {
    public static void main(String[] args) {
        // вызов статического метода
        Ship.LifeBoat.down();
        // создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        // вызов обычного метода
        lifeBoat.swim();
    }
}