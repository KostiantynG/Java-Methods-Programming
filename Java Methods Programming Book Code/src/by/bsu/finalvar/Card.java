package by.bsu.finalvar;

public class Card { // ������������������ ��������� ����������
	public final int ID = (int) (Math.random() * 10_000_000); // ��������������������
																// ���������
	public final long BANK_ID; // ������������� �� ��������� �� ������������! //
								// { BANK_ID = 11111111L; } // ������ ����
								// ���!!!

	public Card(long id) { // ������������� � ������������
		BANK_ID = id; // ������ ���� ���!!!
	}

	public final boolean checkRights(final int NUMBER) {
		final int CODE = 72173394; // ����������: "��������� �����"
		// ID = 1; // ������ ����������!
		// NUMBER = 1; // ������ ����������! //
		// CODE = 1; // ������ ����������!
		return CODE == NUMBER + ID;
	}
}
