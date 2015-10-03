package by.bsu.template;

public class Runner {
	public static void main(String[] args) { // параметризаци€ типом Integer
		Message<Integer> ob1 = new Message<Integer>();
		ob1.setValue(1); // возможен только тип Integer дл€ метода setValue
		int v1 = ob1.getValue();
		System.out.println(v1); // параметризаци€ типом String
		Message<String> ob2 = new Message<String>("Java");
		String v2 = ob2.getValue();
		System.out.println(v2); // ob1 = ob2; // ошибка компил€ции Ц
								// параметризаци€ нековариантна

		// параметризаци€ по умолчанию Ц Object
		Message ob3 = new Message(); // warning Ц raw type ob3 = ob1; // нет
										// ошибки компил€ции Ц нет
										// параметризации
		System.out.println(ob3.getValue());
		ob3.setValue(new Byte((byte) 1));
		ob3.setValue("Java SE 7");
		System.out.println(ob3);
		/* выводитс€ тип объекта, а не тип параметризации */ ob3.setValue(71);
		System.out.println(ob3);
		ob3.setValue(null);
	}
}