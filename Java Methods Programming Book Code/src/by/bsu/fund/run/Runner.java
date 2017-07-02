package by.bsu.fund.run;

import by.bsu.fund.bean.Coin;
import by.bsu.fund.action.CompareCoin;

/**
 * # 10 # создание объекта, доступ к полям и методам объекта # CompareCoin.java
 * # Runner.java
 */

public class Runner {
	public static void main(String[] args) {
		Coin ob1 = new Coin();
		ob1.setDiameter(-0.11); // сообщение о неправильных данных
		ob1.setDiameter(0.12); // корректно
		ob1.setWeight(150);
		Coin ob2 = new Coin();
		ob2.setDiameter(0.21);
		ob2.setWeight(170);
		CompareCoin ca = new CompareCoin();
		ca.compareDiameter(ob1, ob2);
	}
}

// # 8 # демонстрация последствий нарушения инкапсуляции # Runner.java
//public class Runner {
//	public static void main(String[ ] args) {
//		Coin ob = new Coin();
//		ob.diameter = -0.12; // некорректно: прямой доступ
//		ob.setWeight(100);
//		// ob.weight = -150; // поле недоступно: compile error
//	}
//}