package by.bsu.console;

import java.util.Scanner;

public class RunScanner {
	public static void main(String[] args) {
		System.out.print("������� ���� ��� � ������� <Enter>:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("������, " + name + "!");
		scan.close();
	}
}