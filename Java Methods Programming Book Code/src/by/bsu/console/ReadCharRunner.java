package by.bsu.console;

public class ReadCharRunner {
	public static void main(String[] args) {
		int x;
		try {
			System.out.print("������ ������ � ������� <Enter>: ");
			x = System.in.read();
			char c = (char) x;
			System.out.println("��� �������: " + c + " =" + x);
		} catch (java.io.IOException e) {
			System.err.println("������ ����� " + e);
		}
	}
}