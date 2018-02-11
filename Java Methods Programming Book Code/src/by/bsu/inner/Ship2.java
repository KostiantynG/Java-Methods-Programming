package by.bsu.inner;

/**
 * # 2 # объявление внутреннего класса # Ship.java
 */
public class Ship2 {
    // поля и конструкторы внешнего класса
    public class Engine { // определение внутреннего класса
        // поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    } // конец объявления внутреннего класса
// методы внешнего класса
}