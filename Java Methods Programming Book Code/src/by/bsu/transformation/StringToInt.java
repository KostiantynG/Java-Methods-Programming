package by.bsu.transformation;

public class StringToInt {
	public static void main(String[] args) {
		String arg = "71"; // 071 или 0x71или 0b1000111
		try {
			int value1 = Integer.parseInt(arg); // возвращает int
			int value2 = Integer.valueOf(arg); // возвращает Integer
			int value3 = Integer.decode(arg); // возвращает Integer
			int value4 = new Integer(arg); /*
											 * создает Integer, для
											 * преобразования применяется редко
											 */
			System.out.println(value1 + value2 + value3 + value4);
		} catch (NumberFormatException e) {
			System.err.println("Неверный формат числа " + e);
		}
	}
}