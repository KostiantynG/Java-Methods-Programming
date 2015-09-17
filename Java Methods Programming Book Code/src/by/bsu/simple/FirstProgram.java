package by.bsu.simple;

public class FirstProgram {
	public static void main(String[] args) { // объ€вление и создание объекта
												// firstObject
		SloganAction firstObject = new SloganAction(); // вызов метода,
														// содержащего вывод
														// строки
		firstObject.printSlogan();
	}
}

class SloganAction {
	void printSlogan() { // определение метода
		System.out.println("Enabling the Information Age");// вывод строки
	}
}