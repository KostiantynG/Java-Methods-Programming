package by.bsu.finalvar;

public class Card { // инициализированна€ константа экземпл€ра
	public final int ID = (int) (Math.random() * 10_000_000); // неинициализированна€
																// константа
	public final long BANK_ID; // инициализаци€ по умолчанию не производитс€! //
								// { BANK_ID = 11111111L; } // только один
								// раз!!!

	public Card(long id) { // инициализаци€ в конструкторе
		BANK_ID = id; // только один раз!!!
	}

	public final boolean checkRights(final int NUMBER) {
		final int CODE = 72173394; // антишаблон: "¬олшебное „исло"
		// ID = 1; // ошибка компил€ции!
		// NUMBER = 1; // ошибка компил€ции! //
		// CODE = 1; // ошибка компил€ции!
		return CODE == NUMBER + ID;
	}
}
