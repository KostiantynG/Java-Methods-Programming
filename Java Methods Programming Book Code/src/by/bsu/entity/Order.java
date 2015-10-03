package by.bsu.entity; // класс доступен из других пакетов 

public class Order {
	private int id; // переменна€ экземпл€ра класса
	static int bonus; // переменна€ класса
	public final int MIN_TAX = 8 + (int) (Math.random() * 5); // константа
																// экземпл€ра
																// класса
	public final static int PURCHASE_TAX = 6; // константа класса

	// конструкторы // метод
	public double calculatePrice(double price,
			int counter) { /* параметры метода */
		double amount; // локальна€ переменна€ метода не получает значени€ по
						// умолчанию
		// amount++; // ошибка компил€ции, значение не задано
		amount = (price - bonus) * counter; // инициализаци€ локальной
											// переменной
		double tax = amount * PURCHASE_TAX / 100;
		return id + amount + tax; // возвращаемое значение
	}
}