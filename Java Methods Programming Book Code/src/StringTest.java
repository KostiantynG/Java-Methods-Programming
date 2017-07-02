public class StringTest {
    public static void main(String[] args) {
        String s = "clown";
        System.out.println(s);
        // создание нового объекта добавлением символа и значения базового типа
        s += '2';
        System.out.println(s);
        s = s + 4;
        System.out.println(s);
        s += 3.14159D;
        System.out.println(s);
        // перегружен только оператор "+", то есть
        // s-="c"; // ошибка, вычитать строки нельзя. Оператор "-" для строки не перегружен
    }
}
