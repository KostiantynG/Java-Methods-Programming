package by.bsu.simple;

public class FirstProgram {
	public static void main(String[] args) { // ���������� � �������� �������
												// firstObject
		SloganAction firstObject = new SloganAction(); // ����� ������,
														// ����������� �����
														// ������
		firstObject.printSlogan();
	}
}

class SloganAction {
	void printSlogan() { // ����������� ������
		System.out.println("Enabling the Information Age");// ����� ������
	}
}