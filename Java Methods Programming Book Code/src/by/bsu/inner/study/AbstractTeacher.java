package by.bsu.inner.study;

/**
 * # 6 # внутренний класс, объявленный внутри метода # AbstractTeacher.java
 * # TeacherCreator.java # Teacher.java # TeacherLogic.java # Runner.java
 */
public abstract class AbstractTeacher {
    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    /* методы */
    public abstract boolean excludeStudent(String name);
}