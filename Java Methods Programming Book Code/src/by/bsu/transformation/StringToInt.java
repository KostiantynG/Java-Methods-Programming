package by.bsu.transformation;

public class StringToInt {
	public static void main(String[] args) {
		String arg = "71"; // 071 ��� 0x71��� 0b1000111
		try {
			int value1 = Integer.parseInt(arg); // ���������� int
			int value2 = Integer.valueOf(arg); // ���������� Integer
			int value3 = Integer.decode(arg); // ���������� Integer
			int value4 = new Integer(arg); /*
											 * ������� Integer, ���
											 * �������������� ����������� �����
											 */
		} catch (NumberFormatException e) {
			System.err.println("�������� ������ ����� " + e);
		}
	}
}