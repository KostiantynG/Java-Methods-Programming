package by.bsu.wrapper;

/**
 * # 4 # класс-оболочка для класса String # WrapperString.java
 */
public class WrapperString {
    private String str;

    public WrapperString() {
        str = new String();
    }

    public WrapperString(String s) {
        str = new String(s);
    }

    public int indexOf(int arg) { // делегированный метод
        // новая функциональность
        return arg;
    }
    // другие делегированные методы
}