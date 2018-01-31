package by.bsu.sample;

/**
 * # 8 # поведение статического метода при «переопределении» # Runner.java
 */
public class Runner {
    public static void main(String[] args) {
        // Не верный вызов
        Base ob = new Sub(); // !!!
        // нестатический вызов статического метода
        ob.go(); // предупреждение компилятора о некорректном вызове
        ((Sub) ob).go();

        // Верный вызов
        Base.go();
        Sub.go();
    }
}

class Base {
    public static void go() {
        System.out.println("метод из Base");
    }
}

class Sub extends Base {
    public static void go() {
        System.out.println("метод из Sub");
    }
}