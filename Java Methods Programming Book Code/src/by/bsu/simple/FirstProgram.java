package by.bsu.simple;

/**
 * # 2 # простое объектно-ориентированное приложение # FirstProgram.java
 */
public class FirstProgram {
    public static void main(String[] args) {
        // объявление и создание объекта firstObject
        SloganAction firstObject = new SloganAction();
        // вызов метода, содержащего вывод строки
        firstObject.printSlogan();
    }
}

/**
 * # 3 # простой класс # SloganAction
 */
class SloganAction {
    void printSlogan() { // определение метода
        // вывод строки
        System.out.println("Enabling the Information Age");
    }
}