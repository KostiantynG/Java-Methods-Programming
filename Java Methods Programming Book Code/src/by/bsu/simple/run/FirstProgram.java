package by.bsu.simple.run;

import by.bsu.simple.action.SloganAction; // подключение класса из пакета

public class FirstProgram {
	public static void main(String[] args) {
		SloganAction firstObject = new SloganAction();
		firstObject.printSlogan();
	}
}