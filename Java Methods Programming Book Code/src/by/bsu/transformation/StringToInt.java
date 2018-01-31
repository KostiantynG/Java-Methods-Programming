package by.bsu.transformation;

/**
 * # 6 # преобразование строки в целое число # StringToInt.java
 */
public class StringToInt {
    public static void main(String[] args) {
        String arg = "71"; // 071 или 0x71или 0b1000111
        try {
            int value1 = Integer.parseInt(arg); // возвращает int
            int value2 = Integer.valueOf(arg); // возвращает Integer
            int value3 = Integer.decode(arg); // возвращает Integer
            int value4 = new Integer(arg); /* создает Integer,
                                        для преобразования применяется редко */
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }
        //Обратное преобразование из типизированного значения (в частности int)
        //в строку можно выполнить следующими способами:
        int value = 71;
        String arg1 = Integer.toString(value); // хороший способ
        String arg2 = String.valueOf(value); // хороший способ
        String arg3 = "" + value; // плохой способ

        Integer iob = 71; // эквивалентно Integer iob = new Integer(71);


    }
}