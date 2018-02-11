package by.bsu.strings;

/**
 * # 6 # изменение объекта StringBuilder # RefStringBuilder.java
 */
public class RefStringBuilder {
    public static void changeStr(StringBuilder s) {
        s.append(" Certified");
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Oracle");
        changeStr(str);
        System.out.println(str);
    }
}