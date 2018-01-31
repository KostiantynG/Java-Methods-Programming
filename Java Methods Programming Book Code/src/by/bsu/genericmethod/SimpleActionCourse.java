package by.bsu.genericmethod;

/**
 * # 14 # параметризованные конструкторы и методы # SimpleActionCourse.java
 */
public class SimpleActionCourse {
    public <T1 extends Course> SimpleActionCourse(T1 course) { // конструктор
// реализация
    }

    public <T2> SimpleActionCourse() { // конструктор
// реализация
    }

    public <T3 extends Course> float calculateMark(T3 course) {
// реализация
        return 1f;
    }

    public <T4> boolean printReport(T4 course) {
// реализация
        return true;
    }

    public <T5> void check() {
// реализация
    }

    class Course {
// реализация
    }
}