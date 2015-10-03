package by.bsu.transfer.transfer;

import by.bsu.transfer.bean.Account;

public class Runner {
	public static void main(String[] args) {

		Account from = new Account(78031864L, 258.5);
		Account to = new Account(58510009L, 12.1);
		TransferAction action = new TransferAction(52.0);
		boolean complete = action.transferIntoAccount(from, to);
		if (complete) {
			System.out.println("�����: " + action.getTransactionAmount() + " ���������� �������");
			System.out.print("�� ����� ������� ID=" + to.getId());
			System.out.println(" ��������� �����: " + to.getAmount());
		} else {
			System.out.println("���������� �� ���������.");
			System.out.print("�� ����� ������� ID=" + from.getId());
			System.out.println(" ������������ �������.");
		}
	}
}