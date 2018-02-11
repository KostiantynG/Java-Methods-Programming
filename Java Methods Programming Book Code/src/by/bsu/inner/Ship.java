package by.bsu.inner;

/**
 * # 1 # объявление внутреннего класса и использование его в качестве поля
 * как поля #Ship.java
 */
public class Ship {
    // поля и конструкторы
    private Engine eng;

    public final void init() { // метод внешнего класса
        eng = new Engine();
        eng.launch();
    }

    // abstract, final, private, protected - допустимы
    public class Engine { // определение внутреннего (inner) класса
        // поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    } // конец объявления внутреннего класса
}