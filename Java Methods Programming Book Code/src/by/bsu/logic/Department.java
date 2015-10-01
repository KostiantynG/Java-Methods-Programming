package by.bsu.logic;

public class Department {
	{
		System.out.println("logic (1) id=" + this.id); // проверка и
														// инициализаци€
														// параметров
														// конкретного объекта
	}

	static {
		System.out.println(
				"static logic"); /*
									 * проверка и инициализаци€ базовых
									 * параметров, необходимых дл€
									 * функционировани€ приложени€ (класса)
									 */
	}

	private int id = 7;

	public Department(int id) {
		this.id = id;
		System.out.println("конструктор id=" + id);
	}

	public int getId() {
		return id;
	}

	{
		/* не очень хорошее расположение логического блока */ System.out.println("logic (2) id=" + id);
	}
}