package by.bsu.console;

public class ReadCharRunner {
	public static void main(String[] args) {
		int x;
		try {
			System.out.print("Введте символ и нажмите <Enter>: ");
			x = System.in.read();
			char c = (char) x;
			System.out.println("Код символа: " + c + " =" + x);
		} catch (java.io.IOException e) {
			System.err.println("ошибка ввода " + e);
		}
	}
}