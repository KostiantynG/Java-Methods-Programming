package by.bsu.fund.action;

import by.bsu.fund.bean.Coin;

public class CompareCoin {
	public void compareDiameter(Coin first, Coin second) {
		double delta = first.getDiameter() - second.getDiameter();
		if (delta == 0) {
			System.out.println("������ ����� ���������� �������");
		} else if (delta > 0) {
			System.out.println("������ ������ ������ ������ �� " + delta);
		} else {
			System.out.println("������ ������ ������ ������ �� " + -delta);
		}
	}
}